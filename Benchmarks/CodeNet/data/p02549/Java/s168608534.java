import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	static long mod = 998244353;
	static long[] segtree;
	static long[] dp;
	public static void main(String[] args) { 
		/*
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int K = I.nextInt();
		int[][] segs = new int[K][2];
		dp = new long[N+1];
		segtree = new long[4*N];
		for (int i = 0; i < K; i++) {
			segs[i][0] = I.nextInt();
			segs[i][1] = I.nextInt();
		}
		dp[0]=1;
		build(1,0,N-1);
		for (int i = 0; i < N; i++) {
			for (int k = 0; k < K; k++) {
				int hi = i-segs[k][0];
				int lo = i-segs[k][1];
				dp[i]+=getAns(1,0,N-1,lo,hi);
				dp[i]%=mod;
			}
			dp[i]%=mod;
			UPD(1,0,N-1,i,dp[i]);
		} 
		O.pln(dp[N-1]);
	}
	public static void build(int node, int start, int end) {
		if (start==end) segtree[node]=dp[start];
		else {
			int mid = (start+end)/2;
			build(2*node,start,mid);
			build(2*node+1,mid+1,end);
			segtree[node]=segtree[2*node]+segtree[2*node+1];
		}
	}
	public static void UPD(int node, int start, int end, int in, long val) {
		if (start==end) segtree[node]=val;
		else {
			int mid = (start+end)/2;
			if (in>=start&&in<=mid) {
				UPD(2*node,start,mid,in,val);
			}else {
				UPD(2*node+1,mid+1,end,in,val);
			}
			segtree[node]=segtree[2*node]+segtree[2*node+1];
		}
	}
	public static long getAns(int node, int start, int end, int L, int R) {
		if (L>end||R<start) return 0; //Out of scope
		if (L<=start&&R>=end) return segtree[node];
		int mid = (start+end)/2;
		long left = getAns(2*node,start,mid,L,R);
		long right = getAns(2*node+1,mid+1,end,L,R);
		return left+right;
	}
	public static double max(double a, double b) {return Math.max(a, b);}
	public static double min(double a, double b) {return Math.min(a, b);}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x) {return Math.abs(x);}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return max(a,b);
		return GCD(min(a,b),max(a,b)%min(a,b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
	public static int pop(long x) { //Returns number of bits within a number
		int cnt = 0;
		while (x>0) {
			if (x%2==1) cnt++;
			x/=2;
		}
		return cnt;
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
		double nextDouble() {return Double.parseDouble(next());}
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(double x) {w.println(x);w.flush();}
		void pln(boolean x) {w.println(x);w.flush();}
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void pln(BigInteger x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(BigInteger x) {w.print(x);w.flush();}
		void p(double x) {w.print(x);w.flush();}
		void p(boolean x) {w.print(x);w.flush();}
	}
}