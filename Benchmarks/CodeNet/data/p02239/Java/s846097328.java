import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Graph I - Breadth First Search
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			Graph1 g = new Graph1(n);
			for (int i = 0; i < n; i++) {
				g.add(br.readLine());
			}
			g.bfs(1);
			for (int i = 1; i <= n; i++) {
				System.out.print(g.get(i).printDistance());
			}
		}
	}
}

class Graph1 {

	private ArrayList<Vertex> vertexs;
	private int[] indexes;
	private LinkedList<Vertex> queue;

	public Graph1(int n) {
		vertexs = new ArrayList<Vertex>();
		indexes = new int[n + 1];
		queue = new LinkedList<Vertex>();
	}

	public void add(String info) {
		int id;
		int[] edge;
		String[] _edge;

		StringTokenizer st = new StringTokenizer(info);
		id = Integer.parseInt(st.nextToken());
		_edge = new String[Integer.parseInt(st.nextToken())];
		edge = new int[_edge.length];
		for (int i = 0; i < _edge.length; i++) {
			_edge[i] = st.nextToken();
		}
		// Arrays.sort(_edge);
		for (int i = 0; i < edge.length; i++) {
			edge[i] = Integer.parseInt(_edge[i]);
		}
		vertexs.add(new Vertex(id, edge));
		indexes[id] = vertexs.size() - 1;
	}

	public Vertex get(int id) {
		return vertexs.get(indexes[id]);
	}

	public void dfs(int t) {
		for (Vertex v : vertexs) {
			t = v.dfs(t);
		}
	}

	public void bfs(int s) {
		int d = 0;
		get(s).d = d;
		queue.add(get(s));
		while (!queue.isEmpty()) {
			d = queue.removeFirst().bfs(d);
		}
	}

	class Vertex {
		private int id, d, f;
		private int[] edge;

		private Vertex(int id, int[] edge) {
			this.id = id;
			d = -1;
			f = 0;
			this.edge = edge;
		}

		private int dfs(int t) {
			if (d == -1) {
				d = ++t;
				for (int i = 0; i < edge.length; i++) {
					t = get(edge[i]).dfs(t);
				}
				f = ++t;
			}
			return t;
		}

		private int bfs(int d) {
			for (int i = 0; i < edge.length; i++) {
				if (get(edge[i]).d == -1) {
					get(edge[i]).d = d + 1;
					queue.add(get(edge[i]));
				}
			}
			return this.d;
		}

		public String printTime() {
			return String.format("%d %d %d\n", id, d, f);
		}

		public String printDistance() {
			return String.format("%d %d\n", id, d);
		}
	}
}