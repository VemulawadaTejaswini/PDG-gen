import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {
	int H,W,N,sy,sx;
	char[][] field;
	int[] dy = {0,0,-1,1};
	int[] dx = {1,-1,0,0};
	public void solve() {
		H = nextInt();
		W = nextInt();
		N = nextInt();
		field = new char[H][];
		for(int i = 0;i < H;i++){
			field[i] = next().toCharArray();
			for(int j = 0;j < W;j++){
				if(field[i][j] == 'S'){
					sy = i;
					sx = j;
				}
			}
		}
		int ans = 0;
		for(int i = 1;i <= N;i++){
			Queue<int[]> q = new ArrayDeque<int[]>();
			boolean[][] used = new boolean[H][W];
			q.add(new int[]{sy,sx,0});
			while(q.size() > 0){

				int[] point = q.poll();

				int y = point[0];
				int x = point[1];
				int d = point[2];

				if(field[y][x] == ('0' + i)){
					sy = y;
					sx = x;
					ans += d;
					break;
				}
				if(used[y][x])continue;
				used[y][x] = true;
				for(int j = 0;j < 4;j++){
					int ny = dy[j] + y;
					int nx = dx[j] + x;

					if(ny < 0 || nx < 0 || ny >= H || nx >= W)continue;
					if(field[ny][nx] == 'X')continue;
					q.add(new int[]{ny,nx,d + 1});
				}
			}
		}

		out.println(ans);
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}