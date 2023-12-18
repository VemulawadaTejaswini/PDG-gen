import java.io.*;
import java.util.*;

public class Main {
	static final FastIn in = new FastIn();
	static final PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] $) {
//		new Solver().solveD();
		new Solver().solveE();
		out.close();
	}
	
	private static class Solver {
		public void solveD() {
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
		}
	
		public void solveE() {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; ++i) {
				a[i] = in.nextInt();
			}
			int g = a[0];
			for (int x : a) {
				g = gcd(g, x);
			}
			if (g > 1) {
				out.println("not coprime");
				return;
			}
			HashSet<Integer> seen = new HashSet<>();
			for (int x : a) {
				HashSet<Integer> saw = new HashSet<>();
				while (x%2 == 0) {
					x /= 2;
					seen.add(2);
				}
				int d = 3;
				while (d * d <= x) {
					while (x % d == 0) {
						saw.add(d);
						x /= d;
					}
					d += 2;
				}
				if (x > 1)
					saw.add(x);
				for (int p : saw)
					if (seen.contains(p)) {
						out.println("setwise coprime");
						return;
					}
				seen.addAll(saw);
			}
			
			out.println("pairwise coprime");
			
		}
		
		int gcd(int a, int b) {
			while (b != 0) {
				int temp = a % b;
				a = b;
				b = temp;
			}
			return a;
		}
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