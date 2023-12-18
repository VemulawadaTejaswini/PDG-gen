import java.awt.Point;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Main {
	
	static final int[] dx = { -1, 0, 0, 1 };
	static final int[] dy = { 0, -1, 1, 0 };
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		
		char[][] block = new char[h][w];
		Point[] point = new Point[n + 1];
		
		for (int y = 0; y < h; y++) {
			String s = sc.next();
			for (int x = 0; x < w; x++) {
				char c = s.charAt(x);
				if (c == 'S') {
					point[0] = new Point(x, y);
				} else if ('1' <= c && c <= '9') {
					point[c - '0'] = new Point(x, y);
				}
				block[y][x] = c;
			}
		}
		
		int total = 0;
		int[][] time = new int[h][w];
		Deque<Point> q = new ArrayDeque<>();
		
		for (int i = 0; i < n; i++) {
			for (int y = 0; y < h; y++) {
				for (int x = 0; x < w; x++) {
					time[y][x] = 0;
				}
			}
			q.clear();
			q.offer(point[i]);
			while (!q.isEmpty()) {
				Point p = q.poll();
				if (p.equals(point[i + 1])) {
					total += time[p.y][p.x];
					break;
				}
				for (int j = 0; j < 4; j++) {
					int _x = p.x + dx[j];
					int _y = p.y + dy[j];
					if (((0 <= _y && _y < h) && (0 <= _x && _x < w)) && time[_y][_x] == 0 && block[_y][_x] != 'X') {
						time[_y][_x] = time[p.y][p.x] + 1;
						q.offer(new Point(_x, _y));
					}
				}
			}
		}
		
		System.out.println(total);
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) return false;
		}
		return true;
	}
	
	private byte readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			System.out.println("poyo");
			return -1;
		}
	}
	
	private boolean isPrintableChar(int c) {
		return '!' <= c && c <= '~';
	}
	
	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}
	
	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) { throw new NoSuchElementException(); }
		StringBuilder sb = new StringBuilder();
		byte b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	public int nextInt() {
		if (!hasNext()) { throw new NoSuchElementException(); }
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) { throw new NumberFormatException(); }
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	
}