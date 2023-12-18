import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	String[] s;
	char[] c;
	int id;
	boolean[] var;
	boolean ans;

	boolean exp() {
		boolean res;

		if (c[id] == '-') {
			id++;
			res = !exp();
		} else if (c[id] == '(') {
			id++;
			res = exp();
			if (c[id] == '*') {
				id++;
				res &= exp();
			} else if (c[id] == '+') {
				id++;
				res |= exp();
			} else {
				id++;
				id++;
				res = !res | exp();
			}
			id++;
		} else {
			res = var();
		}

		return res;
	}

	boolean var() {
		if (c[id] == 'T') {
			id++;
			return true;
		} else if (c[id] == 'F') {
			id++;
			return false;
		} else {
			boolean res = var[c[id] - 'a'];
			id++;
			return res;
		}
	}

	void bt(int k) {
		int n = var.length;
		if (n <= k) {
			c = s[0].toCharArray();
			id = 0;
			boolean f1 = exp();

			c = s[1].toCharArray();
			id = 0;
			boolean f2 = exp();

			ans &= (f1 == f2);
		} else {
			var[k] = true;
			bt(k + 1);
			var[k] = false;
			bt(k + 1);
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			String in = sc.next();
			if (in.equals("#")) {
				break;
			}
			s = in.split("=");
			ans = true;

			var = new boolean['k' - 'a' + 1];
			bt(0);

			System.out.println(ans ? "YES" : "NO");
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