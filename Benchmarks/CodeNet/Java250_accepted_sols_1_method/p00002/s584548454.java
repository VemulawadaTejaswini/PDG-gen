import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * 引数で与えられた2つの数値を足し、計算後の桁数を出力する。
	 *
	 * @param args
	 *            利用しない
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// 入力値を受け取る
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while ((line = br.readLine()) != null) {

			// 引数を足した後の桁数を出力する
			String[] number = line.split(" ");
			System.out.println(String
					.valueOf(
							(Integer.parseInt(number[0]) + Integer
									.parseInt(number[1]))).length());

		}
	}
}