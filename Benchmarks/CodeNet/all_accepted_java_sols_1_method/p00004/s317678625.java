import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a, b, c, d, e, f;
		double x, y;

		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {

			a = Double.parseDouble(scan.next());
			b = Double.parseDouble(scan.next());
			c = Double.parseDouble(scan.next());
			d = Double.parseDouble(scan.next());
			e = Double.parseDouble(scan.next());
			f = Double.parseDouble(scan.next());

			y = (a * f - c * d) / (a * e - b * d);
			x = (c - b * y) / a;

			System.out.printf("%.3f %.3f\n", x, y);

		}
	}

}