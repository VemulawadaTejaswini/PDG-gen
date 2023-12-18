
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	class Time implements Comparable<Time> {
		int start;
		int end;

		Time(int start, int end) {
			this.start = start;
			this.end = end;
		}

		public int compareTo(Time s) {
			return start - s.start;
		}
	}
	
	public void run() {
		
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;
			
			Time[] time = new Time[n];
			for (int i = 0; i < n; i++) {
				String[] start = in.next().split(":");
				String[] end = in.next().split(":");
				
				int s = Integer.valueOf(start[0]) * 3600;
				s += Integer.valueOf(start[1]) * 60;
				s += Integer.valueOf(start[2]);
				int e = Integer.valueOf(end[0]) * 3600;
				e += Integer.valueOf(end[1]) * 60;
				e += Integer.valueOf(end[2]);
				
				time[i] = new Time(s, e);
			}
			
			Arrays.sort(time);
			boolean[] used = new boolean[n];
			
			int cnt = 0, res = 0;
			while (cnt < n) {
				int e = 0;
				for (int i = 0; i < n; i++) if (!used[i]) {
					if (e <= time[i].start) {
						used[i] = true;
						e = time[i].end;
						cnt++;
					}
				}
				res++;
			}
			System.out.println(res);
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