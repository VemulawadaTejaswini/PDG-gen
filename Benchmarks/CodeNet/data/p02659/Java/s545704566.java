import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		sc.close();

		a = a.multiply(b).setScale(0, BigDecimal.ROUND_DOWN);
		System.out.println(a.toPlainString());
	}
}
