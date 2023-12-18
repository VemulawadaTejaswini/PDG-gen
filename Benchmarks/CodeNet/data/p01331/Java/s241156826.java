
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
	
	String INPUT = "./data/judge/201709/A2214.txt";
	
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	
	static final int MOD = 1000000007;
	
	class Wormhole implements Comparable<Wormhole>{
		int x1;
		int y1;
		int x2;
		int y2;
		
		public Wormhole(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.x2 = x2;
			this.y1 = y1;
			this.y2 = y2;
		}

		@Override
		public int compareTo(Wormhole that) {
			return this.x1 != that.x1 ? this.x1 - that.x1 : this.y1 - that.y1;
		}
	}
	
	List<Wormhole> holes;
	
	void solve() {
		
		init_factorial();
		
		while (more()) {
			int n = ni();
			int m = ni();
			int k = ni();
			
			if (n + m + k == 0) break;
			holes = new ArrayList<>();
			n --;
			m --;
			for (int i = 0; i < k; ++i) {
				int x1 = ni();
				int y1 = ni();
				int x2 = ni();
				int y2 = ni();
				holes.add(new Wormhole(x1 - 1, y1 - 1, x2 - 1, y2 - 1));
			}
			
			Collections.sort(holes);
			holes.add(new Wormhole(n, m, n + 1, m + 1));
			
			int[] dp = new int[k + 16];
			for (int i = 0; i <= k; ++i) {
				Wormhole hole = holes.get(i);
				dp[i] = nck(hole.x1+ hole.y1, hole.x1);
				for (int j = 0; j < i; ++j) {
					Wormhole prev = holes.get(j);
					dp[i] = add(dp[i], mul(dp[j], sub(calc(prev.x2, prev.y2, hole.x1, hole.y1), 
													  calc(prev.x1, prev.y1, hole.x1, hole.y1))));
				}
			}
			out.println(dp[k]);
		}
	}
	
	/************************* mod_fact && mod_comb*****************************/
	int add(int a, int b) {
		return (a + b) % MOD;
	}
	
	int sub(int a, int b) {
		return (a - b + MOD) % MOD;
	}
	
	int mul(long a, long b) {
		return (int) (((a * b)) % MOD);
	}
	
	int[] fact = new int[200010];
	
	void init_factorial() {
		fact[0] = 1;
		for (int i = 1; i < 200000; ++i) {
			fact[i] = mul(fact[i - 1], i);
		}
	}
	
	class GCD{
		int d;
		int x;
		int y;
		public GCD(int d, int x, int y) {
			this.d = d;
			this.x = x;
			this.y = y;
		}
	}
	
	GCD extgcd(int a, int b) {
		if (b == 0) return new GCD(a, 1, 0);
		else {
			GCD p   = extgcd(b, a % b);
			GCD ans = new GCD(0, 0, 0);
			ans.d = p.d;
			ans.x = p.y;
			ans.y = p.x - (a / b) * p.y;
			return ans;
		}
	}
	
	int inv(int a, int m) {
		GCD p = extgcd(a, m);
		if (p.d != 1) return -1;
		return (p.x % m + m) % m;
	}
	
	int nck(int n, int k) {
		return mul(mul(fact[n], inv(fact[n - k], MOD)), inv(fact[k], MOD));
	}
	
	int calc(int x1, int y1, int x2, int y2) {
		if (x2 < x1 || y2 < y1) return 0;
		return nck(x2 - x1 + y2 - x1, x2 - x1);
	}

	FastScanner in;
	PrintWriter out;
	
	void run() throws IOException {
		boolean oj;
		try {
			oj = ! System.getProperty("user.dir").equals("F:\\java_workspace\\leetcode");
		} catch (Exception e) {
			oj = System.getProperty("ONLINE_JUDGE") != null;
		}
		
		InputStream is = oj ? System.in : new FileInputStream(new File(INPUT));
		in = new FastScanner(is);
		out = new PrintWriter(System.out);
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if (!oj){
			System.out.println("[" + (System.currentTimeMillis() - s) + "ms]");
		}
	}
	
	public boolean more(){
		return in.hasNext();
	}
	
	public int ni(){
		return in.nextInt();
	}
	
	public long nl(){
		return in.nextLong();
	}
	
	public double nd(){
		return in.nextDouble();
	}
	
	public String ns(){
		return in.nextString();
	}
	
	public char nc(){
		return in.nextChar();
	}
	
	class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		boolean hasNext;

		public FastScanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
			hasNext = true;
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					hasNext = false;
					return "##";
				}
			}
			return st.nextToken();
		}
		
		String next = null;
		public boolean hasNext(){
			next = nextToken();
			return hasNext;
		}

		public int nextInt() {
			if (next == null){
				hasNext();
			}
			String more = next;
			next = null;
			return Integer.parseInt(more);
		}

		public long nextLong() {
			if (next == null){
				hasNext();
			}
			String more = next;
			next = null;
			return Long.parseLong(more);
		}

		public double nextDouble() {
			if (next == null){
				hasNext();
			}
			String more = next;
			next = null;
			return Double.parseDouble(more);
		}
		
		public String nextString(){
			if (next == null){
				hasNext();
			}
			String more = next;
			next = null;
			return more;
		}
		
		public char nextChar(){
			if (next == null){
				hasNext();
			}
			String more = next;
			next = null;
			return more.charAt(0);
		}
	}
}