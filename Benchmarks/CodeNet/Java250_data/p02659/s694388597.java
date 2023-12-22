import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan =new Scanner(System.in);
		BigDecimal A = scan.nextBigDecimal();
		BigDecimal B= scan.nextBigDecimal();
		BigDecimal seki = B.multiply(A);
		long C = seki.longValue();
		System.out.println(C);
	}
}