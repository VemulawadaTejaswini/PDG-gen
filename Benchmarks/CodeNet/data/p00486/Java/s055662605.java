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
		int minX = Integer.MAX_VALUE;
		int maxX = 0;
		minY = Integer.MAX_VALUE;
		maxY = 0;
		for (int i = 0; i < N; ++i) {
			X[i] = Integer.parseInt(sc.next());
			Y[i] = Integer.parseInt(sc.next());
			minX = Math.min(minX, X[i]);
			maxX = Math.max(maxX, X[i]);
			minY = Math.min(minY, Y[i]);
			maxY = Math.max(maxY, Y[i]);
		}
		long left = minX;
		long right = maxX;
		while (right - left > 2) {
			long m1 = (2 * left + right) / 3;
			long m2 = (left + 2 * right) / 3;
			long v1 = calcX(m1)[0];
			long v2 = calcX(m2)[0];
			if (v1 <= v2) {
				right = m2;
			} else {
				left = m1;
			}
		}
		long ans = Long.MAX_VALUE;
		long ansX = 0;
		long ansY = 0;
		for (long x = left; x <= right; ++x) {
			long[] v = calcX(x);
			if (v[0] < ans) {
				ans = v[0];
				ansX = x;
				ansY = v[1];
			}
		}
		System.out.println(ans);
		System.out.println(ansX + " " + ansY);
	}

	static long[] calcX(long x) {
		long bottom = minY;
		long top = maxY;
		while (top - bottom > 2) {
			long m1 = (2 * bottom + top) / 3;
			long m2 = (bottom + 2 * top) / 3;
			long v1 = calc(x, m1);
			long v2 = calc(x, m2);
			if (v1 <= v2) {
				top = m2;
			} else {
				bottom = m1;
			}
		}
		long ret = Long.MAX_VALUE;
		long retY = 0;
		for (long y = bottom; y <= top; ++y) {
			long d = calc(x, y);
			if (d < ret) {
				ret = d;
				retY = y;
			}
		}
		return new long[] { ret, retY };
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