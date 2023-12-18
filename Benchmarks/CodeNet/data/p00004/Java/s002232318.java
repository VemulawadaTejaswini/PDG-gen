import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;

		while(sc.hasNext()) {
			//??\??????????????°????????£??\
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();

			BigDecimal x = new BigDecimal(mathX(a, b, c, d, e, f));
			BigDecimal y = new BigDecimal(mathY(a, b, c, d, e, f));

			x = x.setScale(4, BigDecimal.ROUND_HALF_UP);
			y = y.setScale(4, BigDecimal.ROUND_HALF_UP);

			String xy = String.format("%.3f", x) + " " + String.format("%.3f", y);
			System.out.println(xy);

		}



	}

	public static double mathX(double a, double b, double c,
			double d, double e, double f) {
		return ((c * e) - (b * f)) / ((a * e) - (b * d));
	}

	public static double mathY(double a, double b, double c,
			double d, double e, double f) {
		return ((c * d) - (a * f)) / ((b * d) - (a * e));
	}
}