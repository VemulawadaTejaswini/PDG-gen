import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.lang.Math.*;

public class Main {
	
	public static void main(String[] args) throws Exception {new Main().run();}
	public FastIO file = new FastIO();
	public int ntc, ctc;
	public final long MOD = 1000000007L; //998244353L; 
	public final int M0D = 1000000007; //998244353
	public final int N = 200005, dx[] = { 0, 1, 0, -1 }, dy[] = { 1, 0, -1, 0 };
	
	public void run() throws Exception {
		ntc = 1; //nextInt();
		for (ctc = 1; ctc <= ntc; ++ctc) solve();
		file.out.flush(); file.out.close();
	}
	
	
	
	void solve() {
		int n = nextInt();
		int[] ans = new int[n+1];
		for (int x = 1; x * x <= n; ++x) {
			for (int y = 1; x * x + y * y + x * y <= n; ++y)
				for (int z = 1; x * x + y * y + z * z + x * y + y * z + x * z <= n; ++z) {
					//println(x * x + y * y + z * z + x * y + y * z + x * z + " " + x + " " + y + " " + z);
					ans[x * x + y * y + z * z + x * y + y * z + x * z]++;
				}
		}
		for (int i = 1; i <= n; ++i)
			println(ans[i]);
	}
	
	void sort(long[] a) { shuffle(a); Arrays.sort(a); }
	void sort(int[] a) { shuffle(a); Arrays.sort(a); }
	void shuffle(long[] a) {
		for (int i = a.length - 1; i >= 0; i--) { int j = (int) (Math.random() * (i + 1)); a[i] ^= a[j] ^ (a[j] = a[i]); } }
	void shuffle(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) { int j = (int) (Math.random() * (i + 1)); a[i] ^= a[j] ^ (a[j] = a[i]); } }
	long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }
	long lcm(long x, long y) { return x / gcd(x, y) * y; }
	long mod(long n, long mod) { return (n % mod + mod) % mod; }
	long max(long a, long b) { return Math.max(a, b); }
	int max(int a, int b) { return Math.max(a, b); }
	long min(long a, long b) { return Math.min(a, b); }
	int min(int a, int b) { return Math.min(a, b); }
	long pow(long n, long p, long mod) { long ret = 1L;
	while (p > 0) { if (p % 2 != 0L) ret = mod(ret * n, mod); n = mod(n * n, mod); p >>= 1L; } return ret; }
	long pow(long n, long p) { long ret = 1L;
	while (p > 0) { if (p % 2 != 0L) ret *= n; n *= n; p >>= 1L; } return ret; }
	boolean isPrime(int n) { 
		if (n <= 1) return false; if (n <= 3) return true; if (n % 2 == 0 || n % 3 == 0) return false;
		for (int i = 5; i * i <= n; i = i + 6) if (n % i == 0 || n % (i + 2) == 0) return false; return true; }
	String next() {return file.next();}
	int nextInt() {return file.nextInt();}
	long nextLong() {return file.nextLong();}
	double nextDouble() {return file.nextDouble();}
	String nextLine() {return file.nextLine();}
	void print(Object o) {file.out.print(o);}
	void println(Object o) {file.out.println(o);}
	void printf(String s, Object... o) {file.out.printf(s, o);}
	class FastIO {
		BufferedReader br;
		StringTokenizer st;
		PrintWriter out;
		public FastIO() {br = new BufferedReader(new InputStreamReader(System.in));out = new PrintWriter(System.out);}
		String next() {while (st == null || !st.hasMoreElements()) {try {st = new StringTokenizer(br.readLine());} catch (IOException e) {e.printStackTrace();}}return st.nextToken();}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());}
		double nextDouble() {return Double.parseDouble(next());}
		String nextLine() {String str = "";try {str = br.readLine();} catch (IOException e) {e.printStackTrace();} return str;}
		void print(Object o) {out.print(o);}
		void println(Object o) {out.println(o);}
		void printf(String s, Object... o) {out.printf(s, o);} }
	class Pair<A, B> implements Comparable {
		A fi; B se;
		public Pair(A fi, B se) { this.fi = fi; this.se = se; }
		public boolean equals(Object o) { if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pair<?, ?> p = (Pair<?, ?>) o; if (!fi.equals(p.fi)) return false; return se.equals(p.se); }
		public int hashCode() { return 31 * fi.hashCode() + se.hashCode(); }
		public String toString() { return fi.toString() + " " + se.toString(); }
		<A, B> Pair<A, B> of(A a, B b) { return new Pair<A, B>(a, b); }
		public int compareTo(Object o) { Pair<?, ?> p = (Pair<?, ?>) o;
		if (fi.equals(p.fi)) return ((Comparable) se).compareTo(p.se); return ((Comparable) fi).compareTo(p.fi); } } }