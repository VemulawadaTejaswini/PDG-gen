import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	static boolean debug = true;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		PrintWriter pwriter = new PrintWriter(System.out);

		int m = scan.nextInt();
		int n = scan.nextInt();
		Flag fg = new Flag(m, n);
		for (int i = 0; i < m; i++)
			fg.addChar(i, scan.next());
		fg.addEmblem(scan.next(), scan.next());

		pwriter.println(fg.getMaxEmblem());

		pwriter.flush();

		scan.close();
		System.exit(0);
	}
}

class Flag {
	// 'fg' is match counter
	// fg[0] is used as match with emblem
	// fg[1], fg[2], fg[3] is used as match count if it change to I, O, J

	int[][][] fg;

	String[] fc;

	char e00, e01, e10, e11; // emblem character
	int[] ioj = new int[256]; // used to convert I to 1, O to 2, J to 3

	public Flag(int m, int n) {
		fg = new int[4][m][n];
		fc = new String[m];
		ioj['I'] = 1;
		ioj['O'] = 2;
		ioj['J'] = 3;
	}

	public int getMaxEmblem() {
		// scan all flag area to count up fg[]
		int cnt = setMatchCount();

		// adjust for using white paper
		cnt += getIncrease();

		return cnt;
	}

	private int getIncrease() {
		int ret = 0;
		for (int m = 0; m < fg[0].length; m++)
			for (int n = 0; n < fg[0][0].length; n++) {
				int ic = Math.max(fg[1][m][n], Math.max(fg[2][m][n], fg[3][m][n]));
				ic -= fg[0][m][n];
				ret = Math.max(ret, ic);
				// increase match count by change character, but decrease
				// already matched
			}
		return ret;
	}

	private int setMatchCount() {
		int c = 0;
		for (int m = 0; m < fg[0].length - 1; m++)
			for (int n = 0; n < fg[0][0].length - 1; n++)
				c += setMatch(m, n);
		return c;
	}

	private int setMatch(int m, int n) {
		char f00 = fc[m].charAt(n);
		char f01 = fc[m].charAt(n + 1);
		char f10 = fc[m + 1].charAt(n);
		char f11 = fc[m + 1].charAt(n + 1);

		boolean match = false;
		if (f00 == e00)
			if (f01 == e01)
				if (f10 == e10)
					if (f11 == e11) {
						// all matched with emblem
						fg[0][m][n]++;
						fg[0][m][n + 1]++;
						fg[0][m + 1][n]++;
						fg[0][m + 1][n + 1]++;
						match = true;
					} else
						// 3 character matched
						fg[ioj[e11]][m + 1][n + 1]++;
				else if (f11 == e11)
					fg[ioj[e10]][m + 1][n]++;
				else
					;
			else if (f10 == e10 && f11 == e11)
				fg[ioj[e01]][m][n + 1]++;
			else
				;
		else if (f01 == e01 && f10 == e10 && f11 == e11)
			fg[ioj[e00]][m][n]++;
		else
			;

		if (match)
			return 1;
		else
			return 0;
	}

	public void addEmblem(String s0, String s1) {
		e00 = s0.charAt(0);
		e01 = s0.charAt(1);
		e10 = s1.charAt(0);
		e11 = s1.charAt(1);
	}

	public void addChar(int m, String s) {
		fc[m] = new String(s);
	}

}

class UserScanner {
	private InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public UserScanner(InputStream inStream) {
		in = inStream;
	}

	private void read() {
		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	private byte getByte() {
		if (ptr >= buflen)
			read();
		if (buflen < 0 || isCtlSpace(buffer[ptr])) {
			return -1;
		} else
			return buffer[ptr++];
	}

	private void skipCtlSpace() {
		for (; ptr < buflen; ptr++)
			if (!isCtlSpace(buffer[ptr]))
				return;
		read();
		skipCtlSpace();
	}

	private boolean isCtlSpace(byte b) {
		if (b <= ' ' || b > '~')
			return true;
		else
			return false;
	}

	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(9);
		}
	}

	public String next() {
		skipCtlSpace();
		StringBuilder sb = new StringBuilder();
		byte b;
		while ((b = getByte()) != -1) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
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