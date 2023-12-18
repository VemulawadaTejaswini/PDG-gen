
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double x[] = new double[4];
		double y[] = new double[4];

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < 4; i++) {
				x[i] = scanner.nextDouble();
				y[i] = scanner.nextDouble();
			}

			double A = (y[1] - y[0]) / (x[1] - x[0]);
			double B = (y[3] - y[2]) / (x[3] - x[2]);

			System.out.println(A == B ? "YES" : "NO");

		}
	}
}