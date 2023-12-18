import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	static int n;
	static ArrayList<Integer> G[];
	static int []color;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int m = scan.nextInt();
		G = new ArrayList[n];
		color = new int[n];
		for(int i = 0; i < n; i++) {
			G[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++) {
			int s = scan.nextInt();
			int t = scan.nextInt();
			G[s].add(t);
			G[t].add(s);
		}

//		for(int i = 0; i < n; i++) {
//			System.out.print(i +" ");
//			for(int j = 0; j < G[i].size(); j++) {
//				System.out.print(G[i].get(j) +" ");
//			}
//			System.out.println();
//		}
		assignColor();
		int q = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < q; i++) {
			int s = scan.nextInt();
			int t = scan.nextInt();
			if(color[s] == color[t] && color[s] != -1) {
				sb.append("yes");
				sb.append("\n");
			}else {
				sb.append("no");
				sb.append("\n");
			}
		}
		scan.close();
		System.out.print(sb.toString());

	}
	static void dfs(int r, int c) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(r);
		while(!stack.isEmpty()) {
			int u = stack.pop();
			for(int i = 0; i < G[u].size(); i++) {
				int v = G[u].get(i);
				if(color[v] == -1) {
					color[v] = c;
					stack.push(v);
				}
			}
		}
	}
	static void assignColor() {
		int id = 1;
		for(int i = 0; i < n; i++) {
			color[i] = -1;
		}
		for(int u = 0; u < n; u++) {
			if(color[u] == -1) dfs(u, id++);
		}
	}
}
