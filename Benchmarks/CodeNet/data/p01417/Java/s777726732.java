

import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	double calcDist(double x1, double y1, double z1, double x2, double y2, double z2) {
		double dx = x1 - x2, dy = y1 - y2, dz = z1 - z2;
		return dx * dx + dy * dy + dz * dz;
	}
	
	public void run() {
		int n = in.nextInt(), m = in.nextInt();
		double[] L = new double[n];
		double[] a = new double[n];
		double[] b = new double[n];
		for (int i = 0; i < n; i++) {
			L[i] = in.nextDouble();
			a[i] = in.nextDouble();
			b[i] = in.nextDouble();
		}
		
		if (m == 1) {
			System.out.println(0);
			return;
		}
		
		double res = 0;
		boolean[] used = new boolean[n];
		Queue<Integer> q = new LinkedList<Integer>();	
		for (int i = 0; i < n; i++) {
			Arrays.fill(used, false);
			q.clear();
			q.add(i);
			used[i] = true;
			
			double max = 0;
			for (int j = 1; j < m; j++) {
				double max2 = 0;
				int cur = 0;
				for (int k = 0; k < n; k++) if (!used[k]) {
					double tmp = 0;
					for (int u : q) {
						tmp += calcDist(L[u], a[u], b[u], L[k], a[k], b[k]);
					}
					if (max2 < tmp) {
						max2 = tmp;
						cur = k;
					}
				}
				max += max2;
				used[cur] = true;
				q.add(cur);
			}
			
			res = Math.max(res, max);
		}
		
		System.out.println(res);
		out.close();
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

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
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