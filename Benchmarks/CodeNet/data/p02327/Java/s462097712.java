import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class Main {
	static boolean debug = true;

	public static void main(String[] args) throws IOException {

		UserScanner scan = new UserScanner();
		PrintWriter pwriter = new PrintWriter(System.out);

		int h = scan.nextInt();
		int w = scan.nextInt();

		Rectangle rg = new Rectangle(h, w, debug);

		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				rg.addTile(i, j, scan.nextInt());

		pwriter.println(rg.getMaxSquare());

		pwriter.flush();
		scan.close();
		System.exit(0);
	}
}

class Rectangle {
	boolean debug;
	Tile[][] tile;
	int maxArea;

	class Tile {
		boolean isClear;
		// largest height, width of horizontal rectangle for left-upper tile
		int h_HrRect;
		int w_HrRect;
		// same with vertical rectangle
		int h_VrRect;
		int w_VrRect;

		public Tile(boolean clear) {
			isClear = clear;
			if (isClear) {
				h_HrRect = 1;
				w_HrRect = 1;
				h_VrRect = 1;
				w_VrRect = 1;
			} else {
				h_HrRect = 0;
				w_HrRect = 0;
				h_VrRect = 0;
				w_VrRect = 0;
			}
		}

		public int getMaxArea() {
			return Math.max(h_HrRect * w_HrRect, h_VrRect * w_VrRect);
		}
	}

	public Rectangle(int h, int w, boolean debug) {
		this.debug = debug;
		tile = new Tile[h][w];
	}

	public int getMaxSquare() {

		for (int h = 1; h < tile.length; h++) // set height to first row
			if (tile[h][0].isClear) {
				tile[h][0].h_HrRect = tile[h - 1][0].h_HrRect + 1;
				tile[h][0].h_VrRect = tile[h - 1][0].h_VrRect + 1;
			}

		for (int w = 1; w < tile[0].length; w++) // set width to top line
			if (tile[0][w].isClear) {
				tile[0][w].w_HrRect = tile[0][w - 1].w_HrRect + 1;
				tile[0][w].w_VrRect = tile[0][w - 1].w_VrRect + 1;
			}

		for (int h = 1; h < tile.length; h++)
			for (int w = 1; w < tile[0].length; w++)

				if (tile[h][w].isClear) {

					// horizontal rectangle
					// width is increase 1 to left tile,
					tile[h][w].w_HrRect = tile[h][w - 1].w_HrRect + 1;

					// if left tile is clear, height must be check with upper
					if (tile[h][w - 1].isClear)
						if (tile[h - 1][w].w_HrRect >= tile[h][w].w_HrRect)
							tile[h][w].h_HrRect = tile[h - 1][w].h_HrRect + 1;
						else
							tile[h][w].h_HrRect = 1;
					else
						tile[h][w].h_HrRect = tile[h - 1][w].h_VrRect + 1;

					// same for vertical rectangle
					tile[h][w].h_VrRect = tile[h - 1][w].h_VrRect + 1;

					if (tile[h - 1][w].isClear)
						if (tile[h][w - 1].h_VrRect >= tile[h][w].h_VrRect)
							tile[h][w].w_VrRect = tile[h][w - 1].w_VrRect + 1;
						else
							tile[h][w].w_VrRect = 1;
					else
						tile[h][w].w_VrRect = tile[h][w - 1].w_HrRect + 1;
					
					if (tile[h][w].getMaxArea() > maxArea)
						maxArea = tile[h][w].getMaxArea();
				}

		return maxArea;
	}

	public void addTile(int h, int w, int c) {
		// set countable tile as true
		if (c == 0) {
			tile[h][w] = new Tile(true);
			maxArea = 1;
		} else
			tile[h][w] = new Tile(false);
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