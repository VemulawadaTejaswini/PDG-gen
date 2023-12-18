import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		BigDecimal A = scan.nextBigDecimal();
		BigDecimal B = scan.nextBigDecimal();

		//WK変数
		BigDecimal result = A.multiply(B).setScale(0, BigDecimal.ROUND_DOWN);

		//演算


		//結果出力
			System.out.println(result);
	}
}