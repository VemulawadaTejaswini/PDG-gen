import java.util.*;
import java.io.*;
 
public class Main {
	static PrintWriter pw;
	static BufferedReader br;
	static int inf = (int) 1e9;
	static long mod = (long) 1e9 + 7;
	static int[][] memo;
	static boolean[] vis;
	static boolean[][] ok;
	static int[] a;
	static int n, m;
	static ArrayList<Integer>[] adj;
	static ArrayList<Integer> primes;
	static int[] isComposite;
 
	static void sieve(int N) // O(N log log N)
	{
		isComposite = new int[N + 1];
		isComposite[0] = isComposite[1] = 1; // 0 indicates a prime number
		primes = new ArrayList<Integer>();
 
		for (int i = 2; i <= N; ++i) // can loop till i*i <= N if primes array is not needed O(N log log sqrt(N))
			if (isComposite[i] == 0) // can loop in 2 and odd integers for slightly better performance
			{
				primes.add(i);
				if (1l * i * i <= N)
					for (int j = i * i; j <= N; j += i) // j = i * 2 will not affect performance too much, may alter in
														// modified sieve
						isComposite[j] = 1;
			}
	}
 
	static ArrayList<Integer> primeFactors(int N) // O(sqrt(N) / ln sqrt(N))
	{
		ArrayList<Integer> factors = new ArrayList<Integer>(); // take abs(N) in case of -ve integers
		int idx = 0, p = primes.get(idx);
 
		while (p * p <= N) {
			while (N % p == 0) {
				factors.add(p);
				N /= p;
			}
			p = primes.get(++idx);
		}
 
		if (N != 1) // last prime factor may be > sqrt(N)
			factors.add(N); // for integers whose largest prime factor has a power of 1
		return factors;
	}
 
	static int maxFactor(int N) // O(sqrt(N) / ln sqrt(N))
	{ // take abs(N) in case of -ve integers
		int idx = 0, p = primes.get(idx);
		int ans = -1;
		while (p * p <= N) {
			while (N % p == 0) {
				N /= p;
				ans = p;
			}
			p = primes.get(++idx);
		}
 
		if (N != 1) // last prime factor may be > sqrt(N)
			return N; // for integers whose largest prime factor has a power of 1
		return ans;
	}
 
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(System.out);
 
		int a = Integer.parseInt(br.readLine());
		pw.println(a+a*a+a*a*a);
 
		pw.flush();
	}
 
	static ArrayList<Integer> ans;
 
	static void bfs(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		vis[n] = true;
		int id = 1;
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int u = q.remove();
				if (id % 3 == 0)
					ans.add(u + 1);
				for (int v : adj[u])
					if (!vis[v]) {
						vis[v] = true;
						q.add(v);
					}
			}
			id++;
		}
	}
 
	static boolean valid(int x, int y) {
		return x > -1 && x < n && y > -1 && y < m;
	}
 
	static class pair implements Comparable<pair> {
		int x;
		int y;
 
		public pair(int d, int u) {
			x = d;
			y = u;
		}
 
		public int compareTo(pair o) {
			if (x == o.x)
				return y - o.y;
			return x - o.x;
		}
 
	}
 
	static class pair2 implements Comparable<pair2> {
		int x;
		int y;
 
		public pair2(int d, int u) {
			x = d;
			y = u;
		}
 
		public int compareTo(pair2 o) {
			return y - o.y;
		}
 
	}
 
	static int[] nxtarr() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[st.countTokens()];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		return a;
	}
 
	static long pow(long a, long e) // O(log e)
	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res *= a;
			a *= a;
			e >>= 1;
		}
		return res;
	}
 
	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}