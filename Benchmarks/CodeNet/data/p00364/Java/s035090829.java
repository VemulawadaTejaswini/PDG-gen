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

		double min = -1;

		for (int i = 0; i < N; i++) {
			double x, h;
			x = sc.nextDouble();
			h = sc.nextDouble();
			min = Math.max(min, h * t / x);
		}

		System.out.println(min);
	}
}