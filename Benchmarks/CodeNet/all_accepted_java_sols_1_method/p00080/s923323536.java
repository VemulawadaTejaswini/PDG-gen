import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// while (true) {
		// double q = in.nextDouble();
		// if (q == -1)
		// break;
		// double x = q / 2;
		// while (Math.abs(x * x * x - q) > 0.00001 * q)
		// x = Math.abs(x - ((x * x * x - q) / (3 * x * x)));
		// System.out.printf("%.6f\n", x);
		// }
		double q;
		while ((q = in.nextDouble()) != -1) {
			double xn = q / 2.0;
			double checkVal = xn * xn * xn - q;
			while (Math.abs(checkVal) >= 0.00001 * q) {
				xn = xn - (checkVal) / (xn * xn * 3.0);
				checkVal = xn * xn * xn - q;
			}
			System.out.printf("%f", xn);
			System.out.println();

		}
	}
}