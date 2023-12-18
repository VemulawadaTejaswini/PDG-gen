import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	int V,E,r;
	List<ArrayList<Integer>> graph;
	int[][] cost;
	long[] ans;

	private class D implements Comparable<D>{
		int n;
		long c;
		public D(int n,long c){
			this.n = n;
			this.c = c;
		}

		public int compareTo(D d){
			if(this.c - d.c < 0){
				return -1;
			}else if(this.c - d.c > 0){
				return 1;
			}else{
				return 0;
			}
		}
	}

	public void dijkstra(int s){
		boolean[] used = new boolean[V];

		PriorityQueue<D> pq = new PriorityQueue<D>();
		pq.add(new D(r,0));
		while(pq.size() > 0){
			D d = pq.poll();

			used[d.n] = true;
			ans[d.n] = Math.min(ans[d.n],d.c);

			for(int i : graph.get(d.n)){
				if(used[i])continue;
				pq.add(new D(i,d.c + cost[d.n][i]));
			}
		}
	}

	public void solve() {
		V = nextInt();
		E = nextInt();
		r = nextInt();

		graph = new ArrayList<ArrayList<Integer>>();
		cost = new int[V][V];
		ans = new long[V];

		for(int i = 0;i < V;i++){
			graph.add(new ArrayList<Integer>());
		}

		for(int i = 0;i < V;i++){
			ans[i] = Long.MAX_VALUE;
		}

		for(int i = 0;i < E;i++){
			int s = nextInt();
			int t = nextInt();
			int d = nextInt();

			graph.get(s).add(t);
			cost[s][t] = d;
		}

		dijkstra(r);

		for(int i = 0;i < V;i++){
			if(ans[i] == Long.MAX_VALUE)out.println("INF");
			else out.println(ans[i]);
		}
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