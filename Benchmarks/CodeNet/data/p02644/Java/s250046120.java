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
		int K=sc.nextInt();
		int sx=sc.nextInt()-1;
		int sy=sc.nextInt()-1;
		int s=kumi(sx, sy, W);
		int gx=sc.nextInt()-1;
		int gy=sc.nextInt()-1;
		int g=kumi(gx, gy, W);
		char[][] cs=new char[H][];
		for (int i = 0; i < cs.length; i++) {
			cs[i]=sc.next().toCharArray();
		}
		graph G=new graph(H*W);
		int[] dx= {1,-1,0,0};
		int[] dy= {0,0,1,-1};
		long[][] d=G.dijkstra(s, K, W,H,cs);
		long min=Integer.MAX_VALUE;
		for (int i = 0; i < 4; i++) {
			min=Math.min(min, d[g][i]);
		}
		System.out.println(min);
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
	static class graph{
		ArrayList<Edge>[] list;
		int size;
		long INF=Long.MAX_VALUE/2;
		int[] color;
		@SuppressWarnings("unchecked")
		public graph(int n) {
			size = n;
			list = new ArrayList[n];
			color =new int[n];
			for(int i=0;i<n;i++){
				list[i] = new ArrayList<Edge>();
			}
		}
		void addEdge(int from,int to,long w) {
			list[from].add(new Edge(to,w));
		}
		long[][] dijkstra(int s,int K,int W,int H,char[][] cs){
	        long[][] L = new long[size][4];
	        for(int i=0;i<size;i++){
	            for (int j = 0; j < 4; j++) {
					L[i][j]=-1;
				}
	        }
	        int[][] visited = new int[size][4];
	        for (int i = 0; i < 4; i++) {
				L[s][i]=0;
			}
	        PriorityQueue<Pair2> Q = new PriorityQueue<Pair2>();
	        for (int i = 0; i < 4; i++) {
	        	Q.add(new Pair2(s, i, 1, 0));
			}
	        int[] gox= {0,0,1,-1};
	        int[] goy= {1,-1,0,0};
	        while(!Q.isEmpty()){
	            Pair2 C = Q.poll();
	            if(visited[C.x][C.y]==0){
	                L[C.x][C.y] = C.z;
	                visited[C.x][C.y] = 1;
	                for (int i = 0; i < 4; i++) {
	                	if (C.y==i) {
							continue;
						}
						Q.add(new Pair2(C.x, i, C.z+1, 0));
	                }
	                int x=(C.x)/W;
	                int y=(C.x)%W;
	                if (x+gox[C.y]<0||x+gox[C.y]>=H||y+goy[C.y]<0||y+goy[C.y]>=W) {
						continue;
					}
	                if (cs[x+gox[C.y]][y+goy[C.y]]=='@') {
						continue;
					}
	                if (C.w<K) {
						Q.add(new Pair2(kumi(x+gox[C.y], y+goy[C.y], W), C.y, C.z, C.w+1));
					}else {
						Q.add(new Pair2(kumi(x+gox[C.y], y+goy[C.y], W), C.y, C.z+1, 1));
					}
	            }
	        }
	        return L;
	    }
	}
	static class Pair2 implements Comparable<Pair2>{
    	public int x;
    	public int y;
    	public int z;
    	public int w;
    	public Pair2(int x,int y,int z,int w) {
    		this.x=x;
    		this.y=y;
    		this.z=z;
    		this.w=w;
    	}
    	@Override
    	public boolean equals(Object obj) {
    		if(obj instanceof Pair2) {
    			Pair2 other = (Pair2) obj;
    			return other.x==this.x && other.y==this.y&& other.z==this.z && other.w==this.w;
    		}
    		return false;
    	}//同値の定義
    	@Override
    	public int hashCode() {
    		return Objects.hash(this.x,this.y,this.z,this.w);
    	}//これ書かないと正しく動作しない（要　勉強）
    	@Override
    	public int compareTo( Pair2 p2 ){
    		if (this.z>p2.z) {
    			return 1;
    		}
    		else if (this.z<p2.z) {
    			return -1;
    		}
    		else {
    			if (this.w>p2.w) {
        			return 1;
        		}
        		else if (this.w<p2.w) {
        			return -1;
        		}else {
					return 0;
				}
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
