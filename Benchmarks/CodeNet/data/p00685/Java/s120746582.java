import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int cnt;
	int[][] p;
	int[][] f;

	void bt(int x, int y) {
		if (4 <= y) {
			cnt++;
			return;
		}
		int nx = x + 1;
		int ny = y;
		if (4 <= nx) {
			nx = 0;
			ny++;
		}

		if (f[y][x] == 0) {
			for (int i = 0; i < 4; i++) {
				int px = x + p[i][0];
				int py = y + p[i][1];
				if (px < 0 || 4 <= px) continue;
				if (py < 0 || 4 <= py) continue;
				if (f[py][px] == 1) continue;
				f[y][x] = f[py][px] = 1;
				bt(nx, ny);
				f[y][x] = f[py][px] = 0;
			}
		} else {
			bt(nx, ny);
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		p = new int[4][2];
		f = new int[4][4];
		while (true) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 2; j++) {
					p[i][j] = sc.nextInt();
					if (4 < p[i][j]) {
						return;
					}
				}
			}
			cnt = 0;
			bt(0, 0);
			System.out.println(cnt);
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