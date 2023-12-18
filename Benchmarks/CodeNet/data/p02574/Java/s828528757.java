import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	private static final FastIn in = new FastIn();
	private static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		new Solution().solve();
		out.close();
	}

	private static final class Solution {
		public void solve() {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; ++i)
				a[i] = in.nextInt();
			ArrayList<Integer> primes = IntStream.of(new int[] { 2, 3, 5, 7, 11, 13 }).boxed()
					.collect(Collectors.toCollection(ArrayList::new));
			for (int i = 17; i < 1000000; i += 2) {
				boolean ok = true;
				for (int j = 0; primes.get(j) * primes.get(j) <= i; ++j)
					if (i % primes.get(j) == 0) {
						ok = false;
						break;
					}
				if (ok)
					primes.add(i);
			}
			HashMap<Integer, Integer> cnt = new HashMap<>();
			for (int i : a) {
				int t = i;
				for (int j = 0; primes.get(j) * primes.get(j) <= t; ++j) {
					if (t % primes.get(j) == 0)
						cnt.put(primes.get(j), cnt.getOrDefault(primes.get(j), 0) + 1);
					while (t % primes.get(j) == 0)
						t /= primes.get(j);
				}
				if (t != 1)
					cnt.put(t, cnt.getOrDefault(t, 0) + 1);
			}
			int large = 0;
			for (int key : cnt.keySet()) {
				large = Math.max(large, cnt.get(key));
			}
			if (large <= 1) {
				out.println("pairwise coprime");
			} else {
				out.println(large < n ? "setwise coprime" : "not coprime");
			}
		}
	}

	private static final class FastIn {
		private BufferedReader br;
		private StringTokenizer st;

		public FastIn() {
			br = new BufferedReader(new InputStreamReader(System.in), 1 << 20);
			st = null;
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
