import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		double h = b * Math.sin(Math.toRadians(c));
		double s = a * h / 2;
		double l = a + b + Math.sqrt( a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c)) );
		System.out.printf("%.5f\n", s);
		System.out.printf("%.5f\n", l);
		System.out.printf("%.5f\n", h);

	}
}
