import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			BigDecimal num = new BigDecimal(a).divide(new BigDecimal(b), 6, RoundingMode.HALF_EVEN);

			System.out.println(a / b + " " + a % b + " " + num);
		}
	}
}
