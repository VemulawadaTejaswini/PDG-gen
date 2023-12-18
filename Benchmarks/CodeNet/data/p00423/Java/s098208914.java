import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	// インデックス定数
	private static final int A = 0;
	private static final int B = 1;

	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (true) {

			// カード枚数を取得する
			int loop = Integer.parseInt(readLine(reader));

			// 終了判定を行う
			if (loop == 0) {
				return;
			}

			// スコアを初期化する
			int scoreA = 0;
			int scoreB = 0;

			for (int i = 0; i < loop; i++) {

				// 入力されたカード情報を取得する
				String[] cardArray = readLine(reader).split(" ");
				int[] cardNumArray = new int[cardArray.length];
				for (int j = 0; j < cardNumArray.length; j++) {
					cardNumArray[j] = Integer.parseInt(cardArray[j]);
				}

				// 勝負の結果をスコアに反映する
				if (cardNumArray[A] == cardNumArray[B]) {
					scoreA += cardNumArray[A];
					scoreB += cardNumArray[B];
				} else if (cardNumArray[A] > cardNumArray[B]) {
					scoreA += cardNumArray[A] + cardNumArray[B];
				} else {
					scoreB += cardNumArray[A] + cardNumArray[B];
				}
			}

			// AとBのスコアを表示する
			System.out.println(scoreA + " " + scoreB);
		}

	}

	/**
	 * ストリームから1行読み込んで、文字列として返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return　文字列
	 */
	private static String readLine(BufferedReader reader) {
		String line = null;
		try {
			line = reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return line;
	}
}