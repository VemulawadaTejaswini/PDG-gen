import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static int[] guide;
	static int[] dist;
	
	static void dfs(List<List<Integer>> g, int v, int p, int d) {
		if (d < dist[v]) {
			dist[v] = d;
			guide[v] = p;
		} else {
			return;
		}
		
		for (int i = 0; i < g.get(v).size(); i++) {
			int nv = g.get(v).get(i);
			dfs(g, nv, v, d + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		List<List<Integer>> graph = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		
		guide = new int[n];
		dist = new int[n];
		Arrays.fill(dist, n);
		
		for (int i = 0; i < graph.get(0).size(); i++) {
			dfs(graph, graph.get(0).get(i), 0, 1);
		}
		
		System.out.println("Yes");
		for (int i = 1; i < guide.length; i++) {
			System.out.println(guide[i] + 1);
		}
		
	}
}
