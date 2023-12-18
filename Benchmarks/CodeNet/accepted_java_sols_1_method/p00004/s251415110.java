import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
			double x = 0;
			double y = 0;

			// x?????????????§£???
			x = (e * c - b * f) / (a * e - d * b);

			// x?????????????§£???
			y = (a * f - c * d) / (a * e - b * d);

			BigDecimal xbd = new BigDecimal(x);
			BigDecimal xbd2 = xbd.setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal ybd = new BigDecimal(y);
			BigDecimal ybd2 = ybd.setScale(3, BigDecimal.ROUND_HALF_UP);
			;

			if (x == -0) {
				x = 0;
			}
			if (y == -0) {
				y = 0;
			}
			System.out.printf("%.3f %.3f", xbd2, ybd2);
			System.out.println("");

		}

	}

}