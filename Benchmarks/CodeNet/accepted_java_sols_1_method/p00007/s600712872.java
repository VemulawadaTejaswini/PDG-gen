import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * 借金を計算する機能
 *
 * @author kohei.nitta
 *
 */
class Main {

	/**
	 * 標準入力から値を受け取り、n週間後の借金の残高を出力する。
	 *
	 * @param args
	 * @return
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		BigDecimal debt = new BigDecimal("100000");
		BigDecimal interest = new BigDecimal("1.05");
		BigDecimal roundUp = new BigDecimal("1000");

		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));

		int inputNo = Integer.parseInt(input.readLine());

		for (int i = 1; i <= inputNo; i++) {
			debt = debt.multiply(interest)
					.divide(roundUp, 0, BigDecimal.ROUND_UP).multiply(roundUp);
		}

		System.out.println(debt);
	}
}