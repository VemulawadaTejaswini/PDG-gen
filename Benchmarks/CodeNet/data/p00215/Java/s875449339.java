import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {
			// 入力値からフィールドを作成する
			int[][] field = readField(reader);
			// 入力がない場合は終了
			if (field == null) {
				return;
			}

			// 初期パチモン候補を取得する（クリア判定を兼ねる）
			int[] first = getFirstPachimon(field);
			if (first == null) {
				System.out.println("NA");
				continue;
			}

			// 初期パチモン候補ごとにコストを計算する
			int[] cost = new int[first.length];
			for (int i = 0; i < cost.length; i++) {
				cost[i] = getCost(field, first[i]);
			}

			// コストが一番低い初期パチモンを探す
			int index = 0;
			int minCost = cost[index];
			for (int i = 1; i < cost.length; i++) {
				if (minCost > cost[i]) {
					minCost = cost[i];
					index = i;
				}
			}

			// 結果を出力する
			System.out.println(first[index] + " " + minCost);
		}

	}

	/**
	 * ストリームから1行読み込んで、フィールド情報返す。 値が取得できなかった場合はnullを返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return フィールド情報
	 */
	private static int[][] readField(BufferedReader reader) {
		int[][] field = null;
		try {
			String line = reader.readLine();
			String[] mapSize = line.split(" ");
			int x = Integer.parseInt(mapSize[0]);
			int y = Integer.parseInt(mapSize[1]);

			if (x == 0 && y == 0) {
				return null;
			}

			// フィールド情報読み込み
			field = new int[y][x];
			for (int i = 0; i < y; i++) {
				line = reader.readLine();
				for (int j = 0; j < x; j++) {
					String str = line.substring(j, j + 1);
					if (".".equals(str)) {
						field[i][j] = 0;
					} else if ("S".equals(str)) {
						field[i][j] = 8;
					} else if ("G".equals(str)) {
						field[i][j] = 9;
					} else {
						field[i][j] = Integer.parseInt(str);
					}
				}
			}

		} catch (IOException e) {
			throw new RuntimeException();
		}

		return field;
	}

	/**
	 * ゲームがクリアできるかどうかチェックし、クリアできる場合は初期パチモン候補を返す。
	 *
	 * @param field
	 *            フィールド
	 * @return クリアできる場合は初期パチモン候補の配列、そうでない場合はnull
	 */
	private static int[] getFirstPachimon(int[][] field) {

		// パチモンの種類を取得する
		boolean[] exists = new boolean[5];
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (1 <= field[i][j] && field[i][j] <= 5) {
					exists[field[i][j] - 1] = true;
				}
			}
		}

		// 存在する種類数と存在しない種類を1つだけ保持する
		int count = 0;
		int notExists = -1;
		for (int i = 0; i < 5; i++) {
			if (exists[i]) {
				count++;
			} else {
				notExists = i + 1;
			}
		}

		// 4種類の場合は1種類固定、5種類の場合は全種類が候補になる
		int[] candidate = null;
		if (count == 4) {
			candidate = new int[1];
			candidate[0] = notExists;
		} else if (count == 5) {
			candidate = new int[5];
			for (int i = 0; i < 5; i++) {
				candidate[i] = i + 1;
			}
		}

		return candidate;
	}

	/**
	 * 指定フィールド・指定初期パチモンで、ゴールまでにかかるコストを調べる。
	 *
	 * @param field
	 *            フィールド
	 * @param first
	 *            初期パチモンの属性
	 * @return
	 */
	private static int getCost(int[][] field, int first) {

		Status status = getStart(field);
		int current = first;

		// System.out.println("初期パチモン： " + first);
		// System.out.println(status);

		// 4匹つかまえ、最後にゴールに向かう
		List<Status> variation = new ArrayList<Status>();
		variation.add(status);
		for (int i = 0; i < 5; i++) {

			// ターゲットが複数いた場合、バリエーションが増えていく
			int target = getTarget(current, first);
			List<Status> nextVariation = new ArrayList<Status>();
			for (Status s : variation) {
				nextVariation.addAll(capture(field, target, s));
			}

			// この属性のポケモン1匹につき1つ、そこまでの最小コストを保持する
			List<Status> narrowedVariation = new ArrayList<Status>();
			for (Status s : nextVariation) {
				boolean exists = false;
				for (Status narrow : narrowedVariation) {
					// すでに登録済みの場合はコストが小さい場合のみ上書き
					if (s.x == narrow.x && s.y == narrow.y) {
						exists = true;
						if (narrow.cost > s.cost) {
							narrow.cost = s.cost;
						}
						break;
					}
				}
				if (!exists) {
					narrowedVariation.add(s);
				}
			}

			// デバッグ
			// System.out.println(" #" + i + " ターゲット: " + target);
			// for (Status s : narrowedVariation) {
			// 	System.out.println(s);
			// }

			// 次のループの準備
			variation = nextVariation;
			current = target;
		}

		// 一番コストが小さいものを取得する
		int minCost = variation.get(0).cost;
		for (int i = 1; i < variation.size(); i++) {
			if (minCost > variation.get(i).cost) {
				minCost = variation.get(i).cost;
			}
		}
		// System.out.println("最小コスト： " + minCost);

		return minCost;
	}

	/**
	 * 次のターゲット属性を取得する。
	 *
	 * @param current
	 *            直前に取得したパチモンの属性
	 * @param first
	 *            初期パチモンの属性
	 * @return 次のターゲット属性、すべて揃った場合はゴール
	 */
	private static int getTarget(int current, int first) {

		// 現在の属性より1小さいものがターゲット
		int target = (current % 5) + 1;

		// 初期パチモンに戻ってきたらゴールを目指す
		if (target == first) {
			target = 9;
		}

		return target;
	}

	/**
	 * 開始時のステータスを取得する。
	 *
	 * @param field
	 *            フィールド
	 * @return 開始時のステータス
	 */
	private static Status getStart(int[][] field) {
		Status status = null;
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j] == 8) {
					status = new Status(j, i, 0);
					break;
				}
			}
		}
		return status;
	}

	/**
	 * 次のポケモンを捕獲する。
	 *
	 * @param field
	 *            フィールド
	 * @param target
	 *            ターゲット
	 * @param current
	 *            現在の状態
	 * @return バリエーション
	 */
	private static List<Status> capture(int[][] field, int target,
			Status current) {

		// フィールドから次のターゲットを探し、見つけたらコストを加算して登録する
		List<Status> v = new ArrayList<Status>();
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j] == target) {
					int cost = Math.abs(current.x - j)
							+ Math.abs(current.y - i);
					v.add(new Status(j, i, current.cost + cost));
				}
			}
		}
		return v;
	}

	private static class Status {
		public int x;
		public int y;
		public int cost;

		public Status(int x, int y, int cost) {
			this.x = x;
			this.y = y;
			this.cost = cost;
		}

		public String toString() {
			return "(" + x + ", " + y + "): " + cost;
		}
	}

}