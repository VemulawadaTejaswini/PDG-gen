import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Main {


	public static void main(String[] args) {

		// ストリームを作成する
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int week = readNumber(reader);
		BigDecimal debt = BigDecimal.valueOf(100000);
		for (int i = 0; i < week; i++) {
			// 5%の利子を追加し、1000円未満は切り捨て
			debt = debt.multiply(BigDecimal.valueOf(1.05)).setScale(-3, BigDecimal.ROUND_UP);
		}
		System.out.println(debt.toPlainString());

	}

	/**
	 * ストリームから1行読み込んで、数値として返す。
	 *
	 * @param reader
	 *            入力ストリーム
	 * @return 数値
	 */
	private static int readNumber(BufferedReader reader) {
		int result = 0;
		try {
			String line = reader.readLine();
			result = Integer.parseInt(line);
		} catch (IOException e) {
			throw new RuntimeException();
		}
		return result;
	}
}