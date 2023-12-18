import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int[][] paper = new int[10][10];
		while (true) {
			int[] ink = readPair(reader);
			// 終了判定
			if (ink == null) {
				break;
			}
			// インクを落とす
			drop(ink, paper);
		}

		// 結果を集計する
		int white = 0;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (paper[i][j] == 0) {
					white++;
				}
				if (paper[i][j] > max) {
					max = paper[i][j];
				}
			}
		}
		System.out.println(white);
		System.out.println(max);
	}

	/**
	 * 紙にインクを落とす
	 *
	 * @param ink
	 *            インク
	 * @param paper
	 *            紙
	 */
	private static final void drop(int[] ink, int paper[][]) {
		if (ink[2] == 1) {
			// 小インク
			dropSmall(ink, paper);
		} else if (ink[2] == 2) {
			// 中インク
			dropMiddle(ink, paper);
		} else if (ink[2] == 3) {
			dropLarge(ink, paper);
		}

	}

	/**
	 * 紙に小さいインクを落とす
	 *
	 * @param ink
	 *            インク
	 * @param paper
	 *            紙
	 */
	private static final void dropSmall(int[] ink, int paper[][]) {
		paper[ink[0]][ink[1]]++;
		if (ink[0] > 0) {
			paper[ink[0] - 1][ink[1]]++;
		}
		if (ink[0] < 9) {
			paper[ink[0] + 1][ink[1]]++;
		}
		if (ink[1] > 0) {
			paper[ink[0]][ink[1] - 1]++;
		}
		if (ink[1] < 9) {
			paper[ink[0]][ink[1] + 1]++;
		}
	}

	/**
	 * 紙に中くらいのインクを落とす
	 *
	 * @param ink
	 *            インク
	 * @param paper
	 *            紙
	 */
	private static final void dropMiddle(int[] ink, int paper[][]) {
		dropSmall(ink, paper);
		if (ink[0] > 0 && ink[1] > 0) {
			paper[ink[0] - 1][ink[1] - 1]++;
		}
		if (ink[0] < 9 && ink[1] > 0) {
			paper[ink[0] + 1][ink[1] - 1]++;
		}
		if (ink[0] < 9 && ink[1] < 9) {
			paper[ink[0] + 1][ink[1] + 1]++;
		}
		if (ink[0] > 0 && ink[1] < 9) {
			paper[ink[0] - 1][ink[1] + 1]++;
		}
	}

	/**
	 * 紙に大きいインクを落とす
	 *
	 * @param ink
	 *            インク
	 * @param paper
	 *            紙
	 */
	private static final void dropLarge(int[] ink, int paper[][]) {
		dropMiddle(ink, paper);
		if (ink[0] > 1) {
			paper[ink[0] - 2][ink[1]]++;
		}
		if (ink[0] < 8) {
			paper[ink[0] + 2][ink[1]]++;
		}
		if (ink[1] > 1) {
			paper[ink[0]][ink[1] - 2]++;
		}
		if (ink[1] < 8) {
			paper[ink[0]][ink[1] + 2]++;
		}
	}

	/**
	 * ストリームから1行読み込んで、3つ1組の数値として返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return 3つ1組の数値
	 */
	private static int[] readPair(BufferedReader reader) {
		int[] result = new int[4];
		try {
			String line = reader.readLine();
			if (line == null || line.isEmpty()) {
				return null;
			}
			String[] array = line.split(",");
			result[0] = Integer.parseInt(array[0]);
			result[1] = Integer.parseInt(array[1]);
			result[2] = Integer.parseInt(array[2]);
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return result;
	}

}