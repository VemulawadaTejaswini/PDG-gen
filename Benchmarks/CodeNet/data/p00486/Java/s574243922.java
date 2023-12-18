import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, W, H;
	static int[] X, Y;
	static int minY, maxY;

	public static void main(String[] args) {
		W = sc.nextInt();
		H = sc.nextInt();
		N = sc.nextInt();
		X = new int[N];
		Y = new int[N];
		for (int i = 0; i < N; ++i) {
			X[i] = Integer.parseInt(sc.next());
			Y[i] = Integer.parseInt(sc.next());
		}
		int[] ax = X.clone();
		int[] ay = Y.clone();
		Arrays.sort(ax);
		Arrays.sort(ay);
		int[] x = new int[] { ax[(N - 1) / 2], ax[N / 2] };
		int[] y = new int[] { ay[(N - 1) / 2], ay[N / 2] };
		long ans = Long.MAX_VALUE;
		int ansX = 0;
		int ansY = 0;
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 2; ++j) {
				long v = calc(x[i], y[j]);
				if (v < ans) {
					ans = v;
					ansX = x[i];
					ansY = y[j];
				}
			}
		}
		System.out.println(ans);
		System.out.println(ansX + " " + ansY);
	}

	static long calc(long x, long y) {
		long max = 0;
		long sum = 0;
		for (int i = 0; i < N; ++i) {
			long d = Math.abs(X[i] - x) + Math.abs(Y[i] - y);
			max = Math.max(max, d);
			sum += d;
		}
		return sum * 2 - max;
	}

}