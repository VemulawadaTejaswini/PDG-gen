import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int V = sc.nextInt();
        int E = sc.nextInt();
        int f = sc.nextInt();
        
        CostedFlowGraph g = new CostedFlowGraph(V);
        
        for(int i=0;i<E;i++){
        	g.addEdge(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        
        System.out.println(g.minCostFlow(0, V-1, f));
    }
    
}

class CostedFlowGraph {
	int V;
	CFEdgeList[] elist;
	int[] h;
	int[] dd;
	int[] preV;
	int[] preEid;
	
	public CostedFlowGraph(int V){
		elist = new CFEdgeList[V];
		for(int i=0;i<V;i++){
			elist[i] = new CFEdgeList();
		}
		this.V = V;
		h = new int[V];	//その頂点までにかかる費用の合計の最小値
		dd = new int[V];
		preV = new int[V];
		preEid = new int[V];
	}
	
	void addEdge(int from, int to, int cap, int d){
		CFEdge e = new CFEdge(to,cap,d);
		CFEdge rev = new CFEdge(from,0,-d);
		e.setRevEdge(rev);
		rev.setRevEdge(e);
		elist[from].add(e);
		elist[to].add(rev);
	}
	
	//流量fのフローを流すための最小コストをDijkstraを用いた最短路反復で返す。不可能なら-1。
	int minCostFlow(int s, int t, int f){
		PriorityQueue<Node> q = new PriorityQueue<>();
		int cost = 0;
		while(f>0){
			Arrays.fill(dd, Integer.MAX_VALUE);
			dd[s] = 0;
			q.clear();
			q.add(new Node(s,0));
			
			while(!q.isEmpty()){
				Node now = q.poll();
				if(dd[now.v] < now.d){	//既に展開済み
					continue;
				}
				for(int i=0;i<elist[now.v].size();i++){
					CFEdge e = elist[now.v].get(i);
					int ddash = e.d + now.d + h[now.v] - h[e.to];
					if(e.res() >0 && ddash < dd[e.to]){
						preV[e.to] = now.v;
						preEid[e.to] = i;
						dd[e.to] = ddash;
						q.add(new Node(e.to, ddash));
					}
				}
			}
			
			if(dd[t] == Integer.MAX_VALUE){	//不可能
				break;
			}
			for(int i=0;i<V;i++){
				h[i] += dd[i];
			}
			int minf = f;
			for(int i=t;i!=s;i=preV[i]){
				minf = Math.min(minf, elist[preV[i]].get(preEid[i]).res());
			}
			cost += minf * h[t];
			f -= minf;
			for(int i=t; i!=s; i=preV[i]){
				elist[preV[i]].get(preEid[i]).f += minf;
				elist[preV[i]].get(preEid[i]).rev.f -= minf;
			}
		}
		if(f>0){	//不可能
			cost = -1;
		}
		return cost;
	}
	
	//for Dijkstra
	class Node implements Comparable<Node>{
		int v;
		int d;
		public Node(int v, int d){
			this.v = v;
			this.d = d;
		}
		@Override
		public int compareTo(Node o){
			return Integer.compare(d, o.d);
		}
	}
	
	public class CFEdgeList extends ArrayList<CFEdge>{
		private static final long serialVersionUID = 8880792963612434406L;
	}
	public class CFEdge{
		public int to;
		public int cap;	//容量
		public int d;	//コスト
		public int f;	//流量
		public CFEdge rev;
		
		public CFEdge(int to, int cap, int d){
			this.to = to;
			this.cap = cap;
			this.d = d;
			this.f = 0;
		}
		
		public void setRevEdge(CFEdge e){
			this.rev = e;
		}
		
		//残余グラフで流せる量
		int res(){
			return cap - f;
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
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
