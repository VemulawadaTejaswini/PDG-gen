import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
public class Main {
	final int INF = (int)1e9 + 7;
	int N,M;
	int[] a,b,d;
	ArrayList<Integer>[] graph;
	int[][] cost;
	private class P implements Comparable<P>{
		int first,second;
		public P(int first,int second){
			this.first = first;
			this.second = second;
		}
		public int compareTo(P p){
			if(this.first == p.first){
				return this.second - p.second;
			}
			return this.first - p.first;
		}
	}

	public int dijkstra(int s){
		boolean[] used = new boolean[N];
		int ret = 0;
		PriorityQueue<P> pq = new PriorityQueue<P>();
		pq.add(new P(0,s));
		while(pq.size() > 0){
			P p = pq.poll();
			if(used[p.second])continue;
			used[p.second] = true;
			ret+=p.first;
			for(int next : graph[p.second]){
				pq.add(new P(cost[p.second][next],next));
			}
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	public void solve() {
		while(true){
			N = nextInt();

			if(N == 0)break;

			M = nextInt();
			a = new int[M];
			b = new int[M];
			d = new int[M];
			graph = new ArrayList[N];
			cost = new int[N][N];
			for(int i = 0;i < N;i++){
				graph[i] = new ArrayList<Integer>();
			}
			for(int i = 0;i < M;i++){
				String[] line = next().split(",");
				a[i] = Integer.parseInt(line[0]);
				b[i] = Integer.parseInt(line[1]);
				d[i] = (Integer.parseInt(line[2]) / 100) - 1;
				cost[a[i]][b[i]] = d[i];
				cost[b[i]][a[i]] = d[i];
				graph[a[i]].add(b[i]);
				graph[b[i]].add(a[i]);
			}
			out.println(dijkstra(0));
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