import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double h = sc.nextDouble();
		double m = sc.nextDouble();

		double theta1 = 30.0d * (h + (m / 60.0D));
		double theta2 = 6.0d * m;

		double theta = Math.toRadians(theta2 - theta1);
		double c = Math.sqrt(Math.pow(a, 2.0D) + Math.pow(b, 2.0D) - 2.0D * a * b * Math.cos(theta));

		System.out.println(String.format("%.20f", c));
	}
}
