
import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	static class Node {
		int id;
		List<Edge> link = new LinkedList<Edge>();

		Node(int _id) {
			id = _id;
		}
	}

	static class Edge {
		int from, to, cost;

		Edge(int _from, int _to, int _cost) {
			from = _from;
			to = _to;
			cost = _cost;
		}

		public String toString() {
			return from + "->" + to;
		}
	}

	boolean augment(final Node[] g, int u, int[] matchTo, boolean[] visited) {
		if (u < 0)
			return true;
		for (Edge link : g[u].link)
			if (!visited[link.to]) {
				visited[link.to] = true;
				if (augment(g, matchTo[link.to], matchTo, visited)) {
					matchTo[link.from] = link.to;
					matchTo[link.to] = link.from;
					return true;
				}
			}
		return false;
	}

	int bipartiteMatching(final Node[] g, int L, List<Edge> matching) {
		final int n = g.length;
		int[] matchTo = new int[n];
		Arrays.fill(matchTo, -1);
		int match = 0;
		for (int u = 0; u < L; u++) {
			boolean[] visited = new boolean[n];
			if (augment(g, u, matchTo, visited))
				++match;
		}
		for (int u = 0; u < L; u++)
			if (matchTo[u] >= 0) // make explicit matching
				matching.add(new Edge(u, matchTo[u], 0));
		return match;
	}
	int gcd(int a,int b){
		return b==0?a:gcd(b,a%b);
	}

	public void run() {
		while (true) {
			int m = sc.nextInt(), n = sc.nextInt();
			if (m == 0 && n == 0)
				return;
			int[] bs = new int[m];
			int[] rs = new int[n];
			for (int i = 0; i < m; i++)
				bs[i] = sc.nextInt();
			for (int i = 0; i < n; i++)
				rs[i] = sc.nextInt();

			Node[] g=new Node[n+m];
			for (int i = 0; i < n+m; i++)
				g[i] =new Node(i);


			List<Edge> matching=new ArrayList<Edge>();

			for(int i=0;i<m;i++)for(int j=0;j<n;j++){
				if(gcd(bs[i],rs[j])>1){
					g[i].link.add(new Edge(i,m+j,1));
					g[m+j].link.add(new Edge(i,m+j,1));
				}
			}
			ln(bipartiteMatching(g,m,matching));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	static Scanner sc = new Scanner(in);

	// output lib
	static final String br = System.getProperty("line.separator");
	static final String[] asep = new String[] { "", " ", br, br + br };

	static String str(Boolean o) {
		return o ? "YES" : "NO";
	}

	// static String str(Double o){
	// return String.format("%.8f",o);
	// }
	static <K, V> String str(Map<K, V> map) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (Entry<K, V> set : map.entrySet()) {
			if (!isFirst)
				sb.append(br);
			sb.append(str(set.getKey())).append(":")
					.append(str(set.getValue()));
			isFirst = false;
		}
		return sb.toString();
	}

	static <E> String str(Collection<E> list) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (E e : list) {
			if (!isFirst)
				sb.append(" ");
			sb.append(str(e));
			isFirst = false;
		}
		return sb.toString();
	}

	static String str(Object o) {
		int depth = _getArrayDepth(o);
		if (depth > 0)
			return _strArray(o, depth);
		Class<?> c = o.getClass();
		if (c.equals(Boolean.class))
			return str((Boolean) o);
		// if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}

	static int _getArrayDepth(Object o) {
		if (!o.getClass().isArray() || Array.getLength(o) == 0)
			return 0;
		return 1 + _getArrayDepth(Array.get(o, 0));
	}

	static String _strArray(Object o, int depth) {
		if (depth == 0)
			return str(o);
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = Array.getLength(o); i < len; i++) {
			if (i != 0)
				sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o, i), depth - 1));
		}
		return sb.toString();
	}

	static void pr(Object... os) {
		boolean isFirst = true;
		for (Object o : os) {
			if (!isFirst)
				out.print(" ");
			out.print(o);
			isFirst = false;
		}
	}

	static void ln() {
		out.println();
	}

	static void ln(Object... os) {
		for (Object o : os) {
			pr(o);
			ln();
		}
	}
}