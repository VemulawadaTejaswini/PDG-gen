import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			double r = sc.nextDouble();
			int scale = 6;

			BigDecimal area = new BigDecimal(r * r * Math.PI).setScale(scale, RoundingMode.HALF_EVEN);
			BigDecimal Circumference = new BigDecimal(2 * r * Math.PI).setScale(scale, RoundingMode.HALF_EVEN);

			System.out.println(area + " " + Circumference);
		}
	}
}
