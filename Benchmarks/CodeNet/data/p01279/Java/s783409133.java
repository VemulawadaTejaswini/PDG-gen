import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int M = sc.nextInt();
			int[] xt = new int[N];
			int[] yt = new int[N];
			int[] vt = new int[N];
			int[] xb = new int[M];
			int[] yb = new int[M];
			for (int i = 0; i < N; ++i) {
				xt[i] = sc.nextInt();
				yt[i] = sc.nextInt();
				vt[i] = sc.nextInt();
			}
			for (int i = 0; i < M; ++i) {
				xb[i] = sc.nextInt();
				yb[i] = sc.nextInt();
			}
			double[][] time = new double[M][N];
			for (int i = 0; i < M; ++i) {
				for (int j = 0; j < N; ++j) {
					time[i][j] = Math.sqrt((xb[i] - xt[j]) * (xb[i] - xt[j]) + (yb[i] - yt[j]) * (yb[i] - yt[j])) / vt[j];
				}
			}
			double lo = 0;
			double hi = 20000;
			for (int i = 0; i < 200; ++i) {
				double mid = (lo + hi) / 2;
				boolean success = true;
				for (int j = 0; j < M; ++j) {
					boolean ok = false;
					for (int k = 0; k < N; ++k) {
						if (time[j][k] <= mid) {
							ok = true;
							break;
						}
					}
					if (!ok) {
						success = false;
						break;
					}
				}
				if (success) {
					hi = mid;
				} else {
					lo = mid;
				}
			}
			System.out.printf("%.8f\n", hi);
		}
	}

}