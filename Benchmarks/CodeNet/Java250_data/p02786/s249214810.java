import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static final double EPS = 1e-9;
	static long mod = 1000000007;
	static int inf = (int) 1e9 + 2;
	static long[] fac;
	static Long[] a;
	static int[] si;
	static ArrayList<Integer> primes;
	static ArrayList<Integer>[] ad;
	static ArrayList<qu>[] d;
	static edge[] ed;
	static int[] l, ch;
	static int[] occ, p;
	static Queue<Integer>[] can;
	static String s;
	static int[][][] memo;
	static int n, m, k,offset=300;
	static int[] v;
	static int[] wi;
	static int []da;
	static long x;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		long n=sc.nextLong();
		long ans=0;
		if(n==1)
			System.out.println(1);
		else {
			int y=(int)(Math.log(n)/Math.log(2));
//			System.out.println(y);
			ans=(1l<<(y+1))-1;
			System.out.println(ans);
		}
		out.flush();
	}

	static class qu implements Comparable<qu> {
		int a;
		int b;

		qu(int y, int g) {
			a = y;
			b = g;
		}

		public String toString() {
			return a + " " + b;
		}

		public int compareTo(qu o) {
			if(a==o.a)
				return b-o.b;
			return a-o.a;
		}
	}

	static class seg implements Comparable<seg> {
		int a;
		int b;
		int l;
		int r;
		int bit;

		seg(int s, int e, int x, int y, int bi) {
			a = s;
			b = e;
			l = x;
			r = y;
			bit = bi;
		}

		public String toString() {
			return a + " " + b + " " + l + " " + r + " " + bit;
		}

		public int compareTo(seg o) {
			// if(a==o.a)
			return bit - o.bit;
			// return
		}
	}

	static class pair {
		long to;
		long number;

		pair(long t, long n) {
			number = n;
			to = t;
		}

		public String toString() {
			return to + " " + number;
		}
	}

	static long modPow(long a, int e)

	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res;
	}

	static long inver(long x) {
		long a = x;
		long e = (mod - 2);
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1) {
				res = ((1l * res * a) % mod);
			}
			a = ((1l * a * a) % mod);
			e >>= 1;
		}
		return res % mod;
	}

	static class edge implements Comparable<edge> {
		int from;
		int to;
		int number;

		edge(int f, int t, int n) {
			from = f;
			to = t;
			number = n;
		}

		public String toString() {
			return from + " " + to + " " + number;
		}

		public int compareTo(edge f) {
			return f.number - number;
		}
	}

	static void seive(int N) {
		si = new int[N];
		primes = new ArrayList<>();
		si[1] = 1;
		for (int i = 2; i < N; i++) {
			if (si[i] == 0) {
				si[i] = i;
				primes.add(i);
			}
			for (int j = 0; j < primes.size() && primes.get(j) <= si[i] && (i * primes.get(j)) < N; j++)
				si[primes.get(j) * i] = primes.get(j);

		}
	}

	static long fac(int n) {
		if (n == 0)
			return fac[n] = 1;
		if (n == 1)
			return fac[n] = 1;
		long ans = 1;
		for (int i = 1; i <= n; i++)
			fac[i] = ans = (i % mod * ans % mod) % mod;
		return ans % mod;
	}

	static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static class unionfind {
		int[] p;
		int[] size;
		int[] max;
		int num;

		unionfind(int n) {
			p = new int[n];
			size = new int[n];
			max = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = i;
				max[i] = i;
			}
			Arrays.fill(size, 1);
			num = n;
		}

		int findSet(int v) {
			if (v == p[v])
				return v;

			max[v] = Math.max(max[v], max[p[v]]);

			p[v] = findSet(p[v]);

			max[v] = Math.max(max[v], max[p[v]]);

			return p[v];
		}

		boolean sameSet(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return true;
			return false;
		}

		int max() {
			int max = 0;
			for (int i = 0; i < size.length; i++)
				if (size[i] > max)
					max = size[i];
			return max;
		}

		boolean combine(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return true;
			// System.out.println(num+" ppp");
			num--;
			if (size[a] > size[b]) {
				p[b] = a;
				max[a] = Math.max(max[a], max[b]);
				size[a] += size[b];

			} else {
				p[a] = b;
				max[b] = Math.max(max[a], max[b]);
				size[b] += size[a];
			}
			return false;
		}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}