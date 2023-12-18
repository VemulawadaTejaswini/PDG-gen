import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		String s1 = scan.next();
		String s2 = scan.next();

		pwriter.println(StringDef.getDistance(s1, s2));

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class StringDef {
	static int[][] hist;

	public static int getDistance(String s1, String s2) {
		hist = new int[s1.length() + 1][s2.length() + 1];
		for (int p1 = 0; p1 < hist.length; p1++)
			for (int p2 = 0; p2 < hist[0].length; p2++)
				hist[p1][p2] = -1;
		return minDist(s1, s2, 0, 0);

	}

	private static int minDist(String s1, String s2, int p1, int p2) {
	//	System.out.println(p1 + " " + p2);
		if (p1 == s1.length() && p2 == s2.length())
			return 0;
		if (hist[p1][p2] >= 0)
			return hist[p1][p2];
		int ret = Integer.MAX_VALUE;
		if (p1 < s1.length() && p2 < s2.length())
			if (s1.charAt(p1) == s2.charAt(p2))
				ret = minDist(s1, s2, p1 + 1, p2 + 1);
			else // institution
				ret = 1 + minDist(s1, s2, p1 + 1, p2 + 1);
		// insertion
		if (p2 < s2.length())
			ret = Math.min(ret, 1 + minDist(s1, s2, p1, p2 + 1));
		// deletion
		if (p1 < s1.length())
			ret = Math.min(ret, 1 + minDist(s1, s2, p1 + 1, p2));

		hist[p1][p2] = ret;
		return ret;
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