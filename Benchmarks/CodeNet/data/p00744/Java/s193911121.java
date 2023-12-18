import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
	
	MyScanner sc;
	PrintWriter writer;
	
	class DirectedGraph {
		List<Vertex> vertices;
		public DirectedGraph(int num) {
			vertices = new ArrayList<Vertex>(num);
			for (int i = 0; i < num; i++) {
				vertices.add(new Vertex(i));
			}
		}
		public void addEdge(int from, int to, int capacity) {
			vertices.get(from).addEdge(vertices.get(to), capacity);
		}
		private List<Edge> path;
		private boolean[] searched;
		private boolean findAugmentedPath(Vertex v, Vertex sink) {
			if (v == sink) {
				return true;
			}
			searched[v.key] = true;
			for (Edge e : v.edges) {
				if (e.residual > 0 && !searched[e.to.key]) {
					if (findAugmentedPath(e.to, sink)) {
						path.add(e);
						return true;
					}
				}
			}
			return false;
		}
		private int augmentedPathFlow() {
			int flow = Integer.MAX_VALUE;
			for (Edge e : path) {
				flow = Math.min(flow, e.residual);
			}
			for (Edge e : path) {
				e.residual -= flow;
				e.reverse.residual += flow;
			}
			return flow;
		}
		public int maxFlow(Vertex source, Vertex sink) {
			int flow = 0;
			path = new ArrayList<Edge>();
			searched = new boolean[vertices.size()];
			while (findAugmentedPath(source, sink)) {
				flow += augmentedPathFlow();
				path = new ArrayList<Edge>();
				searched = new boolean[vertices.size()];
			}
			return flow;
		}
	}

	class Vertex {
		int key;
		List<Edge> edges;
		public Vertex() {
			edges = new ArrayList<Edge>();
		}
		public Vertex(int key) {
			this.key = key;
			edges = new ArrayList<Edge>();
		}
		public void addEdge(Vertex to, int capacity) {
			Edge e1 = new Edge(this, to, capacity);
			Edge e2 = new Edge(to, this, 0);
			e1.reverse = e2;
			e2.reverse = e1;
			edges.add(e1);
			to.edges.add(e2);
		}
	}

	class Edge {
		Vertex from, to;
		int capacity, flow, residual;
		Edge reverse;
		public Edge(Vertex from, Vertex to, int capacity) {
			this.from = from;
			this.to = to;
			this.capacity = capacity;
			residual = capacity;
			flow = 0;
		}
	}

	
	private int gcd(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		if (min == 1) {
			return 1;
		} else {
			if (max % min == 0) {
				return min;
			} else {
				return gcd(min, max % min);
			}
		}
	}

	public void solve() {
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if (m == 0 && n == 0) {
				return;
			}
			int[] b = sc.nextIntArray(m);
			int[] r = sc.nextIntArray(n);
			DirectedGraph graph = new DirectedGraph(m + n + 2);
			for (int i = 0; i < m; i++) {
				graph.addEdge(m + n, i, 1); // from the source to the blues
				for (int j = 0; j < n; j++) {
					if (gcd(b[i], r[j]) > 1) {
						graph.addEdge(i, m + j, 1);
					}
				}
			}
			for (int i = 0; i < n; i++) {
				graph.addEdge(m + i, m + n + 1, 1); // from the reds to the terminal
			}
			writer.println(graph.maxFlow(graph.vertices.get(m + n), graph.vertices.get(m + n + 1)));
		}
	}

	public Main() {
		sc = new MyScanner(System.in);
		writer = new PrintWriter(System.out);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.solve();
		m.writer.flush();
	}

	class MyScanner {
		InputStream is;
		private byte[] buffer = new byte[1024];
		private int bufferPointer = 0;
		private int bufferLength = 0;

		MyScanner(InputStream is) {
			this.is = is;
		}

		private int readByte() {
			if (bufferLength == -1) {
				throw new InputMismatchException();
			}
			if (bufferPointer >= bufferLength) {
				bufferPointer = 0;
				try {
					bufferLength = is.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (bufferLength <= -1) {
					return -1;
				}
			}
			return buffer[bufferPointer++];
		}

		String next() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while (isChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		char nextChar() {
			int b = skip();
			return (char) b;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		int nextInt() {
			int num = 0;
			int b;
			boolean negative = false;
			while ((b = readByte()) != -1 && !isDigit(b) && b != '-')
				;
			if (b == '-') {
				negative = true;
				b = readByte();
			}
			while (true) {
				if (isDigit(b)) {
					num = num * 10 + (b - '0');
				} else {
					return negative ? -num : num;
				}
				b = readByte();
			}
		}

		int[] nextIntArray(int length) {
			int[] array = new int[length];
			for (int i = 0; i < length; i++) {
				array[i] = sc.nextInt();
			}
			return array;
		}

		long nextLong() {
			long num = 0;
			int b;
			boolean negative = false;
			while ((b = readByte()) != -1 && !isDigit(b) && b != '-')
				;
			if (b == '-') {
				negative = true;
				b = readByte();
			}
			while (true) {
				if (isDigit(b)) {
					num = num * 10 + (b - '0');
				} else {
					return negative ? -num : num;
				}
				b = readByte();
			}
		}

		// from '!' to '~'
		private boolean isChar(int b) {
			return b >= 33 && b <= 126;
		}

		private boolean isDigit(int b) {
			return b >= '0' && b <= '9';
		}

		private int skip() {
			int b;
			while ((b = readByte()) != -1 && !isChar(b))
				;
			return b;
		}

	}
}