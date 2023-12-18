import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
	int H, W;
	boolean[][] MAP;
	
	int[] dirX = {-1,  0, 0, 1};
	int[] dirY = { 0, -1, 1, 0};
	
	class Node{
		int x, y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		boolean isOk(){
			return ( (0 <= x && x < W) && (0 <= y && y < H) ) && MAP[x][y];
		}
		
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Node node = (Node) o;
			return x == node.x && y == node.y;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		H = scanner.nextInt();
		W = scanner.nextInt();
		
		MAP = new boolean[W][H];
		
		int SY = scanner.nextInt() - 1;
		int SX = scanner.nextInt() - 1;
		int GY = scanner.nextInt() - 1;
		int GX = scanner.nextInt() - 1;
		
		for (int y = 0; y < H; y++) {
			String S = scanner.next();
			
			for (int x = 0; x < W; x++) {
				MAP[x][y] = S.charAt(x) == '.';
			}
		}
		
		LinkedList<Node> walkList   = new LinkedList<>();
		HashSet<Node>    warpList   = new HashSet<>();
		HashSet<Node>    closeList  = new HashSet<>();
		
		walkList.add( new Node(SX, SY) );
		
		Node G = new Node(GX, GY);
		
		int warpNum = 0;
		
		while( !walkList.isEmpty() ) {
			
			//コスト0で移動できる場所を埋める．
			while ( !walkList.isEmpty() ) {
				Node node = walkList.poll();
				
				if ( closeList.contains(node) ) continue;
				
				for (int i = 0; i < 4; i++) {
					int x = node.x + dirX[i];
					int y = node.y + dirY[i];
					
					if( ((0 <= x && x < W) && (0 <= y && y < H) ) && MAP[x][y] ){
						walkList.add( new Node(node.x + dirX[i], node.y + dirY[i]) );
					}
				}
				
				warpList.add(node);
				closeList.add(node);
			}
			
			if ( closeList.contains(G) ){
				System.out.println(warpNum);
				return;
			}
			
			warpNum++;
			
			for ( Node node : warpList) {
				
				HashSet<Node> T = new HashSet<>();
				
				for (int x = -2; x <= 2; x++) {
					for (int y = -2; y <= 2; y++) {
						Node t = new Node(node.x + x, node.y + y);
						
						if ( !t.isOk() ) continue;
						
						if ( !closeList.contains(t) ){
							T.add(t);
						}
					}
				}
				
				walkList.addAll(T);
			}
			
			warpList.clear();
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
