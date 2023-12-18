
import java.util.ArrayList;
import java.util.Scanner;

//
public class Main {

	public static void main(String[] args) {
				
		// 各完成マップを入れる配列
		ArrayList<Field> map_list = new ArrayList<Field>();
		// 入力クラス
		Scanner sc = new Scanner(System.in);

		// 入力の回数
		int input_length = sc.nextInt();

		// 入力回数分ゲームをする
		for (int i = 0; i < input_length; i++) {
			// マップの高さ
			int height = sc.nextInt();
			// マップの幅
			int width = sc.nextInt();

			// マップのインスタンスを作る
			Field map = new Field();
			map.setMap(height, width);

			// 戦車のインスタンスを作る
			Tank tank = new Tank();

			// マップ高さ分まわす
			for (int h = 0; h < height; h++) {
				// マップ一列
				String line = sc.next();
				// マップを作る
				map.createMap(h, line);
			}

			// コマンド入力回数
			int no_use = sc.nextInt();

			// コマンドの文字列
			String command_row = sc.next();

			// 戦車の動き
			tank.Action(command_row, map);

			// できたマップリストにを格納
			map_list.add(map);
		}

		// 結果を出力
		for (int f = 0; f < map_list.size(); f++) {

			map_list.get(f).out_map();

			if (f != (map_list.size() - 1)) {
				// 改行
				System.out.print("\n");
			}
		}
	}
}

// 戦車について扱ったクラス
class Tank {

	//戦車の要素
	public static final String[] tank_element = { "<", ">", "^", "v" };

	// 現在の高さ
	private int now_height = 0;
	// 現在の幅
	private int now_width = 0;

	// 戦車の向き
	private String situation = null;

	// 現在位置と向きを探す
	public void now_position(Field map) {
		// マップ全体を探す
		for (int h = 0; h < map.getMap().length; h++) {
			for (int w = 0; w < map.getMap()[0].length; w++) {

				// 自分(戦車)がどこかにいるはず
				for (String val : tank_element) {
					if (map.getMap()[h][w].equals(val)) {
						// 自分(戦車)の位置情報と向きを入力
						now_height = h;
						now_width = w;
						situation = val;
					}
				}
			}
		}
	}

	// 戦車行動によるマップ変更
	public Field Action(String command_row, Field map) {
		// 一文字づつに変換
		char[] command_char = command_row.toCharArray();

		// コマンドがある分まわす
		for (int i = 0; i < command_char.length; i++) {

			// 現在位置を把握
			now_position(map);

			// ひとつのコマンド
			String one_command = String.valueOf(command_char[i]);

			// コマンド入力によって行動を変化
			switch (one_command) {
			// 移動
			case "R":
				move(one_command, map);
				break;
			case "L":
				move(one_command, map);
				break;
			case "U":
				move(one_command, map);
				break;
			case "D":
				move(one_command, map);
				break;
			// 砲撃
			case "S":
				shuttGun(map);
				break;
			}
		}
		return map;
	}

	// 戦車砲撃によるマップ変更
	public Field shuttGun(Field map) {
		// 場合わけ
		switch (situation) {

		// 左向き
		case "<":
			// マップの先が何もない場合は、なにもしない
			if (now_width == 0) {
			} else

				for (int i = 0; i <= now_width; i++) {
					// レンガ壁だったら平地に
					if (map.getMap()[now_height][now_width - i].equals("*")) {
						map.getMap()[now_height][now_width - i] = ".";
						break;
					}
					// 鉄壁だったら変更なし
					if (map.getMap()[now_height][now_width - i].equals("#")) {
						break;
					}
				}
			break;

		// 右向き
		case ">":
			// マップの先が何もない場合は、なにもしない
			if (now_width == (map.getMap()[0].length - 1)) {

			} else

				for (int i = 0; i <= (map.getMap()[0].length - now_width); i++) {
					// レンガ壁だったら平地に
					if (map.getMap()[now_height][now_width + i].equals("*")) {
						map.getMap()[now_height][now_width + i] = ".";

						break;

					}
					// 鉄壁だったら変更なし
					if (map.getMap()[now_height][now_width + i].equals("#")) {
						break;
					}
				}

			break;

		// 上向き
		case "^":
			// マップの先が何もない場合は、なにもしない
			if (now_height == 0) {
			} else

				for (int i = 0; i <= now_height; i++) {
					// レンガ壁だったら平地に
					if (map.getMap()[now_height - i][now_width].equals("*")) {

						map.getMap()[now_height - i][now_width] = ".";
						break;
					}
					// 鉄壁だったら変更なし
					if (map.getMap()[now_height - i][now_width].equals("#")) {
						break;
					}
				}
			break;

		// 下向き
		case "v":
			// マップの先が何もない場合は、なにもしない
			if (now_height == (map.getMap().length - 1)) {

			} else
				for (int i = 0; i <= (map.getMap().length - now_height); i++) {

					// レンガ壁だったら平地に
					if (map.getMap()[now_height + i][now_width].equals("*")) {
						map.getMap()[now_height + i][now_width] = ".";
						break;
					}
					// 鉄壁だったら変更なし
					if (map.getMap()[now_height + i][now_width].equals("#")) {
						break;
					}
				}
			break;
		}
		return map;
	}

	// 戦車の移動によるマップ変更,向き変更 現在位置 方向
	public Field move(String s, Field map) {

		// ケース分け
		switch (s) {

		// 左向き
		case "L":
			// 左のマスが平地だったら左に進む
			// マップの先がなにもないときはなにもしない
			if (now_width == 0) {
				map.getMap()[now_height][now_width] = "<";
			}
			// 平地マスへ移動
			else if (map.getMap()[now_height][now_width - 1].equals(".")) {
				// 戦車を進める
				map.getMap()[now_height][now_width - 1] = "<";
				// 元いた位置は平地
				map.getMap()[now_height][now_width] = ".";
			} else {
				// 平地マス以外は向き変え
				map.getMap()[now_height][now_width] = "<";

			}
			break;

		// 右向き
		case "R":
			// 右のマスが平地だったら右に進む
			// マップの先がなにもないときはなにもしない
			if (now_width == (map.getMap()[0].length - 1)) {
				map.getMap()[now_height][now_width] = ">";
			}
			// 平地マスへ移動
			else if (map.getMap()[now_height][now_width + 1].equals(".")) {
				// 戦車を進める
				map.getMap()[now_height][now_width + 1] = ">";
				// 元いた位置は平地
				map.getMap()[now_height][now_width] = ".";
			} else {
				// 平地マス以外は向き変え
				map.getMap()[now_height][now_width] = ">";
			}
			break;

		// 下向き
		case "D":
			// 下のマスが平地だったら下に進む
			// マップの先がなにもないときはなにもしない
			if (now_height == (map.getMap().length - 1)) {
				map.getMap()[now_height][now_width] = "v";

			} else if (map.getMap()[now_height + 1][now_width].equals(".")) {
				// 戦車を進める
				map.getMap()[now_height + 1][now_width] = "v";
				// 元いた位置は平地
				map.getMap()[now_height][now_width] = ".";
			} else {
				// 平地マス以外は向き変え
				map.getMap()[now_height][now_width] = "v";

			}
			break;

		// 上向き
		case "U":
			// 上のマスが平地だったら上に進む
			// マップの先がなにもないときはなにもしない
			if (now_height == 0) {
				map.getMap()[now_height][now_width] = "^";
			}
			// 平地マスへ移動
			else if (map.getMap()[now_height - 1][now_width].equals(".")) {
				// 戦車を進める
				map.getMap()[now_height - 1][now_width] = "^";
				// 元いた位置は平地
				map.getMap()[now_height][now_width] = ".";
			} else {
				// 平地マス以外は向き変え
				map.getMap()[now_height][now_width] = "^";
			}
			break;
		}
		return map;
	}

	// ゲッター
	public String getSituation() {
		return situation;
	}

	public int getNow_height() {
		return now_height;
	}

	public int getNow_width() {
		return now_width;
	}
}

// マップについて扱ったクラス
class Field {

	// マップ構成要素
	final String[] Map_element = new String[] { ".", "*", "#", "-" };

	// 現在のマップ
	private String[][] map = null;

	// セッター
	public void setMap(int h, int w) {
		map = new String[h][w];
	}

	// マップを作る
	public void createMap(int height_i, String map_row) {
		// 一文字づつに変換
		char[] map_ele = map_row.toCharArray();
		// 一文字マップに構成要素を追加していく
		for (int w = 0; w < map_ele.length; w++) {
			map[height_i][w] = String.valueOf(map_ele[w]);
		}
	}

	// マップを出力
	public void out_map() {
		for (int h = 0; h < map.length; h++) {
			for (int w = 0; w < map[0].length; w++) {
				System.out.print(map[h][w]);
			}
			System.out.print("\n");
		}
	}

	// ゲッター
	public String[][] getMap() {
		return map;
	}
}