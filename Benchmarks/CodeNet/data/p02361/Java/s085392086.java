import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

// aoj GRL_1_A Dijkstra O(E log V)
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int v = sc.nextInt();
		int e = sc.nextInt();
		int r = sc.nextInt();

		Dijkstra di = new Dijkstra(v);
		for (int i = 0; i < e; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int d = sc.nextInt();
			di.addEdge(s, t, d);
		}
		
		for (int i = 0; i < v; i++) {
			long tmp = di.getShortestPath(r, i);
			if (tmp != di.INF) {
				pr.println(tmp);
			} else {
				pr.println("INF");
			}
		}

		pr.close();
		sc.close();
	}
	
	private static class Dijkstra {
		long[] d;
		List<Edge>[] edges;
		PriorityQueue<Vertex> pq;
		int n;
		int s;

		final int INF = Integer.MAX_VALUE;
		
		@SuppressWarnings("unchecked")
		Dijkstra(int n) {
			this.n = n;

			edges = new List[n];
			for (int ii = 0; ii < n; ii++) {
				edges[ii] = new ArrayList<Edge>();
			}

			s = - 1;
		}

		// i, j:0-indexed
		public void addEdge(int i, int j, int c) {
			edges[i].add(new Edge(i, j, c));
		}

		public long getShortestPath(int i, int j) {
			if (s != i) {
				d = new long[n];
				Arrays.fill(d, INF);
				d[i] = 0;
				pq = new PriorityQueue<Vertex>();
				pq.add(new Vertex(i, d[i]));

				while (!pq.isEmpty()) {
					Vertex u = pq.poll();
					if (d[u.me] < u.d) {
						continue;  // skip old vertex
					}
					
					for (int ii = 0; ii < edges[u.me].size(); ii++) {
						Edge v = edges[u.me].get(ii);
						if (d[u.me] != INF && d[v.v] > d[u.me] + v.w) {
							d[v.v] = d[u.me] + v.w;
							pq.add(new Vertex(v.v, d[v.v]));
						}
					}
				}

				s = i;
			}
			
			return d[j];
		}
		
		private static class Edge {
//			int u; // from
			int v; // to
			int w; // cost
			
			Edge(int u, int v, int w) {
//				this.u = u;
				this.v = v;
				this.w = w;
			}
		}

		private static class Vertex implements Comparable<Vertex> {
			int me; // me
			long d; // cost
			
			Vertex(int u, long w) {
				this.me = u;
				this.d = w;
			}

			@Override
			public int compareTo(Vertex o) {
				return Long.compare(this.d, o.d);
			}
		}
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		BufferedReader br;
		Iterator<String> it;
		
		Scanner (InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
		}
		
		String next() throws RuntimeException  {
			try {
				if (it == null || !it.hasNext()) {
					it = Arrays.asList(br.readLine().split(" ")).iterator();
				}
				return it.next();
			} catch (IOException e) {
				throw new IllegalStateException();
			}
		}
		
		int nextInt() throws RuntimeException {
			return Integer.parseInt(next());
		}

		long nextLong() throws RuntimeException {
			return Long.parseLong(next());
		}

		float nextFloat() throws RuntimeException {
			return Float.parseFloat(next());
		}

		double nextDouble() throws RuntimeException {
			return Double.parseDouble(next());
		}

		void close() {
			try {
				br.close();
			} catch (IOException e) {
//				throw new IllegalStateException();
			}
		}
	}

	private static class Printer extends PrintWriter {
		Printer(PrintStream out) {
			super(out);
		}
	}
}