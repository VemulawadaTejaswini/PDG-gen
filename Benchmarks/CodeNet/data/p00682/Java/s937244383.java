import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[] x, y;

	static double solve() {
		double ret = 0;
		for (int i = 0; i < N; ++i) {
			ret += x[i] * y[i + 1] - x[i + 1] * y[i];
		}
		return Math.abs(ret) / 2;
	}

	public static void main(String[] args) {
		for (int t = 1;; ++t) {
			N = sc.nextInt();
			if (N == 0) break;
			x = new int[N + 1];
			y = new int[N + 1];
			for (int i = 0; i < N; ++i) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			x[N] = x[0];
			y[N] = y[0];
			System.out.printf("%d %.1f\n", t, solve());
		}
	}
}