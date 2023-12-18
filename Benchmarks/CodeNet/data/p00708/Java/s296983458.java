import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
	static final long MOD=1000000007;
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		while (true) {
			int V=sc.nextInt();
			if (V==0) {
				break;
			}
			double[] x=new double[V];
			double[] y=new double[V];
			double[] z=new double[V];
			double[] r=new double[V];
 			MinimumSpanningTree minimumSpanningTree=new MinimumSpanningTree(V);
			for (int i = 0; i < V; i++) {
				x[i]=sc.nextDouble();
				y[i]=sc.nextDouble();
				z[i]=sc.nextDouble();
				r[i]=sc.nextDouble();
			}
			for (int i = 0; i < z.length; i++) {
				for (int j = i+1; j < z.length; j++) {
					minimumSpanningTree.addEdge(i, j, Math.max(getdist(x[i], y[i], z[i], x[j], y[j], z[j], r[i], r[j]),0));
				}
			}
			BigDecimal bDecimal=new BigDecimal(minimumSpanningTree.getMiniWeight());
			out.println(bDecimal.setScale(3, RoundingMode.HALF_UP));
		}
		out.flush();
	}
	static double getdist(double x1,double y1,double z1,double x2,double y2,double z2,double r1,double r2) {
		return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2)+Math.pow(z1-z2, 2))-r1-r2;
	}
	static class MinimumSpanningTree{
		public PriorityQueue<Pair2> priorityQueue;
		public int V;
		public UnionFindTree unionFindTree;
		public MinimumSpanningTree(int V) {
			priorityQueue=new PriorityQueue<>();
			this.V=V;
			unionFindTree=new UnionFindTree(V); 
		}
		public void addEdge(int a,int b,double w) {
			priorityQueue.offer(new Pair2(a, b, w));
		}
		public double getMiniWeight() {
			double sum=0;
			while (!priorityQueue.isEmpty()) {
				Pair2 pair2=priorityQueue.poll();
				if (unionFindTree.same(pair2.x, pair2.y)) {
					continue;
				}
				sum+=pair2.z;
				unionFindTree.union(pair2.x, pair2.y, 0);
			}
			return sum;
		}
		public class UnionFindTree{
	    	int[] par;
	    	int[] rank;
	    	int[] size;
	    	int[] diff_weight;
	    	int arraysize;
	    	public UnionFindTree(int n) {
	    		this.par=new int[n];
	    		this.rank=new int[n];
	    		this.size=new int[n];
	    		this.diff_weight=new int[n];
	    		arraysize=n;
	    		for (int i = 0; i < arraysize; i++) {
					set(i);
				}
	    	}
	    	public void set(int i) {
	    		par[i]=i;
	    		rank[i]=0;
	    		size[i]=1;
	    		diff_weight[i]=0;
	    	}
	    	public void union(int x,int y,int w) {
	    		w += weight(x); 
	    		w -= weight(y);
	    		int rootx=find(x);
	    		int rooty=find(y);
	    		if (rootx==rooty) {
					return;
				}
	    		if (rank[rootx]>rank[rooty]) {
					par[rooty]=rootx;
					diff_weight[rooty] = w;
					size[rootx]+=size[rooty];
				}
	    		else if (rank[rootx]<rank[rooty]) {
					par[rootx]=rooty;
					w=-w;
					diff_weight[rootx] = w;
					size[rooty]+=size[rootx];
				}
	    		else {
	    			par[rooty]=rootx;
	    			diff_weight[rooty] = w;
	    			rank[rootx]++;
					size[rootx]+=size[rooty];
				}
	    	}
	    	public int find(int x) {
	    		if(par[x] == x) return x;
	    		int r = find(par[x]);
	    		diff_weight[x] += diff_weight[par[x]];
	    		return par[x] = r;
	    	}
	    	public int weight(int x) {
	    		find(x);
	    		return diff_weight[x];
	    	}
	    	public int size(int i) {
	            return size[find(i)];
	        }
	    	public int diff(int x, int y) {
	    		return weight(y) - weight(x);
	    	}
	    	public boolean same(int x, int y) {
	            return find(x) == find(y);
	        }
	    }
		public class Pair2 implements Comparable<Pair2>{
	    	public int x;
	    	public int y;
	    	public double z;
	    	public Pair2(int x,int y,double z) {
	    		this.x=x;
	    		this.y=y;
	    		this.z=z;
	    	}
	    	@Override
	    	public boolean equals(Object obj) {
	    		if(obj instanceof Pair2) {
	    			Pair2 other = (Pair2) obj;
	    			return other.x==this.x && other.y==this.y&& other.z==this.z;
	    		}
	    		return false;
	    	}//同値の定義
	    	@Override
	    	public int hashCode() {
	    		return Objects.hash(this.x,this.y,this.z);
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

