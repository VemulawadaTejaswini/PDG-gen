
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	
	public void run() {
		int n = in.nextInt(), w = in.nextInt(), h = in.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];
		int[] d = new int[n];
		
		int[] imosx = new int[2*w+2];
		int[] imosy = new int[2*h+2];
		
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			d[i] = in.nextInt();
			
			int l = Math.max(0, 2*(x[i]-d[i])), r = Math.min(2*w+1, 2*(x[i]+d[i])+1);
			imosx[l] += 1;
			imosx[r] -= 1;
			
			l = Math.max(0, 2*(y[i]-d[i]));
			r = Math.min(2*h+1, 2*(y[i]+d[i])+1);
			
			imosy[l] += 1;
			imosy[r] -= 1;
		}
		
		boolean resx = true;
		int dif = 0;
		for (int i = 0; i <= 2*w; i++) {
			dif += imosx[i];
			imosx[i] = dif;
			resx &= imosx[i] != 0;
		}

		boolean resy = true;
		dif = 0;
		for (int i = 0; i <= 2*h; i++) {
			dif += imosy[i];
			imosy[i] = dif;
			resy &= imosy[i] != 0;
		}
//		System.out.println(Arrays.toString(imosx));
//		System.out.println(Arrays.toString(imosy));
		System.out.println(resx | resy ? "Yes" : "No");
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