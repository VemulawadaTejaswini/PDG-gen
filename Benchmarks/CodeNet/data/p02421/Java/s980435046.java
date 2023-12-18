

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		//
		int matches = 0;
		int taro_points = 0;
		int hanako_points = 0;
		// 対戦者達
		String[] players = { "太郎", "花子" };
		// 標準入力
		Scanner sc = new Scanner(System.in);
		//
		ArrayList<player> players_beans = null;

		// 対戦回数
		while (sc.hasNext()) {

			matches = sc.nextInt();
			break;
		}

		// 対戦回数分まわす
		for (int m = 0; m < matches; m++) {

			// カードを入れるリスト
			ArrayList<String> battle = new ArrayList<String>();
			// 対戦者達のインスタンスを入れるリスト
			players_beans = new ArrayList<player>();

			while (sc.hasNext()) {
				// 対戦者達のインスタンスを作る
				for (String val : players) {
					player obj = new player();
					obj.setName(val);
					obj.setCard(sc.next());
					players_beans.add(obj);
					// アルファベット順にソートするためにリストに入れる
					battle.add(obj.getCard());
				}

				// アルファベット順にソート
				Collections.sort(battle);

				// 引き分けの場合
				if (players_beans.get(0).getCard()
						.equals(players_beans.get(1).getCard())) {
					players_beans.get(0).setPoints(1);
					players_beans.get(1).setPoints(1);
				}

				// 太郎が勝つ場合
				else if (battle.get(0).equals(players_beans.get(1).getCard())) {
					players_beans.get(0).setPoints(3);
				}

				// 花子が勝つ場合
				else if (battle.get(0).equals(players_beans.get(0).getCard())) {
					players_beans.get(1).setPoints(3);
				}

				taro_points = taro_points + players_beans.get(0).getPoints();
				hanako_points = hanako_points
						+ players_beans.get(1).getPoints();

				break;
			}
		}

		// 出力
		System.out.println(taro_points + " " + hanako_points);
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