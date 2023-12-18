import java.io.BufferedInputStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// DecimalFormat format = new DecimalFormat("0.000");
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		// int ncase = scanner.nextInt();
		while (scanner.hasNext()) {
			double x0, x1, x2, x3, y0, y1, y2, y3;
			x1 = scanner.nextDouble();
			y1 = scanner.nextDouble();
			x2 = scanner.nextDouble();
			y2 = scanner.nextDouble();
			x0 = scanner.nextDouble();
			y0 = scanner.nextDouble();

			x3 = scanner.nextDouble();
			y3 = scanner.nextDouble();

			double S1 = ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) / 2;
			double S2 = ((x3 - x0) * (y2 - y0) - (x2 - x0) * (y3 - y0)) / 2;

			boolean mark = (S1 - S2) < 1E-6 ? true : false;

			System.out.println(!mark ? "YES" : "NO");

		}

	}
}