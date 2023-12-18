import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();

		double p1, p2;

		if (2 * x <= a * a * b) {
			p1 = a * b * b;
			p2 = 2 * x;
		} else {
			p1 = 2 * (a * a * b - x);
			p2 = a * a * a;
		}

		double sit = Math.atan(p1 / p2);

		System.out.println(Math.toDegrees(Math.atan(p1 / p2)));
	}

}
