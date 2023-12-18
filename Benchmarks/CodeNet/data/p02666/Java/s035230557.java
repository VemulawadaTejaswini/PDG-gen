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
	
	static final long MOD = 1000000007;
	
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
		long[] pots = new long[pending + 1];
		pots[0] = 1;
		for (int i = 1; i <= pending; i++) {
			pots[i] = (pots[i-1] * (N - 1)) % MOD;
		}
		long[][] table = new long[pending][pending + 1];
		for (int pos = 0; pos < pending; pos++) {
			table[pos][0] = (sizes.get(pos) - 1);
			table[pos][1] = sizes.get(pos) + (pos > 0 ? table[pos - 1][1]: 0);
		}
		for (int pos = 0; pos < pending; pos++) {
			for (int cicles = 2; cicles <= pending; cicles++) {
				table[pos][cicles] = pos > 0 ? table[pos - 1][cicles] : 0;
				long tmp = pos > 0 ? (table[pos - 1][cicles - 1] * (cicles - 1) * sizes.get(pos)) % MOD : 0;
				table[pos][cicles] += tmp;
				table[pos][cicles] %= MOD;
			}
		}
		int rem = tot - pending;
		long ans = ((N - rem) * pots[pending]) % MOD;
		if (pending > 0) {
			ans -= (table[pending - 1][1] - pending) * pots[pending - 1];
			ans %= MOD; ans += MOD; ans %= MOD;
			for (int cicles = 2; cicles <= pending; cicles++) {
				ans += (MOD - (table[pending - 1][cicles] * pots[pending - cicles]) % MOD);
				ans %= MOD;
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
