import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int w, h;
	int[][] a;
	int[] vx = {-1, 0, 0, 1};
	int[] vy = {0, -1, 1, 0};

	void bfs(int x, int y) {
		int[] queueX = new int[w * h + 1];
		int[] queueY = new int[w * h + 1];
		int first, last;
		first = last = 0;

		a[y][x] = 1;
		queueX[last] = x;
		queueY[last] = y;
		last++;
		while (first != last) {
			int X = queueX[first];
			int Y = queueY[first];
			first++;
			for (int i = 0; i < 4; i++) {
				int nx = X + vx[i];
				int ny = Y + vy[i];
				if (nx < 0 || w <= nx || ny < 0 || h <= ny)
					continue;
				if (a[ny][nx] != 0)
					continue;
				queueX[last] = nx;
				queueY[last] = ny;
				last++;
				a[ny][nx] = a[Y][X] + 1;
			}
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			int sx, sy, gx, gy;

			a = new int[h * 2 + 1][w * 2 + 1];
			for (int i = 0; i < h * 2 + 1; i++) {
				a[i][0] = a[i][w * 2] = 1;
			}
			for (int j = 0; j < w * 2 + 1; j++) {
				a[0][j] = a[h * 2][j] = 1;
			}
			for (int i = 1; i < h * 2; i++) {
				for (int j = 1; j < w * 2; j++) {
					if (i % 2 == 0 & j % 2 == 0) {
						a[i][j] = 1;
					}
				}
			}

			for (int i = 0; i < h * 2 - 1; i++) {
				if (i % 2 == 0) {
					for (int j = 0; j < w - 1; j++) {
						a[i + 1][2 + 2 * j] = sc.nextInt();
					}
				} else {
					for (int j = 0; j < w; j++) {
						a[i + 1][1 + 2 * j] = sc.nextInt();
					}
				}
			}

			sx = 1;
			sy = 0;
			gx = w * 2 - 1;
			gy = h * 2;
			a[sy][sx] = a[gy][gx] = 0;

			this.w = w * 2 + 1;
			this.h = h * 2 + 1;
			bfs(sx, sy);

			System.out.println(a[gy][gx]/2);
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