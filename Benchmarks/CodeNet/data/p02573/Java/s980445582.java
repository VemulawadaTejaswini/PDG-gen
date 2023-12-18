import java.io.*;
import java.util.*;

public class Main {
	static final FastIn in = new FastIn();
	static final PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] $) {
		int N = in.nextInt(), M = in.nextInt();
		List<Integer>[] adj = new List[N];
		for (int i = 0; i < N; ++i) adj[i] = new ArrayList<Integer>();
		for (int i = 0; i < M; ++i) {
			int a = in.nextInt() - 1, b = in.nextInt() - 1;
			adj[a].add(b);
			adj[b].add(a);
		}
		ArrayList<Integer> individuals = new ArrayList<>();
		boolean[] visited = new boolean[N];
		for (int i = 0; i < N; ++i) {
			if (visited[i]) continue;
			ArrayList<Integer> component = new ArrayList<>();
			Stack<Integer> stack = new Stack<>();
			stack.add(i);
			while (!stack.empty()) {
				int top = stack.pop();
				if (visited[top]) continue;
				visited[top] = true;
				component.add(top);
				for (int child : adj[top]) {
					if (visited[child]) continue;
					stack.push(child);
				}
			}
			individuals.add(component.size());
		}
		int ans = individuals.stream().mapToInt(a -> a).max().orElse(0);
		out.println(ans);
		out.close();
	}
	
	private static class FastIn {
		private BufferedReader br;
		private StringTokenizer st;
		public FastIn() {
			st = null;
			br = new BufferedReader(new InputStreamReader(System.in), 1 << 20);
		}
		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}