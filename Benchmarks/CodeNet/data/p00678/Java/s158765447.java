import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[] X = new int[N];
			int[] Y = new int[N];
			int[] V = new int[N];
			for (int i = 0; i < N; ++i) {
				X[i] = sc.nextInt();
				Y[i] = sc.nextInt();
				V[i] = sc.nextInt();
			}
			double x = X[0];
			double y = Y[0];
			double move = 0.1;
			for (int i = 0; i < 20; ++i) {
				for (int j = 0; j < 50000; ++j) {
					int mi = 0;
					double mt = 0;
					for (int k = 0; k < N; ++k) {
						double d = Math.sqrt(sq(X[k] - x) + sq(Y[k] - y));
						if (mt * V[k] < d) {
							mt = d / V[k];
							mi = k;
						}
					}
					x += (X[mi] - x) * move;
					y += (Y[mi] - y) * move;
				}
				move *= 0.5;
			}
			double ans = 0;
			for (int k = 0; k < N; ++k) {
				ans = Math.max(ans, Math.sqrt(sq(X[k] - x) + sq(Y[k] - y)) / V[k]);
			}
			System.out.printf("%f\n", ans);
		}
	}

	static double sq(double v) {
		return v * v;
	}
}