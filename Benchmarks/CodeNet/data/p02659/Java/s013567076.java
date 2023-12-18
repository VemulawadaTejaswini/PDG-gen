import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();

		BigDecimal ans = a.multiply(b);
		BigDecimal an = ans.setScale(0, RoundingMode.DOWN);

		System.out.println(an);
	}
}
