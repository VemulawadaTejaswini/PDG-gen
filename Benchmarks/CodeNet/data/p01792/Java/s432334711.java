import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		// PrintWriter pwriter = new PrintWriter(System.out);

		int p = scan.nextInt();
		int m = scan.nextInt();
		int n = scan.nextInt();
		Casino casino = new Casino();
		casino.printProb(p, m, n, debug);

		scan.close();
		System.exit(0);
	}
}

class Casino {
	boolean debug;

	public void printProb(int p, int m, int n, boolean debug) {
		this.debug = debug;
		if (p == 0) {
		} else if (p == 100) {
		} else if (p > 50) {
			System.out.println(getProbLarge(p / 100d, m, n));
			System.out.println("1");
			System.out.println("1");
		}
	}

	private double getProbLarge(double p, int m, int n) {
		// if p is greater than 50 percent, bet 1 by 1 is best selection
		//
		// probability to increase m to n is represented as f(m,n), then
		// --- f(m,n) = f(m,m+1) * f(m+1,n)
		// --- = f(m,m+1) * f(m+1,m+2) * (f(m+2,m+3) * ..... * f(n-1,n)
		//
		// and
		// --- f(m,m+1) = p + (1-p) * f(m-1,m) * f(m,m+1)
		// bet 1 and success, that probability is p, and probability of fail is
		// (1-p). if fail, retry increase m-1 to m, and m to m+1
		//
		// --- f(m,m+1) = p / ( 1 - (1-p) * f(m-1,m) )
		// --- f(0,1) = 0, f(1,2) = p;
		//
		double[] f = new double[n + 1];
		// f[m] is f(m,m+1)
		f[0] = 0;
		double pf = 1 - p;
		for (int i = 1; i < n; i++)
			f[i] = p / (1 - pf * f[i - 1]);

		double result = 1;
		for (int i = m; i < n; i++)
			result *= f[i];

		return result;
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

	public long nextLong() {
		skipCtlSpace();
		long n = 0;
		boolean minus = false;
		byte b;
		while ((b = getByte()) != -1) {
			if (b == '-')
				minus = true;
			else {
				n *= 10d;
				n += (long) (b - '0');
			}
		}
		if (minus)
			return n * -1;
		else
			return n;
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