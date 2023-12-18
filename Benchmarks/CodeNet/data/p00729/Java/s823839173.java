
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	public void run() {
		
		while (true) {
			int n = in.nextInt(), m = in.nextInt();
			if (n == 0) break;
			
			int r = in.nextInt();
			int[] t = new int[r];
			int[] a = new int[r];
			int[] b = new int[r];
			int[] s = new int[r];
			
			for (int i = 0; i < r; i++) {
				t[i] = in.nextInt();
				a[i] = in.nextInt();
				b[i] = in.nextInt();
				s[i] = in.nextInt();				
			}
			
			int q = in.nextInt();
			boolean[] ok = new boolean[1261];
			for (int i = 0; i < q; i++) {
				int res = 0;
				int[] start = new int[n+1];
				Arrays.fill(ok, false);
				Arrays.fill(start, -1);
				int ts = in.nextInt(), te = in.nextInt(), nm = in.nextInt();
				for (int j = 0; j < r; j++) {
					if (nm == b[j]) {
						if (start[a[j]] != -1) {
							int end = t[j];
							for (int k = start[a[j]]; k < end; k++) {
								ok[k] = true;
							}
							start[a[j]] = -1;
						} else {
							start[a[j]] = t[j];
						}
					}
				}
				
				for (int j = ts; j < te; j++) {
					if (ok[j]) {
//						System.out.println(j);
						res++;
					}
				}
				System.out.println(res);
			}
			
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