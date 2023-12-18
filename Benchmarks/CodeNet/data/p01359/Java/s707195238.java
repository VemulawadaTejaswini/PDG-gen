import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	class Era {
		String name;
		int start, last;

		Era(String name, int base, int year) {
			this.name = name;
			this.start = year - base + 1;
			this.last = year;
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			Era[] era = new Era[n];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				int k1 = sc.nextInt();
				int k2 = sc.nextInt();
				era[i] = new Era(s, k1, k2);
			}
			L: for (int i = 0; i < m; i++) {
				int y = sc.nextInt();
				for (int j = 0; j < n; j++) {
					if (era[j].start <= y && y <= era[j].last) {
						System.out.println(era[j].name + " " + (y - era[j].start + 1));
						continue L;
					}
				}
				System.out.println("Unknown");
			}
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