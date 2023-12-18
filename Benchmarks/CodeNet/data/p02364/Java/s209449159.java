import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
         
        int v = sc.nextInt();
        int e = sc.nextInt();
        Kraskal g = new Kraskal(v);
        
        for(int i=0;i<e;i++){
        	g.addEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        System.out.println(g.KraskalWeight());
        
    }
	
}

class Kraskal {
	int vnum;
	ArrayList<WEdge2> elist;
	
	public Kraskal(int vnum){
		this.vnum = vnum;
		elist = new ArrayList<>();
	}
	
	void addEdge(int u, int v, int w){
		elist.add(new WEdge2(u,v,w));
	}
	
	//クラスカル法で最小全域木を求める
	ArrayList<WEdge2> KraskalTree(){		
		//UFT
		class UFT{
			int[] par;
			int[] rank;
			
			public UFT(int n){
				par = new int[n];
				rank = new int[n];
				
				for(int i=0;i<n;i++){
					par[i] = i;
				}
			}
			
			//木の根を求める
			public int find(int x){
				if(par[x] == x){
					return x;
				}
				else{
					return par[x] = find(par[x]);
				}
			}
			
			//xとyの属する集合を併合
			void unite(int x, int y){
				int px = find(x);
				int py = find(y);
				
				if(px == py){
					return;
				}
				else if(rank[px] < rank[py]){
					par[px] = py;

				}
				else{
					par[py] = px;
					if(rank[px]==rank[py]){
						rank[px]++;
					}
				}
				
			}
			
			//xとyが同じ集合に属するか
			boolean isEquivalent(int x, int y){
				return find(x) == find(y);
			}
		}
		
		PriorityQueue<WEdge2> s = new PriorityQueue<>();
		s.addAll(elist);
		ArrayList<WEdge2> forest = new ArrayList<>();
		UFT uft = new UFT(vnum);
		
		while(!s.isEmpty()){
			WEdge2 now = s.poll();
			
			if(!uft.isEquivalent(now.u,now.v)){
				forest.add(now);
				uft.unite(now.u, now.v);
			}
		}
		
		return forest;
	}

	//クラスカル法で最小全域木の重みの和を求める
	long KraskalWeight(){		
		//UFT
		class UFT{
			int[] par;
			int[] rank;
			
			public UFT(int n){
				par = new int[n];
				rank = new int[n];
				
				for(int i=0;i<n;i++){
					par[i] = i;
				}
			}
			
			//木の根を求める
			public int find(int x){
				if(par[x] == x){
					return x;
				}
				else{
					return par[x] = find(par[x]);
				}
			}
			
			//xとyの属する集合を併合
			void unite(int x, int y){
				int px = find(x);
				int py = find(y);
				
				if(px == py){
					return;
				}
				else if(rank[px] < rank[py]){
					par[px] = py;

				}
				else{
					par[py] = px;
					if(rank[px]==rank[py]){
						rank[px]++;
					}
				}
				
			}
			
			//xとyが同じ集合に属するか
			boolean isEquivalent(int x, int y){
				return find(x) == find(y);
			}
		}
		
		PriorityQueue<WEdge2> s = new PriorityQueue<>();
		s.addAll(elist);
		UFT uft = new UFT(vnum);
		long sum = 0;
		
		while(!s.isEmpty()){
			WEdge2 now = s.poll();
			
			if(!uft.isEquivalent(now.u,now.v)){
				sum += now.w;
				uft.unite(now.u, now.v);
			}
		}
		
		return sum;
	}
	
	class WEdge2 implements Comparable<WEdge2>{
		int u;
		int v;
		int w;
		
		public WEdge2(int u, int v, int w){
			this.u = u;
			this.v = v;
			this.w = w;
		}
		
		@Override
		public int compareTo(WEdge2 o){
			return Integer.compare(w, o.w);
		}
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
