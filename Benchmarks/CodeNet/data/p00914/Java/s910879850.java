import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	int[][][] dp;

	int dp(int n, int k, int s) {
		if (s < 0) {
			return 0;
		}
		if (k == 0) {
			return s == 0 ? 1 : 0;
		}

		if (0 <= dp[n][k][s]) {
			return dp[n][k][s];
		}

		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += dp(i - 1, k - 1, s - i);
		}
		return dp[n][k][s] = res;
	}

	void run() {
		MyScanner sc = new MyScanner();

		dp = new int[21][11][156];

		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int s = sc.nextInt();
			if ((n | k | s) == 0) {
				break;
			}

			for (int i = 0; i < 21; i++) {
				for (int j = 0; j < 11; j++) {
					Arrays.fill(dp[i][j], -1);
				}
			}
			System.out.println(dp(n, k, s));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}