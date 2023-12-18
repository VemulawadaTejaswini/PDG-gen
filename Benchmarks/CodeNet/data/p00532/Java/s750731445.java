import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = true;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		PrintWriter pwriter = new PrintWriter(System.out);

		int n = scan.nextInt();
		int m = scan.nextInt();
		ChristmasParty crp = new ChristmasParty(n, m);

		for (int i = 0; i < m; i++)
			crp.setTarget(i, scan.nextInt());
		for (int i = 0; i < m; i++)
			for (int j = 1; j <= n; j++) // friends number is from 1, not zero
				crp.setResult(i, j, scan.nextInt());

		for (int i = 1; i <= n; i++)
			pwriter.println(crp.getPoint(i));

		pwriter.flush();

		scan.close();
		System.exit(0);
	}
}

class ChristmasParty {
	int[] target;
	int[] point;

	public ChristmasParty(int n, int m) {
		target = new int[m];
		point = new int[n + 1];
	}

	public int getPoint(int n) {
		return point[n];
	}

	public void setResult(int m, int n, int ans) {
		if (target[m] == ans)
			point[n]++;
		else
			point[target[m]]++;
	}

	public void setTarget(int m, int t) {
		target[m] = t;
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