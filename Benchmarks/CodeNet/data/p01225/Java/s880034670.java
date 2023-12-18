import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	// カードの色の種類
	enum Color {
		R, G, B;
	}

	// 勝利条件(ペア数)
	final static int VictoryCondition = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力回数の入力
		int inputCount = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < inputCount; i++) {
			// 9枚のカードを入力(1行目に数字、2行目に色)
			ArrayList<Card> hand = inputHand(sc.nextLine(), sc.nextLine());

			// 勝利判定・出力
			if (VictoryDecision(hand)) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}

		sc.close();
	}

	// 2行の入力(数字、色)からカードを生成し、リストにして返す
	private static ArrayList<Card> inputHand(String numLine, String colorLine) {
		String[] colorStr = colorLine.split("[\\s]+");
		String[] numStr = numLine.split("[\\s]+");
		ArrayList<Card> hand = new ArrayList<Card>();
		for (int i = 0; i < numStr.length; i++) {
			hand.add(new Card(Integer.parseInt(numStr[i]), Color.valueOf(colorStr[i])));
		}
		return hand;
	}

	// カードリストから3枚1組のペア3つができるか判定
	static boolean VictoryDecision(ArrayList<Card> hand) {
		// 色ごとのリストを作成し、数字を格納する
		ArrayList<Integer> r = new ArrayList<Integer>();
		ArrayList<Integer> g = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (Card c : hand) {
			switch (c.color) {
			case R:
				r.add(c.num);
				break;
			case G:
				g.add(c.num);
				break;
			case B:
				b.add(c.num);
				break;
			}
		}

		// それぞれのリストからペアの数を判定し、合計が3であるか
		if (VictoryCondition == PairSearch(r) + PairSearch(g) + PairSearch(b)) {
			return true;
		}

		return false;

	}

	// リストからペアを見つけ、ペア数を返す
	static int PairSearch(ArrayList<Integer> list) {
		int pairCount = 0;
		// カードが3枚未満の場合終了
		while (list.size() >= 3) {
			// 昇順にソート
			Collections.sort(list);

			// 連番判定用のリスト内の最小値+1のカードの添え字(ない場合は-1が格納される)
			int secondIndex = Arrays.binarySearch(list.toArray(), list.get(0) + 1);
			// 連番判定用のリスト内の最小値+2のカードの添え字(ない場合は-1が格納される)
			int thirdIndex = Arrays.binarySearch(list.toArray(), list.get(0) + 2);

			// 連番のペアがあるか
			if (secondIndex > 0 && thirdIndex > 0) {
				// ペア数をカウントアップし、ペアをリストから除外
				pairCount++;
				list.remove(thirdIndex);
				list.remove(secondIndex);
				list.remove(0);
				// 同じカードのペアがあるか
			} else if (list.get(0) == list.get(1) && list.get(0) == list.get(2)) {
				// ペア数をカウントアップし、ペアをリストから除外
				pairCount++;
				list.remove(2);
				list.remove(1);
				list.remove(0);
			} else {
				// ペアが見つからないため、リストから除外
				list.remove(0);
			}
		}
		return pairCount;

	}

	// カードクラス(数字、色)
	static class Card {
		int num;
		Color color;

		Card(int num, Color color) {
			this.num = num;
			this.color = color;
		}
	}
}

