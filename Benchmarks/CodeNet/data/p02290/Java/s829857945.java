import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner(System.in);
		PrintWriter pwriter = new PrintWriter(System.out);

		int x0 = scan.nextInt();
		int y0 = scan.nextInt();
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();

		Geometry g = new Geometry();
		g.setBase(x0, y0, x1, y1);

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			Point t = g.projection(x2, y2);
			DecimalFormat df = new DecimalFormat("#####.#########");
			pwriter.print(df.format(t.x));
			pwriter.print(" ");
			pwriter.println(df.format(t.y));
		}
		pwriter.flush();

		scan.close();
		System.exit(0);
	}
}

class Point {
	double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

class Geometry {
	// rotate x0,y0 - x1,y1 to horizontal, and calculate projection point t, and
	// rotate back, then point t (tx,ty) is as follows
	//
	// tx = x2*cos*cos + y2*sin*cos + x0*sin*sin - y0*sin*cos
	// = x2*cos*cos + y2*sin*cos + txd
	// ty = x2*sin*cos + y2*sin*sin - x0*sin*cos + y0*cos*cos
	// = x2*sin*cos + y2*sin*sin + tyd
	//
	// txd,tyd is not necessary calculate each x2,y2
	//
	double cos2, sin2, sincos;
	double txd, tyd;

	public void setBase(int x0, int y0, int x1, int y1) {
		double t2 = (x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0);
		cos2 = (x1 - x0) * (x1 - x0) / t2;
		sin2 = (y1 - y0) * (y1 - y0) / t2;
		sincos = (x1 - x0) * (y1 - y0) / t2;
		txd = x0 * sin2 - y0 * sincos;
		tyd = -x0 * sincos + y0 * cos2;
	}

	public Point projection(int x, int y) {
		return new Point(x * cos2 + y * sincos + txd, x * sincos + y * sin2 + tyd);
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