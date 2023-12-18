import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main implements Runnable{
	static final int INF = (int)1e9 + 7;
	ArrayList<Edge>[] G;
	boolean[] used;

	class Edge{
		int to,cap,rev;
		public Edge(int to,int cap,int rev){
			this.to = to;
			this.cap = cap;
			this.rev = rev;
		}
	}

	public void addEdge(int from,int to,int cap){
		G[from].add(new Edge(to,cap,G[to].size()));
		G[to].add(new Edge(from,0,G[from].size()-1));
	}

	public int dfs(int v,int t,int f){

		if(v == t)return f;

		used[v] = true;
		for(int i = 0;i < G[v].size();i++){

			Edge e = G[v].get(i);

			if(!used[e.to] && e.cap > 0){
				int d = dfs(e.to,t,Math.min(f, G[v].get(i).cap));
				if(d > 0){

					e.cap -= d;
					G[e.to].get(e.rev).cap += d;
					return d;
				}
			}

		}

		return 0;
	}

	public int max_flow(int s,int t){
		int flow = 0;
		for(;;){

			Arrays.fill(used, false);
			int f = dfs(s,t,INF);
			if(f == 0)return flow;
			flow += f;
		}
	}

	int V,E;

	@SuppressWarnings("unchecked")
	public void solve() {
		V = nextInt();
		E = nextInt();

		G = new ArrayList[V];
		for(int i = 0;i < V;i++){
			G[i] = new ArrayList<Edge>();
		}
		used = new boolean[V];

		for(int i = 0;i < E;i++){

			int u = nextInt();
			int v = nextInt();
			int c = nextInt();

			addEdge(u,v,c);
		}

		out.println(max_flow(0,V-1));
	}

	public static void main(String[] args) {
		new Thread(null,new Main(),"",32 * 1024 * 1024).start();
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

	@Override
	public void run() {
		out.flush();
		new Main().solve();
		out.close();

	}
}