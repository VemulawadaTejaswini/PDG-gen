
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int parseNumber(String exp) {
		int res = 0;
		while (exp.length() > idx) {
			char c = exp.charAt(idx);
			if (c == '+' || c == '*') break;
			
			res = res * 10 + c - '0';
			idx++;
		}
		return res;
	}
	
	int idx = 0;
	int calcLeftToRight(String exp) {
		idx = 0;
		int num1 = 0, num2 = 0;
		while (exp.length() > idx) {
			char c = exp.charAt(idx);
			idx++;
			if ('0' <= c && c <= '9') {
				num1 = num1 * 10 + c - '0';
			} else if (c == '+') {
				num2 = parseNumber(exp);
				num1 += num2;
			} else {
				num2 = parseNumber(exp);
				num1 *= num2;
			}
		}
		
		return num1;
	}
	
	int calcCorrectly(String exp) {
		String after = "";
		idx = 0;
		int num1 = 0, num2 = 0;
		while (exp.length() > idx) {
			char c = exp.charAt(idx);
			idx++;
			if ('0' <= c && c <= '9') {
				num1 = num1 * 10 + c - '0';
			} else if (c == '+') {
				after += num1 + "+";
				num1 = parseNumber(exp);
			} else {
				num2 = parseNumber(exp);
				num1 *= num2;
			}
		}
		after += num1;
		return calcLeftToRight(after);
	}
	
	public void run() {
		String exp = in.next();
		int val = in.nextInt();
		
		int ltor = calcLeftToRight(exp);
		int correct = calcCorrectly(exp);
		
		if (ltor == val) {
			if (correct == val)
				System.out.println("U");
			else 
				System.out.println("L");
		} else {
			if (correct == val)
				System.out.println("M");
			else
				System.out.println("I");
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