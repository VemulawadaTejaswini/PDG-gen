
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	long MAX = 100000;
	public void run() {
		while (true) {
			long a = in.nextInt(), b = in.nextInt(), d = in.nextInt();
			if (a == 0) break;
			
			HashMap<Long, Long> map = new HashMap<Long, Long>();
			map.put(0L, 0L);
			for (long i = a; i <= MAX; i += a) {
				long cnt = i / a;
				map.put(i, cnt);
				map.put(-i, cnt);
			}
			
			long x = MAX, y = MAX;
			for (int i = 0; i <= MAX; i += b) {
				long cnt2 = i / b;
				if (map.containsKey(i - d)) {
					long cnt1 = map.get(i - d);
					if (x + y > cnt1 + cnt2 || 
					   (x + y == cnt1 + cnt2 && a * x + b * y > a * cnt1 + b * cnt2)) {
						x = cnt1;
						y = cnt2;
					}
				}
				if (map.containsKey(d - i)) {
					long cnt1 = map.get(d - i);
					if (x + y > cnt1 + cnt2 || 
					   (x + y == cnt1 + cnt2 && a * x + b * y > a * cnt1 + b * cnt2)) {
						x = cnt1;
						y = cnt2;
					}
				}
				if (map.containsKey(d + i)) {
					long cnt1 = map.get(d + i);
					if (x + y > cnt1 + cnt2 || 
					   (x + y == cnt1 + cnt2 && a * x + b * y > a * cnt1 + b * cnt2)) {
						x = cnt1;
						y = cnt2;
					}
				}
			}
			
			System.out.println(x + " " + y);
			
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