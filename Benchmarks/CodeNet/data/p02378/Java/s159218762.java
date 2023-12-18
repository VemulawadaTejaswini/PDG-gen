import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{
	static int V;
	static int []match;
	static boolean []used;
	static Map<Integer, List<Integer>> G = new HashMap<Integer, List<Integer>>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int E = sc.nextInt();
		int []x = new int[E];
		int []y = new int[E];
		for(int i = 0; i < E; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();
		V = X + Y;
		match = new int[V];
		used = new boolean[V];
		for(int i = 0; i < E; i++) {
			y[i] += X;
			if(G.containsKey(x[i])) {
				G.get(x[i]).add(y[i]);
			}else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(y[i]);
				G.put(x[i], list);
			}
			if(G.containsKey(y[i])) {
				G.get(y[i]).add(x[i]);
			}else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(x[i]);
				G.put(y[i], list);
			}
		}
		int max = bipatricleMatching();
		System.out.println(max);
	}
	static boolean dfs(int v) {
		used[v] = true;
		if(!G.containsKey(v)) return false;
		for(int i = 0; i < G.get(v).size(); i++) {
			int u = G.get(v).get(i);
			int w = match[u];
			if(w < 0 || (!used[w] && dfs(w))) {
				match[v] = u;
				match[u] = v;
				return true;
			}
		}
		return false;
	}
	static int bipatricleMatching() {
		int res = 0;
		Arrays.fill(match, -1);
		for(int v = 0; v < V; v++) {
			if(match[v] < 0) {
				Arrays.fill(used, false);
				if(dfs(v)) res++;
			}
		}
		return res;
	}
}
