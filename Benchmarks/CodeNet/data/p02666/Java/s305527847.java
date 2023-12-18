import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static long MOD = 1000000007;
	
	static long add(long x, long y) {
		x += y;
		if (x >= MOD) return x - MOD;
		return x;
	}
	static long sub(long x, long y) {
		x -= y;
		if (x < 0) return x + MOD;
		return x;
	}
	static long mult(long x, long y) {
		return (x * y) % MOD;
	}
	
	static long mult(long x, long y, long z) {
		return mult(x,  mult(y, z));
	}
	
	static long pow(long base, long exp) {
		if (exp == 0) return 1;
		if ((exp & 1) == 1) return mult(base, pow(base, exp - 1));
		return pow(mult(base, base), exp / 2);
	}
	
	static long inverse(long x) {
		return pow(x, MOD - 2);
	}
	
	static long[] getPots(long base, int max) {
		long[] ret = new long[max + 1];
		ret[0] = 1;
		for (int i = 1; i <= max; i++) {
			ret[i] = mult(ret[i-1], base);
		}
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		int N = sc.nextInt();
		int[] parent = new int[N];
		List<Integer>[] adj = new List[N];
		for (int i = 0; i < N; i++) {
			adj[i] = new ArrayList<>();
		}
		for (int i = 0; i < N; i++) {
			parent[i] = sc.nextInt();
			if (parent[i] >= 1) {
				parent[i]--;
				adj[parent[i]].add(i);
				adj[i].add(parent[i]);
			}
		}
		
		int[] cc = new int[N];
		int[] count = new int[N];
		int tot = 0;
		Arrays.fill(cc, -1);
		for (int i = 0; i < N; i++) if (cc[i] == -1) {
			int tmp = 1;
			cc[i] = tot;
			Deque<Integer> queue = new ArrayDeque<>();
			queue.addLast(i);
			while (!queue.isEmpty()) {
				int cur = queue.pollFirst();
				for (int vec : adj[cur]) {
					if (cc[vec] == -1) {
						cc[vec] = tot;
						queue.addLast(vec);
						tmp++;
					}
				}
			}
			count[tot] = tmp;
			tot++;
		}
		List<Integer> sizes = new ArrayList<>();
		for (int i = 0; i < N; i++) if (parent[i] == -1) {
			sizes.add(count[cc[i]]);
		}
		
		int pending = sizes.size();
		long[] pots = getPots(N - 1, pending);
		long[][] table = new long[pending][pending + 1];
		for (int pos = 0; pos < pending; pos++) {
			table[pos][0] = (sizes.get(pos) - 1);
			table[pos][1] = sizes.get(pos) + (pos > 0 ? table[pos - 1][1]: 0);
		}
		for (int pos = 0; pos < pending; pos++) {
			for (int cicles = 2; cicles <= pending; cicles++) {
				table[pos][cicles] = pos > 0 ? table[pos - 1][cicles] : 0;
				long tmp = pos > 0 ? mult(table[pos - 1][cicles - 1], cicles - 1, sizes.get(pos)) : 0;
				table[pos][cicles] = add(table[pos][cicles], tmp);
			}
		}
		int rem = tot - pending;
		long ans = mult((N - rem), pots[pending]);
		if (pending > 0) {
			ans = sub(ans, mult(table[pending - 1][1] - pending, pots[pending - 1]));
			for (int cicles = 2; cicles <= pending; cicles++) {
				ans = sub(ans, mult(table[pending - 1][cicles], pots[pending - cicles]));
			}
		}
		out.println(ans);
		
		out.flush();
	}
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
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
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
