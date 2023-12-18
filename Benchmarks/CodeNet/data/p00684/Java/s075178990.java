import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	char[] c;
	int id;
	boolean flag;

	long[] expression() {
		long[] res = term();
		while (c[id] == '+' || c[id] == '-') {
			if (c[id] == '+') {
				id++;
				long[] tmp = term();
				res = add(res, tmp);
			} else {
				id++;
				long[] tmp = term();
				res = sub(res, tmp);
			}
		}
		return res;
	}

	long[] term() {
		long[] res = fact();
		while (c[id] == '*') {
			if (c[id] == '*') {
				id++;
				long[] tmp = fact();
				res = mlt(res, tmp);
			}
		}
		return res;
	}

	long[] fact() {
		long[] res = new long[2];
		if (c[id] == '(') {
			id++;
			res = expression();
			id++;
		} else if (c[id] == '+') {
			id++;
			long[] tmp = fact();
			res = add(res, tmp);
		} else if (c[id] == '-') {
			id++;
			long[] tmp = fact();
			res = sub(res, tmp);
		} else {
			res = number();
		}
		return res;
	}

	long[] number() {
		if (c[id] == 'i') {
			id++;
			return new long[]{0, 1};
		}

		long[] res = new long[2];
		long tmp = 0;
		while ('0' <= c[id] && c[id] <= '9') {
			tmp *= 10;
			tmp += c[id] - '0';
			id++;
			if (tmp < -10000 || 10000 < tmp) {
				flag = false;
			}
		}

		res[0] = tmp;
		return res;
	}

	long[] add(long[] a, long[] b) {
		long[] res = new long[]{a[0] + b[0], a[1] + b[1]};
		check(res);
		return res;
	}

	long[] sub(long[] a, long[] b) {
		long[] res = new long[]{a[0] - b[0], a[1] - b[1]};
		check(res);
		return res;
	}

	long[] mlt(long[] a, long[] b) {
		long[] res = new long[]{a[0]*b[0] - a[1]*b[1], a[0]*b[1] + a[1]*b[0]};
		check(res);
		return res;
	}

	void check(long[] a) {
		if (a[0] < -10000L || 10000L < a[0]) flag = false;
		if (a[1] < -10000L || 10000L < a[1]) flag = false;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			c = (sc.next()+"=").toCharArray();
			//		c = "(102+10*i)*(99+10*i)=".toCharArray();
			id = 0;
			flag = true;
			long[] res = expression();
			check(res);
			if (flag) {
				if (res[0] == 0 && res[1] == 0) {
					System.out.println(0);
				} else if (res[1] == 0) {
					System.out.println(res[0]);
				} else if (res[0] == 0) {
					System.out.println(res[1] + "i");
				} else if (0 < res[1]) {
					System.out.println(res[0] + "+" + res[1] + "i");
				} else {
					System.out.println(res[0] + "" + res[1] + "i");
				}
			} else {
				System.out.println("overflow");
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