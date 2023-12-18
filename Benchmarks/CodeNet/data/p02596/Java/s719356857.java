import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		BigDecimal K = scan.nextBigDecimal();

		//演算
		BigDecimal SEVEN = new BigDecimal(7);
		BigDecimal num = SEVEN;
		int digit = 1;

		if (!K.remainder(new BigDecimal(2)).equals(BigDecimal.ZERO)
				&& !K.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO)) {

			BigDecimal wk = SEVEN.remainder(K);

			while (!num.remainder(K).equals(BigDecimal.ZERO)) {
				wk = wk.multiply(BigDecimal.TEN).remainder(K);
				num = num.add(wk);
				digit++;
			}
		} else {
			digit = -1;
		}

		//結果出力
		System.out.println(digit);
	}
}
