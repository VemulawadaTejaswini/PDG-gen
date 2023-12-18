import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double x = sc.nextDouble();

		int result = Double.compare(x, a * a * b / 2.0);

		double answer;
		if (result > 0) {
			double h = 2 * (b - x / (a * a));
			answer = Math.atan2(h, a);
		} else {
			double w = 2.0 * x / (a * b);
			answer = Math.atan2(b, w);
		}

		answer = answer / (2.0 * Math.PI) * 360.0;
		System.out.println(answer);
	}
}
