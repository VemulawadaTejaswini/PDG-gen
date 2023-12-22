

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//
		int matches = 0;
		// 対戦者達
		String[] players = { "太郎", "花子" };
		//
		ArrayList<player2> players_beans = new ArrayList<player2>();;
		//プレイヤーのインスタンスを作る
		for (String val : players) {
			player2 obj = new player2();
			obj.setName(val);
			players_beans.add(obj);
		}

		// 標準入力
		Scanner sc = new Scanner(System.in);


		// 対戦回数
		while (sc.hasNext()) {

			matches = sc.nextInt();
			break;
		}

		// 対戦回数分まわす
		for (int m = 0; m < matches; m++) {

			// カードを入れるリスト
			ArrayList<String> battle = new ArrayList<String>();

			while (sc.hasNext()) {
				// 入力文字列をリストに追加
				String taro_card = sc.next();
				String hanako_card = sc.next();
				
				battle.add(taro_card);
				battle.add(hanako_card);

				// アルファベット順にソート
				Collections.sort(battle);

				// 引き分けの場合
				if (taro_card.equals(hanako_card)) {
					players_beans.get(0).setPoints(1);
					players_beans.get(1).setPoints(1);
				}

				// 太郎が勝つ場合
				else if (battle.get(0).equals(hanako_card)) {
					players_beans.get(0).setPoints(3);
				}

				// 花子が勝つ場合
				else if (battle.get(0).equals(taro_card)) {
					players_beans.get(1).setPoints(3);
				}

				break;
			}
		}

		// 出力
		System.out.println(players_beans.get(0).getPoints() + " " + players_beans.get(1).getPoints());
	}
}

// 各プレイヤーのプロパティ
class player2 {

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