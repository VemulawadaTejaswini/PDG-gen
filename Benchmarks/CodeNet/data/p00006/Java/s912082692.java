import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * 入力された文字列を反転して出力する。
	 *
	 * @param args
	 */
	public static void main(String[] args) throws IOException {

		// 入力値を受け取る
		String input = readInput();

		// 反転する
		byte[] inputBytes = input.getBytes();
		byte[] reversed = new byte[inputBytes.length];
		for (int i = 0; i < reversed.length; i++) {
			reversed[i] = inputBytes[inputBytes.length - i - 1];
		}

		// 文字列に変換して出力する
		System.out.println(new String(reversed));
	}

	/**
	 * 標準入力から1行読み込んで返す。
	 *
	 * @return 入力された文字列
	 */
	protected static String readInput() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String line = reader.readLine();

		if (reader != null) {
			reader.close();
		}

		return line;
	}

}