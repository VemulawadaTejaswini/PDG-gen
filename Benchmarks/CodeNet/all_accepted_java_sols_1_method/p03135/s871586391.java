import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * メインクラス
 *
 */
public class Main {

	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// 標準入力を取得
		Scanner sc = new Scanner(System.in);
		BigDecimal T = new BigDecimal(sc.next());
		BigDecimal X = new BigDecimal(sc.next());

		System.out.println(T.divide(X, 10, BigDecimal.ROUND_HALF_UP).toPlainString());
	}
}