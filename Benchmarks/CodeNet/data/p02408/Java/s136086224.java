
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//
		int taro_card_number = 0;
		String[] mark = { "spades", "heart", "clover", "diya" };
		String[] array_name = { "S", "H", "C", "D" };

		// // トランプの各マークの配列を作る//
		// for (String val : tramp) {
		// tramp val = new tramp();
		// }

		// トランプの各マークの配列を作る
		tramp spades = new tramp();
		spades.setMark("S");
		tramp.tramp_all.add(spades);

		tramp heart = new tramp();
		heart.setMark("H");
		tramp.tramp_all.add(heart);

		tramp clover = new tramp();
		clover.setMark("C");
		tramp.tramp_all.add(clover);

		tramp diya = new tramp();
		diya.setMark("D");
		tramp.tramp_all.add(diya);

		// テキスト入力
		Scanner sc = new Scanner(System.in);
		// タローが持っているカードの数
		while (sc.hasNext()) {
			taro_card_number = sc.nextInt();

			// ループ処理(カードの数だけ回す)
			for (int i = 0; i < taro_card_number; i++) {

				// 図柄
				String design = sc.next();
				// 数
				int number = sc.nextInt();

				for (tramp val : tramp.tramp_all) {

					// マークの指定に従い、数字を配列に格納
					if (design.equals(val.getMark())) {
						//
						int[] hoge = val.getCard();
						hoge[number - 1] = 1;
					}
				}

			}
			// //配列に入力情報が格納されたので、入力情報にないものをピックアップして出力

			// スペードから順にないものを出力
			for (tramp val : tramp.tramp_all) {
				// ないものをピックアップ
				for (int i = 0; i < 13; i++) {
					if (val.getCard()[i] == 0) {
						System.out.println(val.getMark()+ " " + (i + 1));
					}
				}
			}

		}
	}

}

// それぞれのマークについて扱う
class tramp {

	// マーク名
	private String mark = "";

	// 各マークのカードを作る
	private int[] card = new int[13];

	// 全部のカード
	public static ArrayList<tramp> tramp_all = new ArrayList<tramp>();

	// セッター
	public void setMark(String m) {
		mark = m;
		// tramp_all.add(m);
	}

	// ゲッター
	public String getMark() {
		return mark;
	}

	public int[] getCard() {
		return card;
	}

	// と数を取ってきて、配列に格納する
	public void set_property(int[] design, int number) {
		design[number - 1] = 1;
	}

}