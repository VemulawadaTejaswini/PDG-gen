import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 所持カード枚数を取得
		Scanner sc = new Scanner(System.in);
		int cards = sc.nextInt();

		// 絵柄ごとのリストをつくる
		ArrayList<Integer> spadelist = new ArrayList<>();
		ArrayList<Integer> heartlist = new ArrayList<>();
		ArrayList<Integer> clublist = new ArrayList<>();
		ArrayList<Integer> diamondlist = new ArrayList<>();

		// 所持カードを絵柄ごとに分ける
		for (int cnt = 1; cnt <= cards; cnt++) {
			// 所持カードの絵柄と数字を取得
			String suit = sc.next();
			int num = sc.nextInt();

			// 所持カードの絵柄ごとのリストを作成
			if (suit.equals("S")) {
				spadelist.add(num);
				Collections.sort(spadelist);
			}

			if (suit.equals("H")) {
				heartlist.add(num);
				Collections.sort(heartlist);
			}

			if (suit.equals("C")) {
				clublist.add(num);
				Collections.sort(clublist);
			}

			if (suit.equals("D")) {
				diamondlist.add(num);
				Collections.sort(diamondlist);
			}
		}

		// 所持してないカードを表示
		for (int i = 1; i <= 13; i++) {
			if (!(spadelist.contains(i))) {
				System.out.println("S" + " " + i);
			}
		}

		for (int i = 1; i <= 13; i++) {
			if (!(heartlist.contains(i))) {
				System.out.println("H" + " " + i);
			}
		}

		for (int i = 1; i <= 13; i++) {
			if (!(clublist.contains(i))) {
				System.out.println("C" + " " + i);
			}
		}

		for (int i = 1; i <= 13; i++) {
			if (!(diamondlist.contains(i))) {
				System.out.println("D" + " " + i);
			}
		}
	}
}
