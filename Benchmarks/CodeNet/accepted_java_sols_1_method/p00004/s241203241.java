import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), d = sc.nextDouble(), e = sc.nextDouble(), f = sc.nextDouble();
			double y = (c * d - a * f) / (b * d - a * e), x = (c * e - b * f) / (a * e - b * d);
			if (Math.abs(x) <= 0.0005) x = 0;
			if (Math.abs(y) <= 0.0005) y = 0;
			System.out.printf("%.3f %.3f\n", x, y);
		}
		sc.close();
	}
}
