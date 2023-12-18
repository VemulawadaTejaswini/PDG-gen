import java.io.IOException;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.TreeSet;

public class Main {
	int n;
	char[] c;
	int size;
	TreeSet<char[]> a, b;
	int count;

	void bt(int k, boolean[] use) {
		if (n <= k) {
			char[] dec = decode(use);
			char[] enc = encode(dec);
			if (equals(enc, c)) {
				add(dec);
			}
		} else {
			if (c[k] != 'z') {
				use[k] = true;
				bt(k + 1, use);
			}
			use[k] = false;
			bt(k + 1, use);
		}
	}

	char[] decode(boolean[] use) {
		char[] res = new char[n];
		for (int i = 0; i < n; i++) {
			if (use[i])
				res[i] = (char)(c[i] + 1);
			else
				res[i] = c[i];
		}
		return res;
	}

	char[] encode(char[] c) {
		char[] res = new char[n];
		int[] f = new int['Z' - 'A' + 1];
		for (int i = 0; i < n; i++) {
			if (c[i] != 'a' && f[c[i] - 'a'] == 0) {
				res[i] = (char)(c[i] - 1);
				f[c[i] - 'a'] = 1;
			} else {
				res[i] = c[i];
			}
		}
		return res;
	}

	boolean equals(char[] a, char[] b) {
		for (int i = 0; i < n; i++) {
			if (a[i] != b[i]) return false;
		}
		return true;
	}

	void add(char[] c) {
		count++;
		a.add(c);
		if (5 < a.size()) {
			a.remove(a.last());
		}
		b.add(c);
		if (5 < b.size()) {
			b.remove(b.last());
		}
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			c = sc.next().toCharArray();
			n = c.length;
			if (c[0] == '#') {
				break;
			}

			a = new TreeSet<char[]>(new Comparator<char[]>() {
				@Override
				public int compare(char[] o1, char[] o2) {
					int n = o1.length;
					for (int i = 0; i < n; i++) {
						if (o1[i] != o2[i]) return o1[i] - o2[i];
					}
					return 0;
				}
			});
			b = new TreeSet<char[]>(new Comparator<char[]>() {
				@Override
				public int compare(char[] o1, char[] o2) {
					int n = o1.length;
					for (int i = 0; i < n; i++) {
						if (o1[i] != o2[i]) return o2[i] - o1[i];
					}
					return 0;
				}
			});
			count = 0;
			bt(0, new boolean[n]);
			System.out.println(count);
			for (char[] C: a) {
				System.out.println(C);
			}
			if (5 < count) {
				char[][] C = b.toArray(new char[0][0]);
				if (count < 10) {
					for (int i = C.length - 1 - (10 - count); 0 <= i; i--) {
						System.out.println(C[i]);
					}
				} else {
					for (int i = C.length - 1; 0 <= i; i--) {
						System.out.println(C[i]);
					}
				}
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