import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static double[] X, Y;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			X = new double[N];
			Y = new double[N];
			for (int i = 0; i < N; ++i) {
				X[i] = sc.nextDouble();
				Y[i] = sc.nextDouble();
			}
			System.out.println(solve());
		}
	}

	static int solve() {
		if (N == 1) return 1;
		if (N == 2) {
			return dist(0, 1) < 2 ? 2 : 1;
		}
		int ans = 1;
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				double d = dist(i, j);
				if (d > 2) continue;
				double dx = (X[j] - X[i]) / 2;
				double dy = (Y[j] - Y[i]) / 2;
				double len = sq(dx, dy);
				double ex = dx / len;
				double ey = dx / len;
				double lenC = Math.sqrt(1 - len);
				{
					double cx = X[i] + dx - ey * lenC;
					double cy = Y[i] + dy + ex * lenC;
					ans = Math.max(ans, count(cx, cy));
				}
				{
					double cx = X[i] + dx + ey * lenC;
					double cy = Y[i] + dy - ex * lenC;
					ans = Math.max(ans, count(cx, cy));
				}
			}
		}
		return ans;
	}

	static int count(double cx, double cy) {
		int c = 0;
		for (int i = 0; i < N; ++i) {
			double d = sq(X[i] - cx, Y[i] - cy);
			if (d <= 1 + 1e-8) ++c;
		}
		return c;
	}

	static double dist(int i, int j) {
		return sq(X[i] - X[j], Y[i] - Y[j]);
	}

	static double sq(double x, double y) {
		return Math.sqrt(x * x + y * y);
	}

}