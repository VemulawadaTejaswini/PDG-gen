import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int n, m;
	double[] a, b, c;
	double max;

	void bt(int k, boolean[] use, int cnt) {
		if (m < cnt) {
			return;
		}
		if (k == n) {
			if (cnt < m) return;
			max = Math.max(max, calc(use));
		} else {
			use[k] = true;
			bt(k + 1, use, cnt + 1);
			use[k] = false;
			bt(k + 1, use, cnt);
		}
	}

	double calc(boolean[] use) {
		double sum = 0;
		for (int i = 0; i < n; i++) {
			if (!use[i]) continue;
			for (int j = i + 1; j < n; j++) {
				if (!use[j]) continue;
				sum += dist(i, j);
			}
		}
		return sum;
	}

	double dist(int i, int j) {
		double res = 0;
		res += (a[i] - a[j]) * (a[i] - a[j]);
		res += (b[i] - b[j]) * (b[i] - b[j]);
		res += (c[i] - c[j]) * (c[i] - c[j]);
		return res;
	}

	void run() {
		MyScanner sc = new MyScanner();

		n = sc.nextInt();
		m = sc.nextInt();
		a = new double[n];
		b = new double[n];
		c = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextDouble();
			b[i] = sc.nextDouble();
			c[i] = sc.nextDouble();
		}

		max = 0;
		bt(0, new boolean[n], 0);
		System.out.println(max);
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