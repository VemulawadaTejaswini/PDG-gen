
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 30;
	static int modP = 1000000007;

	static class TaskX {
		@SuppressWarnings("unchecked")
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int n = in.nextInt();
			List<E>[] G = new ArrayList[n];
			G = Stream.generate(ArrayList::new).limit(n).toArray(List[]::new);
			for (int i = 0; i < n; i++) {
				int u = in.nextInt(), k = in.nextInt();
				for (int j = 0; j < k; j++) {
					int v = in.nextInt(), c = in.nextInt();
					G[u].add(new E(u, v, c));
				}
			}

			V[] vs = new V[n];
			for (int i = 0; i < n; i++) {
				vs[i] = new V(i, INF);
			}
			vs[0].c = 0;

			PriorityQueue<V> pq = new PriorityQueue<>(new MyComparator());
			pq.add(vs[0]);

			boolean[] isDefine = new boolean[n];
			while (!pq.isEmpty()) {
				V v = pq.remove();
				isDefine[v.n] = true;
				int nowCost = v.c;

				for (int i = 0; i < G[v.n].size(); i++) {
					int toNum = G[v.n].get(i).to;
					int toWeight = G[v.n].get(i).weight;

					if (!isDefine[toNum] && nowCost + toWeight < vs[toNum].c) {
						vs[toNum].c = nowCost + toWeight;
						pq.add(vs[toNum]);
					}
				}
			}

			for (int i = 0; i < n; i++) {
				out.println(i + " " + vs[i].c);
			}

		}
		static class MyComparator implements Comparator {
			@Override
			public int compare(Object o1, Object o2) {

				Integer c1 = ((V)o1).c;
				Integer c2 = ((V)o2).c;

				if (c1 > c2) {
					return 1;
				} else if (c1 < c2) {
					return -1;
				} else {
					return 0;
				}

			}
		}

		static class V {
			int n, c;
			V (int n, int c) {
				this.n = n;
				this.c = c;
			}
		}

		static class E {
			int from, to, weight;
			E (int from, int to ,int weight) {
				this.from = from;
				this.to = to;
				this.weight = weight;
			}
		}

	}

	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}

	}

}

