
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int SIZE = 19;
	int[][] NEIGHBOR = {
			{ 7, 18,  8,  0,  1,  2,  3},
			{18, 17,  0,  1, 16,  3,  4},
			{ 8,  0,  9,  2,  3, 10,  5},
			{ 0,  1,  2,  3,  4,  5,  6},
			{ 1, 16,  3,  4, 15,  6, 14},
			{ 2,  3, 10,  5,  6, 11, 12},
			{ 3,  4,  5,  6, 14, 12, 13}
	};
	
	public void run() {
		outer : 
		while (true) {
			String s = in.next();
			if (s.matches("#")) break;
			
			for (int i = 0; i < (1 << SIZE); i++) {
				int[] next = new int[7];
				for (int j = 0; j < NEIGHBOR.length; j++) {
					int idx = 0;
					for (int k = 0; k < NEIGHBOR[j].length; k++) {
						int val = (i & (1 << NEIGHBOR[j][k])) != 0 ? 1 : 0;
						idx += (1 << k) * val;
					}
					next[j] = s.charAt(idx) - '0';
				}
				int idx = 0;
				for (int k = 0; k < next.length; k++) {
					int val = next[k];
					idx += (1 << k) * val;
				}
				if (s.charAt(idx) - '0' != next[3]) {
					System.out.println("no");
					continue outer;
				}
			}
			System.out.println("yes");
			
		}
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