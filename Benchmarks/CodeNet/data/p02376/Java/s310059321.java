import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final int INF = (int)1e9 + 7;
	int V,E;
	ArrayList<Integer>[] graph,rev;
	int[][] cap;
	boolean[] used;
	
	@SuppressWarnings("unchecked")
	public void solve() {
		 V = nextInt();
		 E = nextInt();
		 
		 graph = new ArrayList[V];
		 rev = new ArrayList[V];
		 for(int i = 0;i < V;i++){
		 	graph[i] = new ArrayList<Integer>();
			rev[i] = new ArrayList<Integer>();
		 }
		 
		 cap = new int[V][V];
		 
		 for(int i = 0;i < E;i++){
		 	int u = nextInt();
			int v = nextInt();
			int c = nextInt();
			
			graph[u].add(v);
			rev[v].add(u);
			cap[u][v] = c;
		 }
		 
		 out.println(maxFlow());
	}
	
	public int dfs(int s,int t,int nowFlow){
		
		if(s == t){
			return nowFlow;
		}
		
		for(int v : graph[s]){
			if(used[v])continue;
			if(cap[s][v] == 0)continue;
			used[v] = true;
			int flow = dfs(v,t,Math.min(nowFlow,cap[s][v]));
			if(flow != 0){
				cap[s][v] -= flow;
				cap[v][s] += flow;
				return flow;
			}
			used[v] = false;
		}
		
		for(int v : rev[s]){
			if(used[v])continue;
			if(cap[v][s] == 0)continue;
			used[v] = true;
			int flow = dfs(v,t,Math.min(nowFlow,cap[v][s]));
			if(flow != 0){
				cap[v][s] -= flow;
				cap[s][v] += flow;
				return flow;
			}
			used[v] = false;
		}
		
		return 0;
	}
	
	public int maxFlow(){
		int ret = 0;
		used = new boolean[V];
		
		for(;;){
			Arrays.fill(used,false);
			int flow = dfs(0,V-1,INF);
			if(flow == 0)break;
			ret += flow;
		}
		return ret;
	}
 
	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}
 
	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;
 
	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}
 
	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}
 
	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}
 
	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}
 
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}
 
	public int nextInt() {
		return Integer.parseInt(next());
	}
 
	public long nextLong() {
		return Long.parseLong(next());
	}
 
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}