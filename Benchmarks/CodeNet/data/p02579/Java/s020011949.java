import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int ch=sc.nextInt()-1;
		int cw=sc.nextInt()-1;
		int dh=sc.nextInt()-1;
		int dw=sc.nextInt()-1;
		char[][] cs=new char[H][W];
		for (int i = 0; i < cs.length; i++) {
			cs[i]=sc.next().toCharArray();
		}
		long[][] L = new long[H][W];
        for(int i=0;i<H;i++){
        	for (int j = 0; j < W; j++) {
        		L[i][j] = -1;
			}
        }
        int[][] visited = new int[H][W];
        L[ch][cw] = 0;
        PriorityQueue<Edge> Q = new PriorityQueue<Edge>();
        Q.add(new Edge(kumi(ch, cw, W), 0));
        while(!Q.isEmpty()){
            Edge C = Q.poll();
            int h=C.to/W;
            int w=C.to%W;
            if(visited[h][w]==0){
                L[h][w] = C.v;
                visited[h][w] = 1;
                int[] dx= {1,-1,0,0};
        		int[] dy= {0,0,1,-1};
        		for (int j2 = 0; j2 < dy.length; j2++) {
					if (w+dx[j2]>=0&&w+dx[j2]<W&&h+dy[j2]>=0&&h+dy[j2]<H) {
						if (cs[h+dy[j2]][w+dx[j2]]=='.') {
							Q.add(new Edge(kumi(h+dy[j2], w+dx[j2], W),L[h][w]+0));
						}
					}
				}
        		int[] d= {-2,-1,0,1,2};
        				for (int j2 = 0; j2 < d.length; j2++) {
        					for (int k = 0; k < d.length; k++) {
        						if (Math.abs(d[j2])+Math.abs(d[k])<=1) {
        							continue;
        						}
        						if (w+d[j2]>=0&&w+d[j2]<W&&h+d[k]>=0&&h+d[k]<H) {
        							if (cs[h+d[k]][w+d[j2]]=='.') {
        								Q.add(new Edge(kumi(h+d[k], w+d[j2], W),L[h][w]+1));
        							}
        						}
        					}
        		}
            }
        }
		System.out.println(L[dh][dw]);
 	}
	static int kumi(int i, int j, int W){
        return i*W+j;//W列の２次配列を一次元にする
    }
	static class Edge implements Comparable<Edge>{
		int to;
		long v;
		public Edge(int to,long v) {
			this.to=to;
			this.v=v;
		}
		@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Edge) {
    			Edge other = (Edge) obj;
    			return other.to==this.to && other.v==this.v;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.to,this.v);
    	}
    	@Override
		  public int compareTo( Edge p2 ){
			 if (this.v>p2.v) {
				return 1;
			}
			 else if (this.v<p2.v) {
				return -1;
			}
			 else {
				return 0;
			}
		  }
	} 
	static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
