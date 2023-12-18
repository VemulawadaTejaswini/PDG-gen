import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	class D implements Comparable<D>{
		String name;
		double bene;

		D(String name, double bene) {
			this.name = name;
			this.bene = bene;
		}

		@Override
		public int compareTo(D o) {
			if (o.bene - this.bene < 0) return -1;
			if (o.bene - this.bene > 0) return 1;
			return this.name.compareTo(o.name);
		}

		@Override
		public String toString() {
			return this.name;
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			D[] seed = new D[n];
			for (int i = 0; i < n; i++) {
				String name = sc.next();
				int price = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				int e = sc.nextInt();
				int f = sc.nextInt();
				int s = sc.nextInt();
				int m = sc.nextInt();

				int time1 = a + b + c;
				int time2 = d + e;

				double bene = f * m * s;
				bene -= price;
				bene /= time1 + m * time2;
				seed[i] = new D(name, bene);
			}

			Arrays.sort(seed);
			for (int i = 0; i < n; i++) {
				System.out.println(seed[i]);
			}
			System.out.println("#");
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