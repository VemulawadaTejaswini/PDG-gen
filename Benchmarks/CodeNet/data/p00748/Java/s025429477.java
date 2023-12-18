import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int[] tetra;
	int ans;

	void bt(int k, int count, int sum, int flg) {
		if (ans < count) {
			return;
		}
		if (sum < 0) {
			return;
		}
		if (sum == 0) {
			ans = count;
			return;
		}
		for (int i = k; 1 <= i; i--) {
			if (flg == 1 && tetra[i] % 2 == 0) continue;
			bt(i, count + 1, sum - tetra[i], flg);
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		tetra = new int[200];
		for (int i = 0; i < 200; i++) {
			tetra[i] = i*(i+1)*(i+2)/6;
		}

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			ans = 1000;
			bt(199, 0, n, 0);
			System.out.print(ans + " ");
			ans = 1000;
			bt(199, 0, n, 1);
			System.out.println(ans);
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