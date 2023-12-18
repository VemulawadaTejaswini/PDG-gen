import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * Graph I - Depth First Search
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			Graph g = new Graph(n);
			for (int i = 0; i < n; i++) {
				g.add(br.readLine());
			}
			//g.sort();
			g.dfs(0);
			for (int i = 1; i <= n; i++) {
				System.out.print(g.get(i).toString());
			}
		}
	}
}

class Graph implements Iterable<Graph.Vertex> {

	private ArrayList<Vertex> vertexs;
	private int[] indexes;

	public Graph(int n) {
		vertexs = new ArrayList<Vertex>();
		indexes = new int[n + 1];
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
		//Arrays.sort(_edge);
		for (int i = 0; i < edge.length; i++) {
			edge[i] = Integer.parseInt(_edge[i]);
		}
		vertexs.add(new Vertex(id, edge));
		indexes[id] = vertexs.size() - 1;
	}

	public void sort() {
		Collections.sort(vertexs);
		for (int i = 0; i < vertexs.size(); i++) {
			indexes[vertexs.get(i).id] = i;
		}
	}

	public Vertex get(int id) {
		return vertexs.get(indexes[id]);
	}

	public void dfs(int t) {
		for (Vertex v : vertexs) {
			t = v.dfs(t);
		}
	}

	@Override
	public Iterator<Graph.Vertex> iterator() {
		return null;
	}

	public Integer[] dict() {
		Integer[] d = new Integer[indexes.length];
		for (int i = 0; i < d.length; i++) {
			d[i] = indexes[i];
		}
		Arrays.sort(d, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				String s1, s2;
				s1 = o1.toString();
				s2 = o2.toString();
				return s1.compareTo(s2);
			}
		});
		return d;
	}

	class Vertex implements Comparable<Vertex> {
		private int id, d, f;
		private int[] edge;

		private Vertex(int id, int[] edge) {
			this.id = id;
			d = 0;
			f = 0;
			this.edge = edge;
		}

		private int dfs(int t) {
			if (d == 0) {
				d = ++t;
				for (int i = 0; i < edge.length; i++) {
					t = get(edge[i]).dfs(t);
				}
				f = ++t;
			}
			return t;
		}

		public String toString() {
			return String.format("%d %d %d\n", id, d, f);
		}

		@Override
		public int compareTo(Vertex o) {
			String s1, s2;
			s1 = Integer.valueOf(id).toString();
			s2 = Integer.valueOf(o.id).toString();
			return s1.compareTo(s2);
		}
	}
}