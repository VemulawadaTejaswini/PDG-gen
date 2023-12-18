
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 各完成マップを入れる配列
		ArrayList<Map> map_list = new ArrayList<Map>();
		// 入力クラス
		Scanner sc = new Scanner(System.in);

		// 入力の回数
		int input_length = 0;
		while (sc.hasNext()) {
			input_length = sc.nextInt();
			break;
		}

		// 入力回数分ゲームをする
		for (int i = 0; i < input_length; i++) {
			// マップの高さ
			int height = sc.nextInt();
			// マップの幅
			int width = sc.nextInt();

			// マップのインスタンスを作る
			Map map = new Map();
			map.setMap(height, width);

			// 戦車のインスタンスを作る
			Tank tank = new Tank();

			// マップ作成
			for (int h = 0; h < height; h++) {
				// マップ一列
				String line = sc.next();
				// 一文字ずつに分解
				char[] line_char = line.toCharArray();
				//
				for (int w = 0; w < width; w++) {
					// マップを作る
					map.createMap(h, w, String.valueOf(line_char[w]));
				}
			}

			// コマンド入力回数
			int command_number = sc.nextInt();
			// コマンドの文字列
			char[] command_at = null;
			String command_attack = sc.next();

			// ひとつずつ配列に入れる
			command_at = command_attack.toCharArray();

			// コマンド回数分まわす
			for (int c = 0; c < command_number; c++) {
				// 戦車の現在位置を調べる
				tank.now_position(map.getMap());
				// 砲弾発射だったら
				if (String.valueOf(command_at[c]).equals("S")) {
					// マップを砲弾発射用に変更
					map = tank.shuttGun(map);
				} else {
					// 移動の場合
					tank.move_tank(String.valueOf(command_at[c]), map);
				}
			}
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

	// 戦車の位置
	// 現在の高さ
	private int now_height = 0;
	// 現在の幅
	private int now_width = 0;

	// 戦車をあらわす記号
	public static final String[] tank_element = { "<", ">", "^", "v" };

	// 戦車の向き
	private String situation = null;

	// 現在位置と向きを探す
	public void now_position(String[][] map_all) {
		// マップ全体を探す
		for (int h = 0; h < map_all.length; h++) {
			for (int w = 0; w < map_all[0].length; w++) {

				// 自分(戦車)がどこかにいるはず
				for (String val : tank_element) {
					if (map_all[h][w].equals(val)) {
						// 自分(戦車)の位置情報と向きを入力
						now_height = h;
						now_width = w;
						situation = val;
					}
				}
			}
		}
	}

	// // 戦車行動によるマップ変更 現在位置 向き
	public Map shuttGun(Map map) {
		// 左向き
		if (situation.equals("<")) {
			// マップの先が何もない場合は、なにもしない
			if (now_width == 0) {
			} else

				//
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
		}
		// 右向き
		if (situation.equals(">")) {
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

		}
		// 上向き
		if (situation.equals("^")) {
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

		}
		// 下向き
		if (situation.equals("v")) {
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
		}
		return map;
	}

	// 戦車の移動によるマップ変更,向き変更 現在位置 方向
	public Map move_tank(String s, Map map) {
		// 左向き
		if (s.equals("L")) {
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

		}
		// 右向き
		if (s.equals("R")) {
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
		}
		// 下向き
		if (s.equals("D")) {
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
		}
		// 上向き
		if (s.equals("U")) {
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
class Map {

	// 現在のマップ
	private String[][] map = null;

	// セッター
	public void setMap(int h, int w) {
		map = new String[h][w];
	}

	// マップを作る
	public void createMap(int height_i, int width_i, String m) {
		map[height_i][width_i] = m;
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