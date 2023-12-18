import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	private static final int[][] DIFF = { {0, -1}, {0, 1}, {-1, 0}, {1, 0} };
	
	class Node implements Comparable<Node> {
		int x, y, det, cost, sur;
		
		Node(int x, int y, int det, int cost, int sur) {
			this.x    = x;
			this.y    = y;
			this.det  = det;
			this.cost = cost;
			this.sur  = sur;
		}
		
		@Override
		public int compareTo(Node o) {
			if (cost == o.cost) {
				if (sur == o.sur) {
					return 0;
				} else {
					return sur - o.sur;
				}
			} else {
				return cost - o.cost;
			}
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int K = scanner.nextInt();
		
		int SY = scanner.nextInt()-1;
		int SX = scanner.nextInt()-1;
		int GY = scanner.nextInt()-1;
		int GX = scanner.nextInt()-1;
		
		boolean[][] canPass = new boolean[W][H];
		
		for (int h = 0; h < H; h++) {
			String S = scanner.next();
			
			for (int w = 0; w < W; w++) {
				canPass[w][h] = S.charAt(w) == '.';
			}
		}
		
		PriorityQueue<Node> openList  = new PriorityQueue<>();
		boolean[][][] closeList = new boolean[W][H][4];
		
		for (int i = 0; i < 4; i++) {
			closeList[SX][SY][i] = true;
			
			int x = SX + DIFF[i][0];
			int y = SY + DIFF[i][1];
			
			if ( (x < 0 || W <= x) || (y < 0 || H <= y) ) continue;
			if ( !canPass[x][y] ) continue;
			
			openList.add( new Node(x, y, i,1, 1));
		}
		
		while ( !openList.isEmpty() ) {
			Node n = openList.poll();
			
			if ( closeList[n.x][n.y][n.det] ) continue;
			
			if (n.x == GX && n.y == GY) {
				System.out.println(n.cost);
				return;
			}
			
			for (int i = 0; i < 4; i++) {
				if ( i == n.det ) {
					//直進
					int x = n.x + DIFF[i][0];
					int y = n.y + DIFF[i][1];
					
					if ( (x < 0 || W <= x) || (y < 0 || H <= y) ) continue;
					if ( !canPass[x][y] ) continue;
					if ( closeList[x][y][i] ) continue;
					
					if (n.sur == K) {
						openList.add(new Node(x, y, i,n.cost+1,1));
					} else {
						openList.add(new Node(x, y, i, n.cost,n.sur+1));
					}
				} else {
					//方向転換
					openList.add(new Node(n.x, n.y, i, n.cost+1,0));
				}
			}
			
			closeList[n.x][n.y][n.det] = true;
		}
		
		System.out.println(-1);
	}
	
	public static void main(String[] args) {
		new Main();
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
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	
	private int readByte() {
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}
	
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
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
	
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
