import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class Main {
	
	static final int[] dx = { -1, 0, 0, 1 };
	static final int[] dy = { 0, -1, 1, 0 };
	
	static int h, w, n;
	static boolean[][] wall;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		
		wall = new boolean[h][w];
		int[][] point = new int[n + 1][2];
		
		for (int y = 0; y < h; y++) {
			char[] cs = sc.next().toCharArray();
			for (int x = 0; x < w; x++) {
				char c = cs[x];
				if (c == 'S') {
					point[0] = new int[] { x, y };
				} else if (c == 'X') {
					wall[y][x] = true;
				} else if ('1' <= c && c <= '9') {
					point[c - '0'] = new int[] { x, y };
				}
			}
		}
		
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += bfs(point[i][0], point[i][1], point[i + 1][0], point[i + 1][1]);
		}
		
		System.out.println(total);
	}
	
	static int bfs(int sx, int sy, int gx, int gy) {
		Deque<int[]> q = new ArrayDeque<>();
		boolean[][] visited = new boolean[h][w];
		q.offer(new int[] { sx, sy, 0 });
		while (!q.isEmpty()) {
			int[] now = q.poll();
			if (now[0] == gx && now[1] == gy) return now[2];
			visited[now[1]][now[0]] = true;
			for (int i = 0; i < 4; i++) {
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				if ((0 <= ny && ny < h) && (0 <= nx && nx < w) && !visited[ny][nx] && !wall[ny][nx]) {
					visited[ny][nx] = true;
					q.offer(new int[] { nx, ny, now[2] + 1 });
				}
			}
		}
		return -1;
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