import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {
			int[] imaginedArray = readPair(reader);
			// 終了判定
			if (imaginedArray == null) {
				return;
			}
			int[] choseArray = readPair(reader);

			// ヒットとブローを判定する
			int hit = 0;
			int blow = 0;
			for (int i = 0; i < choseArray.length; i++) {

				// ヒット判定
				if (choseArray[i] == imaginedArray[i]) {
					hit++;
					continue;
				}

				// ブロー判定
				for (int j = 0; j < imaginedArray.length; j++) {
					if (choseArray[i] == imaginedArray[j]) {
						blow++;
						break;
					}
				}

			}
			System.out.println(hit + " " + blow);
		}

	}

	/**
	 * ストリームから1行読み込んで、4つ1組の数値として返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return 4つ1組の数値
	 */
	private static int[] readPair(BufferedReader reader) {
		int[] result = new int[4];
		try {
			String line = reader.readLine();
			if (line == null || line.isEmpty()) {
				return null;
			}
			String[] array = line.split(" ");
			result[0] = Integer.parseInt(array[0]);
			result[1] = Integer.parseInt(array[1]);
			result[2] = Integer.parseInt(array[2]);
			result[3] = Integer.parseInt(array[3]);
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return result;
	}

}