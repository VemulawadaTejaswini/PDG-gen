import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal n = BigDecimal.valueOf(sc.nextDouble());
		sc.close();
		System.out.println(func(n));
	}

	public static BigDecimal func(BigDecimal n) {
		BigDecimal x = n.divide(BigDecimal.valueOf(3), MathContext.DECIMAL32);

		return x.multiply(x).multiply(x);
	}
}
