import java.util.Scanner;

/**
 * Bange Hills Tower
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, t;
		N = sc.nextInt();
		t = sc.nextInt();

		double tan = -1;

		for (int i = 0; i < N; i++) {
			double x, h;
			x = sc.nextDouble();
			h = sc.nextDouble();
			tan = Math.max(tan, h / x);
		}

		System.out.println(tan * t);
	}
}