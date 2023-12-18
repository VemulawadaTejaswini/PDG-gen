import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

//suppose that every capacity is in the domaion of integer.
public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);

		new Main().solver();
		;
		out.flush();
	}

	static long nl() {
		try {
			long num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	static char nc() {
		try {
			int b = skip();
			if (b == -1)
				return 0;
			return (char) b;
		} catch (IOException e) {
		}
		return 0;
	}

	static double nd() {
		try {
			return Double.parseDouble(ns());
		} catch (Exception e) {
		}
		return 0;
	}

	static String ns() {
		try {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			if (b == -1)
				return "";
			sb.append((char) b);
			while (true) {
				b = is.read();
				if (b == -1)
					return sb.toString();
				if (b <= ' ')
					return sb.toString();
				sb.append((char) b);
			}
		} catch (IOException e) {
		}
		return "";
	}

	public static char[] ns(int n) {
		char[] buf = new char[n];
		try {
			int b = skip(), p = 0;
			if (b == -1)
				return null;
			buf[p++] = (char) b;
			while (p < n) {
				b = is.read();
				if (b == -1 || b <= ' ')
					break;
				buf[p++] = (char) b;
			}
			return Arrays.copyOf(buf, p);
		} catch (IOException e) {
		}
		return null;
	}

	public static byte[] nse(int n) {
		byte[] buf = new byte[n];
		try {
			int b = skip();
			if (b == -1)
				return null;
			is.read(buf);
			return buf;
		} catch (IOException e) {
		}
		return null;
	}

	static int skip() throws IOException {
		int b;
		while ((b = is.read()) != -1 && !(b >= 33 && b <= 126))
			;
		return b;
	}

	static boolean eof() {
		try {
			is.mark(1000);
			int b = skip();
			is.reset();
			return b == -1;
		} catch (IOException e) {
			return true;
		}
	}

	static int ni() {
		try {
			int num = 0;
			boolean minus = false;
			while ((num = is.read()) != -1 && !((num >= '0' && num <= '9') || num == '-'))
				;
			if (num == '-') {
				num = 0;
				minus = true;
			} else {
				num -= '0';
			}

			while (true) {
				int b = is.read();
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
			}
		} catch (IOException e) {
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	void solver() {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		ArrayList<Edge>[] g = new ArrayList[V];
		for (int i = 0; i < V; i++) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			int c = sc.nextInt();
			g[u].add(new Edge(u, v, c));
		}
		Preflow_Relabel pr = new Preflow_Relabel(0, V - 1, g);
		System.out.println(pr.calc());
	}

	class Preflow_Relabel {
		int n;
		int s;
		int t;
		ArrayList<Edge>[] g;
		int[][] flow;
		int[][] capacity;
		int[] excess;
		int[] height;
		PriorityQueue<Vertice> que = new PriorityQueue<>();

		void global_relabeling() {
			ArrayDeque<Integer> que = new ArrayDeque<>();
			Arrays.fill(height, n);
			height[t] = 0;
			while (!que.isEmpty()) {
				int v = que.poll();
				for (Edge e : g[v]) {
					if (residue(e.dst, v) > 0 && height[v] + 1 < height[e.dst]) {
						height[e.dst] = height[v] + 1;
					}
				}
			}
		}

		public Preflow_Relabel(int s, int t, ArrayList<Edge>[] g) {
			this.g = g;
			this.s = s;
			this.t = t;
			n = g.length;
			flow = new int[n][n];
			capacity = new int[n][n];
			height = new int[n];
			height[s] = n;
			excess = new int[n];

			for (int i = 0; i < n; i++) {
				for (Edge e : g[i]) {
					if (e.weight > 0) {
						g[e.dst].add(new Edge(e.dst, e.src, 0));
						capacity[e.src][e.dst] += e.weight;
					} else if (e.weight == 0) {
						continue;
					}
				}
			}
		}

		int calc() {
			int count = 0;
			for (Edge e : g[s]) {
				excess[s] += e.weight;
				push(s, e.dst);
			}
			global_relabeling();
			while (!que.isEmpty()) {
				Vertice v = que.poll();
				if (excess[v.id] == 0 || v.id == t || height[v.id] != v.height) {
					continue;
				}
				for (Edge e : g[v.id]) {
					if (height[e.src] == height[e.dst] + 1) {
						if (residue(e.src, e.dst) > 0) {
							push(e.src, e.dst);
							if (excess[v.id] == 0)
								break;
						}
					}
				}
				if (excess[v.id] > 0) {
					int min = 1 << 30;
					for (Edge e : g[v.id]) {
						if (residue(e.src, e.dst) > 0) {
							min = Math.min(min, height[e.dst]);
						}
					}
					height[v.id] = min + 1;
					que.add(new Vertice(v.id, height[v.id]));
				}
				if (++count % n == 0) {
					global_relabeling();
				}
			}
			return excess[t];
		}

		int residue(int s, int t) {
			return capacity[s][t] - flow[s][t];
		}

		void push(int u, int v) {
			int delta = Math.min(excess[u], residue(u, v));
			flow[u][v] += delta;
			flow[v][u] -= delta;
			excess[v] += delta;
			excess[u] -= delta;
			if (v != t && v != s) {
				que.add(new Vertice(v, height[v]));
			}
		}

		class Vertice implements Comparable<Vertice> {
			int id;
			int height;

			public Vertice(int id, int height) {
				this.id = id;
				this.height = height;
			}

			@Override
			public int compareTo(Vertice o) {
				return -Integer.compare(this.height, o.height);
			}
		}
	}

	class Edge {
		int src;
		int dst;
		int weight;

		Edge(int src, int dst, int weight) {
			this.src = src;
			this.dst = dst;
			this.weight = weight;
		}
	}

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}