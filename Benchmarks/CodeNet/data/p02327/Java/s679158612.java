import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	static boolean debug = false;

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		PrintWriter pwriter = new PrintWriter(System.out);

		int h = scan.nextInt();
		int w = scan.nextInt();

		Rectangle rg = new Rectangle(h, w, debug);

		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				rg.addTile(i, j, scan.nextInt());

		pwriter.println(rg.getMaxRect());

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Rectangle {
	boolean debug;

	int[][] maxh;

	int tableLast = -1;
	int[] rectangleHeight;
	int[] rectangleLeft;

	int maxArea = 0;

	public Rectangle(int h, int w, boolean debug) {
		this.debug = debug;
		maxh = new int[h][w];
		rectangleHeight = new int[h];
		rectangleLeft = new int[h];
	}

	public int getMaxRect() {
		setMaxh(); // set the number of upper continues clear tile

		for (int h = maxh.length - 1; h >= 0; h--)
			if ((h + 1) * maxh[0].length > maxArea)
				// not need to check, if already found larger rectangle
				getMaxArea(h);
		return maxArea;
	}

	private void getMaxArea(int line) {
		// get max rectangle which lower edge is on the line
		tableLast = -1;

		// Calculate by width
		for (int w = 0; w < maxh[0].length; w++)
			addBar(maxh[line][w], w);

		// Calculate the rectangle area which right edge is terminated on border
		addBar(0, maxh[0].length);
	}

	private void addBar(int h, int w) {
		// if height is higher than current, the width of that rectangle has
		// been fixed, then calculate the area of rectangle
		int start = w;
		while (tableLast >= 0) {
			if (rectangleHeight[tableLast] <= h)
				break;
			maxArea = Math.max(maxArea, (w - rectangleLeft[tableLast]) * rectangleHeight[tableLast]);
			start = Math.min(start, rectangleLeft[tableLast]);
			tableLast--;
		}
		// and add current data as start point of new height bar
		// if it's possible to make the largest rectangle
		if (h > 0 && h * (maxh[0].length - start) > maxArea)
			if (tableLast < 0 || h > rectangleHeight[tableLast]) {
				rectangleHeight[++tableLast] = h;
				rectangleLeft[tableLast] = start;
			}
	}

	private void setMaxh() {
		for (int h = 1; h < maxh.length; h++)
			for (int w = 0; w < maxh[0].length; w++)
				if (maxh[h][w] > 0)
					maxh[h][w] = maxh[h - 1][w] + 1;
	}

	public void addTile(int h, int w, int c) {
		// set 1 to clear tile
		if (c == 1)
			maxh[h][w] = 0;
		else
			maxh[h][w] = 1;
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