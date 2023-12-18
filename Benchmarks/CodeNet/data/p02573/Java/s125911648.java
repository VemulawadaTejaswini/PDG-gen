import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lucasr
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyScanner in = new MyScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		DFriends solver = new DFriends();
		solver.solve(1, in, out);
		out.close();
	}

	static class DFriends {
		public void solve(int testNumber, MyScanner sc, PrintWriter out) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			UnionFind uf = new UnionFind(N);
			for (int i = 0; i < M; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				uf.union(a, b);
			}
			Map<Integer, Integer> counter = new HashMap<>();
			int max = 0;
			for (int i = 0; i < N; i++) {
				int val = uf.find(i);
				int tmp = counter.getOrDefault(val, 0) + 1;
				max = Math.max(max, tmp);
				counter.put(val, tmp);
			}
			out.println(max);
		}

	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;

		public MyScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}

	static class UnionFind {
		int[] rep;

		public UnionFind(int size) {
			rep = new int[size];
			for (int i = 0; i < size; i++) {
				rep[i] = i;
			}
		}

		public int find(int val) {
			if (rep[val] != val) {
				return rep[val] = find(rep[val]);
			}
			return val;
		}

		public boolean union(int a, int b) {
			int aRep = find(a);
			int bRep = find(b);
			if (aRep == bRep) return false;
			rep[aRep] = bRep;
			return true;
		}

	}
}

