import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class Main{
	static StringBuilder out = new StringBuilder();
	static final String OK = "OK";
	static final String NG = "NG";
	static final String Possible = "Possible";
	static final String Impossible = "Impossible";
	static FastReader in = new FastReader();
	static final int HEADS = 1;
	static final int TAILS = 0;

	// static final int INF = Integer.MAX_VALUE - 300000000;

	public static void main(String[] args) {
		while (upsideDown())
			;
	}

	private static boolean upsideDown() {
		int h = in.nextInt();
		int w = in.nextInt();
		if (h == 0 && w == 0) return false;

		int[][] senbei = in.nextIntArray2D(h, w);

		System.out.println(solve(senbei));
		return true;
	}

	private static int solve(int[][] senbei) {
		int row = senbei.length;
		int line = senbei[0].length;
		int ex = (int) Math.pow(2, row);

		int[] score = new int[ex];

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < ex; j++) {
				int tempScore = 0;
				int[] filter = makeFilter(row, j);
				for (int k = 0; k < row; k++) {
					tempScore += (senbei[k][i] + filter[k]) % 2;
				}
				score[j] += Math.max(tempScore, row - tempScore);
			}
		}

		int maxScore = 0;
		for (int i = 0; i < ex; i++) {
			maxScore = Math.max(maxScore, score[i]);
		}
		return maxScore;
	}

	private static int[] makeFilter(int row, int i) {
		int[] filter = new int[row];
		int temp = i;
		for (int j = 0; j < row; j++) {
			filter[j] = temp % 2;
			temp /= 2;
		}
		return filter;
	}

	static void printExit(Object msg) {
		System.out.println(msg);
		System.exit(0);
	}
}

class FastReader{
	private InputStream in = System.in;
	private byte[] buf = new byte[1024];
	private int charNum;
	private int charLen;
	private StringBuilder sb = new StringBuilder();

	public int read() {
		if (charLen == -1) throw new InputMismatchException();
		if (charNum >= charLen) {
			charNum = 0;
			try {
				charLen = in.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (charLen <= 0) return -1;
		}
		return buf[charNum++];
	}

	public String next() {
		int c = read();
		while (isWhitespace(c)) {
			c = read();
		}
		sb.setLength(0);
		do {
			sb.appendCodePoint(c);
			c = read();
		} while (!isWhitespace(c));
		return sb.toString();
	}

	public char[] nextCharArray() {
		return next().toCharArray();
	}

	public char[][] nextCharArray2d(int lines) {
		char[] first = nextCharArray();
		char[][] array = new char[lines][first.length];
		array[0] = first;
		for (int i = 1; i < lines; i++)
			array[i] = nextCharArray();
		return array;
	}

	public char[][] nextCharArray2d(int lines, int rows) {
		char[][] array = new char[lines][rows];
		for (int i = 0; i < lines; i++)
			array[i] = nextCharArray();
		return array;
	}

	public int nextInt() {
		return (int) nextLong();
	}

	public int[] nextIntArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
			array[i] = nextInt();
		return array;
	}

	public List<Integer> nextIntList(int n) {
		Integer[] array = new Integer[n];
		for (int i = 0; i < n; i++)
			array[i] = nextInt();
		return Arrays.asList(array);
	}

	public int[][] nextIntArray2D(int n, int m) {
		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++)
			array[i] = nextIntArray(m);
		return array;
	}

	public List<int[]> nextIntsList(int n, int m) {
		List<int[]> list = new ArrayList<int[]>(n);
		for (int i = 0; i < n; i++)
			list.add(nextIntArray(m));
		return list;
	}

	public long nextLong() {
		int c = read();
		while (isWhitespace(c)) {
			c = read();
		}
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9') throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isWhitespace(c));
		return res * sgn;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public double[] nextDoubleArray(int n) {
		double[] array = new double[n];
		for (int i = 0; i < n; i++)
			array[i] = nextDouble();
		return array;
	}

	public boolean isWhitespace(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
}