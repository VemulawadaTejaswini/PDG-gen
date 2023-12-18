import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);
		int n = scan.nextInt();
		int m = scan.nextInt();
		Coin c = new Coin(n, m);
		for (int i = 0; i < m; i++)
			c.addDenom(i, scan.nextInt());
		pwriter.println(c.getAnswer(n));

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Coin {
	int[] denom;
	int[][] hist;

	public Coin(int n, int m) {
		denom = new int[m];
		hist = new int[n + 1][m];
	}

	public int getAnswer(int n) {
		return getPieces(n, denom.length - 1);
	}

	private int getPieces(int n, int dix) {
		if (n == 0)
			return 0;
		if (n < 0 || dix < 0)
			return Integer.MAX_VALUE / 2;
		if (hist[n][dix] != 0)
			return hist[n][dix];
		int min = Math.min(getPieces(n, dix - 1), getPieces(n - denom[dix], dix) + 1);
		hist[n][dix] = min;
		return min;
	}

	public void addDenom(int i, int d) {
		denom[i] = d;
	}

}

class UserScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean read() throws IOException {
		ptr = 0;
		buflen = in.read(buffer);
		if (buflen <= 0)
			return false;
		else
			return true;
	}

	private byte getByte() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() throws IOException {
		if (ptr >= buflen)
			read();
		if (isCtlSpace(buffer[ptr])) {
			ptr++;
			skipCtlSpace();
		}
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() throws IOException {
		in.close();
	}

	public String next() throws IOException {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() throws IOException {
		skipCtlSpace();
		int n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10;
				n += (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
	}
}