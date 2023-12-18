import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.math.BigInteger;

public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner sc = new FastScanner();
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int e = sc.nextInt();
        
        BipartiteGraph g = new BipartiteGraph(x,y);
        
        for(int i=0;i<e;i++){
        	g.addEdge(sc.nextInt(), sc.nextInt()+x);
        }
        
        out.println(g.bipartiteMaxMatching());
        
        out.flush();
    }

	
}

class BipartiteGraph {
    //[0,L-1]	l_0 - l_L-1
    //[L,L+R-1]	r_0 - r_R-1

	NodeList[] nlist; //隣接リスト
	int L;	//左頂点の数
	int R;	//右頂点の数
	
	public BipartiteGraph(int L, int R){
		this.nlist = new NodeList[L+R];
		for(int i=0;i<L+R;i++){
			nlist[i] = new NodeList();
		}
		this.L = L;
		this.R = R;
	}
	
	//辺の追加（同じ辺を複数回追加すると多重辺になる）
	void addEdge(int n, int m){
		nlist[n].add(m);
		nlist[m].add(n);
	}
	
	//頂点数を返す
	int vnum(){
		return L+R;
	}
	
	//辺数を返す
	int edgeNum(){
		int sum = 0;
		for(NodeList l:nlist){
			sum += l.size();
		}
		return sum/2;
	}
	
	//隣接判定
	boolean isNext(int n, int m){
		return nlist[n].contains(m);
	}
	
	//隣接する全ての頂点を返す
	NodeList nextList(int n){
		return nlist[n];
	}
	
	//二部最大マッチング
	long bipartiteMaxMatching(){
        FlowGraph g = new FlowGraph(L+R+2);
        //L+R = s
        //L+R+1 = t
        
        for(int i=0;i<L;i++){
        	for(int j:nextList(i)){
        		g.addEdge(i, j, 1);
        	}
        }
         
        for(int i=0;i<L;i++){
            g.addEdge(L+R, i, 1);
        }
         
        for(int i=L;i<L+R;i++){
            g.addEdge(i, L+R+1, 1);
        }
         
        return g.Dinic(L+R, L+R+1);
	}
	
	class EdgePair implements Comparable<EdgePair>{
		int a,b;
		
		public EdgePair(int a, int b){
			this.a = a;
			this.b = b;
		}
		
		@Override
		public boolean equals(Object o){
			if(o instanceof EdgePair){
				EdgePair p = (EdgePair) o;
				return (a == p.a && b == p.b)||(a == p.b && b == p.a);
			}
			return super.equals(o);
		}
		
		@Override
		public int compareTo(EdgePair o){
			if(a!=o.a){
				return Integer.compare(a,o.a);
			}
			return Integer.compare(b, o.b);
		}
		
		@Override
		public int hashCode(){
			return (a<<16)+b;
		}
		
	}
	class NodeList extends ArrayList<Integer>{
		private static final long serialVersionUID = -4461479015945373120L;
	}
}

class FlowGraph {
	
	int V;
	FEdgeList[] elist;
	int[] level; //dinic用
	int[] iter; //dinic用
	
	public FlowGraph(int n){
		this.V = n;
		elist = new FEdgeList[n];
		for(int i=0;i<n;i++){
			elist[i] = new FEdgeList();
		}
	}
	
	public void addEdge(int from, int to, int c){
		FEdge e = new FEdge(to,c);
		FEdge rev = new FEdge(from,0);
		e.setRevEdge(rev);
		rev.setRevEdge(e);
		elist[from].add(e);
		elist[to].add(rev);	//逆辺
	}
	
	//残余グラフで流せる量
	int res(FEdge e){
		return e.c - e.f;
	}
	
	//sからtまでの最大フローをFord-Fulkerson法で求める(O(E*maxflow))
	long FordFulkerson(int s, int t){
		long totalflow = 0;
		
		while(true){
			ArrayDeque<Integer> q = new ArrayDeque<>();
			int[] par = new int[V]; //親
			int[] eid = new int[V]; //親→自身への辺のid
			Arrays.fill(par,-1);
			q.add(s);
			par[s] = -2;
			
			while(!q.isEmpty()){
				int from = q.pollFirst();
				for(int i=0;i<elist[from].size();i++){
					FEdge e = elist[from].get(i);
					if(res(e)<=0){	//残余グラフになければ
						continue;
					}
					if(par[e.to]!=-1){	//既に訪れていれば
						continue;
					}
					par[e.to] = from;
					eid[e.to] = i;
					q.offerFirst(e.to);	//offerLastならEdmonds-Karp
				}
			}
			
			if(par[t]==-1){	//残余グラフ上にtへのパスが存在しないなら終了
				break;
			}
			//目一杯流す
			int pathmax = Integer.MAX_VALUE;
			for(int i=t; par[i]!=-2; i=par[i]){
				pathmax = Math.min(pathmax,res(elist[par[i]].get(eid[i])));
			}
			for(int i=t; par[i]!=-2; i=par[i]){
				elist[par[i]].get(eid[i]).f += pathmax;
				elist[par[i]].get(eid[i]).rev.f -= pathmax; //逆辺用
			}
			
			totalflow += pathmax;
		}
		
		return totalflow;
	}
	
	//sからtまでの最大フローをEdmonds-Karp法で求める(O( V * E^2 ))
	long EdmondsKarp(int s, int t){
		long totalflow = 0;
		
		while(true){
			ArrayDeque<Integer> q = new ArrayDeque<>();
			int[] par = new int[V]; //親
			int[] eid = new int[V]; //親→自身への辺のid
			Arrays.fill(par,-1);
			q.add(s);
			par[s] = -2;
			
			while(!q.isEmpty()){
				int from = q.pollFirst();
				for(int i=0;i<elist[from].size();i++){
					FEdge e = elist[from].get(i);
					if(res(e)<=0){	//残余グラフになければ
						continue;
					}
					if(par[e.to]!=-1){	//既に訪れていれば
						continue;
					}
					par[e.to] = from;
					eid[e.to] = i;
					q.offerLast(e.to);
				}
			}
			
			if(par[t]==-1){	//残余グラフ上にtへのパスが存在しないなら終了
				break;
			}
			//目一杯流す
			int pathmax = Integer.MAX_VALUE;
			for(int i=t; par[i]!=-2; i=par[i]){
				pathmax = Math.min(pathmax,res(elist[par[i]].get(eid[i])));
			}
			for(int i=t; par[i]!=-2; i=par[i]){
				elist[par[i]].get(eid[i]).f += pathmax;
				elist[par[i]].get(eid[i]).rev.f -= pathmax; //逆辺用
			}
			
			totalflow += pathmax;
		}
		
		return totalflow;
	}
	
	//sからtまでの最大フローをDinic法で求める(O(V^2 * E))
	public long Dinic(int s, int t){
		level = new int[V];
		iter = new int[V];
		long totalflow = 0;
		
		while(true){
			level = bfs(s);
			if(level[t] == -1){
				return totalflow;
			}
			
			iter = new int[V];
			
			long f = Integer.MAX_VALUE;
			
			f = dfs(s,t,f);
			
			while(f>0){
				totalflow += f;
				f = dfs(s,t,f);
			}
		}
	}
	//sから各ノードへの最短距離（全辺の長さ1）をbfsで求める。
	int[] bfs(int s){
		int[] level = new int[V];
		Arrays.fill(level,-1);
		
		ArrayDeque<Integer> q = new ArrayDeque<>();
		q.offerLast(s);
		level[s] = 0;
		
		while(!q.isEmpty()){
			int from = q.pollFirst();
			
			for(FEdge e:elist[from]){
				if(res(e)<=0){
					continue;
				}
				if(level[e.to]!=-1){
					continue;
				}
				level[e.to] = level[from] + 1;
				q.offerLast(e.to);
			}
		}
		
		return level;
	}
	//vからtまでのパスをdfsで探す
	long dfs(int v, int t, long f){
		if(v==t){
			return f;
		}
		for(int i=iter[v];i<elist[v].size();i++){
			iter[v] = i;
			FEdge e = elist[v].get(i);
			if(res(e) > 0 && level[v] < level[e.to]){
				long nf = Math.min(f,res(e));
				long d = dfs(e.to,t,nf);
				if(d>0){
					e.f += d;
					e.rev.f -= d;
					return d;
				}
			}
		}
		return 0;
	}

	
	public class FEdgeList extends ArrayList<FEdge>{
		private static final long serialVersionUID = -3222721656143220018L;
	}
	public class FEdge{
		public int to;
		public int c;
		public int f;
		public FEdge rev;
		
		public FEdge(int to, int w){
			this.to = to;
			this.c = w;
			this.f = 0;
		}
		
		public void setRevEdge(FEdge e){
			this.rev = e;
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
	public int[] nextintArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public long[] nextlongArray(int n){
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = nextLong();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public int[][] nextintMatrix(int h, int w){
		int[][] mat = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				mat[i][j] = nextInt();
			}
		}
		return mat;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
