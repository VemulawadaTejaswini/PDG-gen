import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class Main {
	
	//final boolean isDebug = true;
	final boolean isDebug = false;
	String fileName = "input.txt";
	FastScanner sc;
	PrintWriter out;
	final int MOD = (int)1e9+7;
	final int INF = Integer.MAX_VALUE / 2;
	
	void solve() throws Exception{
		int V = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		PrimalDual pd = new PrimalDual(V);
		for(int i = 0; i < E; i++) pd.addEdge(sc.nextInt(), sc.nextInt(), sc.nextLong(), sc.nextLong());
		System.out.println(pd.minFlow(0, V-1, F));
	}
	
	/* end solve */
	
	/* main */
	public static void main(String[] args) throws Exception {
		new Main().m();
	}
	
	void m() throws Exception {
		long S = System.currentTimeMillis();
		sc = (isDebug) ? new FastScanner(new FileInputStream(fileName)) : new FastScanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		if(isDebug){
			System.out.println("---Debug---");
			System.out.printf("%8d ms", (G-S));
		}
	}
	/* end main */
}
/* end Main */

class PrimalDual{
	class Edge{
		int to;
		long cap;
		long cost;
		int rev;
		boolean isRev;
		public Edge(int t, long cp, long cs, int r, boolean i){
			to = t; cap = cp; cost = cs; rev = r; isRev = i;
		}
	}
	class Dist implements Comparable<Dist>{
		long dist;
		int v;
		
		Dist(long dist, int v){
			this.dist = dist;
			this.v = v;
		}

		//近い順に並べる
		@Override
		public int compareTo(Dist d) {
			return Long.compare(d.dist, this.dist);
		}
	}
	
	long INF = Long.MAX_VALUE / 2;
	int V;
	ArrayList<ArrayList<Edge>> graph;
	long[] potential, minCost;
	int[] prevv, preve;
	
	public PrimalDual(int V){
		this.V = V;
		graph = new ArrayList<>();
		for(int i = 0; i < V; i++) graph.add(new ArrayList<>());
		potential = new long[V];
		minCost = new long[V];
		prevv = new int[V];
		preve = new int[V];
	}
	
	void addEdge(int from, int to, long cap, long cost){
		graph.get(from).add(new Edge(to, cap, cost, graph.get(to).size(), false));
		graph.get(to).add(new Edge(from, 0, -cost, graph.get(from).size()-1, true));
	}
	
	long minFlow(int s, int t, long f){
		long ret = 0;
		PriorityQueue<Dist> pq = new PriorityQueue<>();
		Arrays.fill(potential, 0);
		Arrays.fill(preve, -1);
		Arrays.fill(prevv, -1);
		
		while(f > 0){
			Arrays.fill(minCost, INF);
			pq.add(new Dist(0, s));
			minCost[s] = 0;
			
			while(!pq.isEmpty()){
				Dist p = pq.remove();
				if(minCost[p.v] < p.dist) continue;
				for(int i = 0; i < graph.get(p.v).size(); i++){
					Edge e = graph.get(p.v).get(i);
					long nextCost = minCost[p.v] + e.cost + potential[p.v] - potential[e.to];
					if(e.cap > 0 && minCost[e.to] > nextCost){
						minCost[e.to] = nextCost;
						prevv[e.to] = p.v;
						preve[e.to] = i;
						pq.add(new Dist(minCost[e.to], e.to));
					}
				}
			}
			
			if(minCost[t] == INF) return -1;
			for(int v = 0; v < V; v++) potential[v] += minCost[v];
			long addFlow = f;
			for(int v = t; v != s; v = prevv[v])
				addFlow = Math.min(addFlow, graph.get(prevv[v]).get(preve[v]).cap);
			f -= addFlow;
			ret += addFlow * potential[t];
			for(int v = t; v != s; v = prevv[v]){
				Edge e = graph.get(prevv[v]).get(preve[v]);
				e.cap -= addFlow;
				graph.get(v).get(e.rev).cap += addFlow;
			}
		}
		
		return ret;
	}
	
	void output(){
		for(int i = 0; i < graph.size(); i++){
			for(Edge e : graph.get(i)){
				if(e.isRev) continue;
				Edge revEdge = graph.get(e.to).get(e.rev);
				System.out.println(i + " -> " + e.to + " (flow: " + revEdge.cap + " / " + (e.cap + revEdge.cap) + ")");
			}
		}
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public String nextLine() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(b != 10) {
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
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
