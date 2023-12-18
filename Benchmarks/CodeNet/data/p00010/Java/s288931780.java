
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] lm = new double[2];
		double r, px, py;
		int size = in.nextInt();
		for (int i = 0; i < size; i++) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double a = x1 - x2;
			double b = y1 - y2;
			double c = (-1) * (x1 * x1 + y1 * y1) + x2 * x2 + y2 * y2;
			double d = x2 - x3;
			double e = y2 - y3;
			double f = (-1) * (x2 * x2 + y2 * y2) + x3 * x3 + y3 * y3;
			lm = simulEq(a, b, c, d, e, f);
			double l = lm[0];
			double m = lm[1];
			double n = -1 * (x1 * x1 + y1 * y1 + l * x1 + m * y1);
			px = -0.5 * l;
			py = -0.5 * m;
			r = Math.sqrt((l * l + m * m) / 4.0 - n);
			//System.out.println("x^2 + y^2 + (" + l + "x) + (" + m + "y) + (" + n + ") = 0");
			System.out.printf("%.3f %.3f %.3f\n", px, py, r);
		}
	}

	static double[] simulEq(double a, double b, double c, double d, double e, double f) {
		double y = (c * d - a * f) / (b * d - a * e);
		double x = (c * e - b * f) / (a * e - b * d);
		return new double[] { x, y };
	}
}