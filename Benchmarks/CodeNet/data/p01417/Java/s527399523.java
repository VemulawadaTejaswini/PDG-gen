import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		double[] L = new double[N];
		double[] a = new double[N];
		double[] b = new double[N];
		for (int i = 0; i < N; ++i) {
			L[i] = sc.nextDouble();
			a[i] = sc.nextDouble();
			b[i] = sc.nextDouble();
		}
		double[][] dist = new double[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < i; ++j) {
				dist[i][j] = dist[j][i] = sq(L[i] - L[j]) + sq(a[i] - a[j]) + sq(b[i] - b[j]);
			}
		}
		double ans = 0;
		for (int i = 1; i < (1 << N); ++i) {
			if (Integer.bitCount(i) != M) continue;
			double sum = 0;
			for (int j = 0; j < N; ++j) {
				if ((i & (1 << j)) == 0) continue;
				for (int k = 0; k < j; ++k) {
					if ((i & (1 << k)) == 0) continue;
					sum += dist[j][k];
				}
			}
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}

	static double sq(double v) {
		return v * v;
	}
}