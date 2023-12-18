
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class Main{
	InputStream is;
	PrintWriter out;
	String INPUT = "./data/judge/201708/A0531.txt";
	
	
	void solve() {
		while (true){
			int W = ni();
			int H = ni();
			if (W + H == 0) break;
			int N = ni();
			int MAX_N = N + 16;
			X1 = new int[MAX_N];
			X2 = new int[MAX_N];
			Y1 = new int[MAX_N];
			Y2 = new int[MAX_N];
			for (int i = 0; i < N; ++i){
				X1[i] = ni();
				Y1[i] = ni();
				X2[i] = ni();
				Y2[i] = ni();
			}
			
			//W = compress(X1, X2, W);
			//H = compress(Y1, Y2, H);
			
			int[][] fld = new int[2 * MAX_N][2 * MAX_N];
			
			//imos???
			for (int i = 0; i < N; ++i){
				fld[Y1[i]][X1[i]] ++;
				fld[Y1[i]][X2[i]] --;
				fld[Y2[i]][X1[i]] --;
				fld[Y2[i]][X2[i]] ++;
			}
			
			//?¨?????§?
			for (int i = 0; i < H; ++i){
				for (int j = 1; j < W; ++j){
					fld[i][j] += fld[i][j - 1];
				}
			}
			
			//???????§?
			for (int j = 0; j < W; ++j){
				for (int i = 1; i < H; ++i){
					fld[i][j] += fld[i - 1][j];
				}
			}
			
			out.println(bfs(fld, W, H));
			
		}
	}
	
	int[][] dir = {{1, 0},{-1, 0},{0, -1},{0, 1}};
	int bfs(int[][] fld, int W, int H){
		Queue<Integer> queue = new LinkedList<>();
		int cnt = 0;
		for (int i = 0; i < H; ++i){
			for (int j = 0; j < W; ++j){
				if (fld[i][j] == 0){
					cnt ++;
					queue.offer(i * W + j);
					while (!queue.isEmpty()){
						int now = queue.poll();
						int x = now / W;
						int y = now % W;
						fld[x][y] = -1;
						for (int[] d : dir){
							int nx = x + d[0];
							int ny = y + d[1];
							if (nx >= 0 && nx < H && ny >= 0 && ny < W && fld[nx][ny] == 0){
								queue.offer(nx * W + ny);
							}
						}
					}
				}
			}
		}
		return cnt;
	}
	
	/*****************???????????£???*******************/
	int[] X1;
	int[] X2;
	int[] Y1;
	int[] Y2;
	
	int compress(int[] x1, int[] x2, int w) {
        int n = x1.length;
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < n; ++i){
        	for (int d = -1; d <= 0; ++d){
        		int tx1 = x1[i] + d;
        		if (1 <= tx1 && tx1 <= w) set.add(tx1);
        	}
        	
        	for (int d = 0; d <= 1; ++d){
        		int tx2 = x2[i] + d;
        		if (1 <= tx2 && tx2 <= w) set.add(tx2);
        	}
        }	
        
        Integer[] x = set.toArray(new Integer[0]);
        for (int i = 0; i < n; ++i){
        	x1[i] = Arrays.binarySearch(x, x1[i]) + 1;
        	x2[i] = Arrays.binarySearch(x, x2[i]) + 1;
        }
        
        return x.length;
	}
	
	
	void run() throws Exception {
		is = oj ? System.in : new FileInputStream(new File(INPUT));
		out = new PrintWriter(System.out);

		long s = System.currentTimeMillis();
		solve();
		out.flush();
		tr(System.currentTimeMillis() - s + "ms");
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;

	private int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}

	private boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}

	private int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}

	private double nd() {
		return Double.parseDouble(ns());
	}

	private char nc() {
		return (char) skip();
	}

	private String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != '
									// ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	private char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}

	private char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}

	private int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}

	private int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}

		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}

	private boolean oj = System.getProperty("ONLINE_JUDGE") != null;

	private void tr(Object... o) {
		if (!oj)
			System.out.println(Arrays.deepToString(o));
	}
}