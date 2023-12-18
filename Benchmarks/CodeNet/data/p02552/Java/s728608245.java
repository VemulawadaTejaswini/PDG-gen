
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static Scanner sc;
	static PrintWriter out;
	static ArrayList<Edge> adj[];
	static int V,E;
	static int[] dist;
	static int[] parent;
	static final int oo = (int) 1e9;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		out.println(n==1?0:1);
		out.close();
	}
	static void dijkstra(int src) {
		dist = new int[V];
		Arrays.fill(dist, oo);
		parent = new int[V];
		Arrays.fill(parent, -1);
		dist[src] = 0;
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add(new Edge(src,0));
		while(!pq.isEmpty()) {
			Edge e = pq.poll();
			if(dist[e.x] < e.y)
				continue;
//			if(e.x == dest)
//				return e.y;
			for(Edge e2:adj[e.x]) {
				if(dist[e2.x] > e2.y+e.y) {
					pq.add(new Edge(e2.x,dist[e2.x] = e2.y+e.y));
					parent[e2.x] = e.x;
				}
			}
		}
//		return -1;
	}
	static class Edge extends java.awt.Point implements Comparable<Edge>{		
		public Edge(int u, int val) {
			// TODO Auto-generated constructor stub
			super(u, val);
		}

		@Override
		public int compareTo(Edge e) {
			// TODO Auto-generated method stub
			return y - e.y;
		}		
	}
	static class Scanner{
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		private String next() throws Exception{
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws Exception{
			return Integer.parseInt(next());
		}
		public long nextLong() throws Exception{
			return Long.parseLong(next());
		}
		public double nextDouble() throws Exception{
			return Double.parseDouble(next());
		}
		public String nextLine() throws Exception {
			return br.readLine();
		}

	}
}
