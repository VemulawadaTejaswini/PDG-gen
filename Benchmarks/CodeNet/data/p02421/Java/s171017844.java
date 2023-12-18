package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Card_Game {

	public static void main(String[] args) {

		//
		int matches = 0;
		// 対戦者達
		String[] players = { "太郎", "花子" };
		// 対戦者達のインスタンスを入れるリスト
		ArrayList<player> players_beans = new ArrayList<player>();

		// 標準入力
		Scanner sc = new Scanner(System.in);

		// 対戦回数
		while (sc.hasNext()) {

			matches = sc.nextInt();
			break;
		}

		// 対戦回数分まわす
		for (int m = 0; m < matches; m++) {

			while (sc.hasNext()) {
				// 対戦者達のインスタンスを作る
				for (String val : players) {
					player obj = new player();
					obj.setName(val);
					obj.setCard(sc.next());
					players_beans.add(obj);
				}
			}
		}
	}
}

// 各プレイヤーのプロパティ
class player {

	//
	private String name = "";
	private String card = "";
	private int points = 0;

	// セッター
	public void setName(String n) {
		name = n;
	}

	public void setCard(String c) {
		card = c;
	}

	// 合計値を持つようにする
	public void setPoints(int p) {
		points += p;
	}

	// ゲッター
	public String getName() {
		return name;
	}

	public String getCard() {
		return card;
	}

	public int getPoints() {
		return points;
	}

}