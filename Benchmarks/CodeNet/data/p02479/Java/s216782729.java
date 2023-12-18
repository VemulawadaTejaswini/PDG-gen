import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = Math.PI;
		double r = sc.nextInt();
		double a, b;

		a = r * r * x;
		b = 2 * r * x;

		System.out.printf("%.6f %.6f\n", a, b);
	}

}