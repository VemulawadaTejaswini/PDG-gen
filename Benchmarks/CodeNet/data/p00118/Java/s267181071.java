import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
	static FastReader in = new FastReader();
	static int[][] separate;
	static char[][] land;
	static int h;
	static int w;
	static List<Integer> ans = new ArrayList<Integer>();

	public static void main(String[] args) {
		try {
			while (run())
				;
		} catch (Exception e) {
		}
		for(int a : ans){
			System.out.println(a);
		}
	}

	private static boolean run() throws Exception {
		h = in.nextInt();
		w = in.nextInt();
		if (h == 0 && w == 0)
			return false;
		land = in.nextCharArray2d(h, w);

		separate = new int[h][w];
		int owner = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (separate[i][j] > 0)
					continue;
				dfs(i, j, land[i][j], ++owner);
			}
		}
		ans.add(owner);
		return true;
	}

	private static void dfs(int i, int j, char type, int owner) throws Exception {
		if (land[i][j] != type || separate[i][j] > 0)
			return;
		separate[i][j] = owner;
		if (j > 0)
			dfs(i, j - 1, type, owner);
		if (i > 0)
			dfs(i - 1, j, type, owner);
		if (j < w - 1)
			dfs(i, j + 1, type, owner);
		if (i < h - 1)
			dfs(i + 1, j, type, owner);
	}

	static void printExit(Object msg) {
		System.out.println(msg);
		System.exit(0);
	}
}

class FastReader {
	private InputStream in = System.in;
	private byte[] buf = new byte[1024];
	private int charNum;
	private int charLen;
	private StringBuilder sb = new StringBuilder();

	public int read() {
		if (charLen == -1)
			throw new InputMismatchException();
		if (charNum >= charLen) {
			charNum = 0;
			try {
				charLen = in.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (charLen <= 0)
				return -1;
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

	public char[][] nextCharArray2d(int lines, int rows) {
		char[][] array = new char[lines][rows];
		for (int i = 0; i < lines; i++)
			array[i] = nextCharArray();
		return array;
	}

	public int nextInt() {
		return Integer.valueOf(next());
	}

	public boolean isWhitespace(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
}