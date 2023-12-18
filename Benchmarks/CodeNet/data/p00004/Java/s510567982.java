import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		double x = 0, y = 0;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			a = scan.nextDouble();
			b = scan.nextDouble();
			c = scan.nextDouble();
			d = scan.nextDouble();
			e = scan.nextDouble();
			f = scan.nextDouble();
			x = (e * c - b * f) / (a * e - d * b);
			y = (f - d * x) / e;
			System.out.println(String.format("%.3f", x) + " "
					+ String.format("%.3f", y));
		}
	}
}