import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int x0 = scan.nextInt();
		int y0 = scan.nextInt();
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();

		Projection projection = new Projection(x0, y0, x1, y1);

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			projection.calc(x2, y2, pwriter);
		}
		pwriter.flush();

		scan.close();
		System.exit(0);
	}
}

class Projection {
	// tx = x2*cos*cos + y2*sin*cos + x0*sin*sin - y0*sin*cos
	// ty = x2*sin*cos + y2*sin*sin - x0*sin*cos + y0*cos*cos
	double cos2, sin2, sincos;
	double txd, tyd;

	public Projection(int x0, int y0, int x1, int y1) {
		double t2 = (x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0);
		cos2 = (x1 - x0) * (x1 - x0) / t2;
		sin2 = (y1 - y0) * (y1 - y0) / t2;
		sincos = (x1 - x0) * (y1 - y0) / t2;
		txd = x0 * sin2 - y0 * sincos;
		tyd = -x0 * sincos + y0 * cos2;
	}

	public void calc(int x2, int y2, PrintWriter pw) {
		double tx = x2 * cos2 + y2 * sincos + txd;
		double ty = x2 * sincos + y2 * sin2 + tyd;
		pw.print(String.valueOf(tx));
		pw.print(' ');
		pw.println(String.valueOf(ty));
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