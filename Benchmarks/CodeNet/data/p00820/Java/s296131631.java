import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int[] a;
	short[][][] dp;
	int MAX = 201;

	int dp(int k, int s, int c) {
		if (s < 0) {
			return 0;
		}
		if (s == 0) {
			return 1;
		}
		if (4 <= c) {
			return 0;
		}
		if (200 < k) {
			return 0;
		}
		if (0 < dp[k][s][c]) {
			return dp[k][s][c];
		}

		short res = 0;

		res += dp(k, s - a[k], c + 1);
		res += dp(k + 1, s, c);

		return dp[k][s][c] = res;
	}

	void run() {
		MyScanner sc = new MyScanner();
		dp = new short[MAX][(2 << 15) + 1][4];

		a = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			a[i] = i * i;
		}

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(dp(1, n, 0));
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