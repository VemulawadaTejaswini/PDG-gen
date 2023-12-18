import java.io.*; 
import java.math.*;
import java.util.*;
public class Main {  //~IQEmperor~ 
	public static void main(String[] args) {
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		long K = I.nextLong();
		int[] P = new int[N+1];
		long[] C = new long[N+1];
		long ans = Long.MIN_VALUE;
		ArrayList<Integer>[] seqs = new ArrayList[N+1]; //seqs[i] = Cycle you 
		for (int i = 1; i <= N; i++) seqs[i] = new ArrayList<Integer>();
		//follow when you pick square i to start
		for (int i = 1; i <= N; i++) P[i] = I.nextInt();
		for (int i = 1; i <= N; i++) C[i] = I.nextLong();
		for (int i = 1; i <= N; i++) {
			seqs[i].add(i); ///starting point
			boolean[] vis = new boolean[N+1];
			int cur = P[i];
			vis[i]=true;
			while (true) {
				if (vis[cur]) break;
				seqs[i].add(cur);
				cur=P[cur];
			}
		}
		for (int start = 1; start<=N; start++) {
			long sum = 0;
			long curans = 0;
			for (int j = 0; j < seqs[start].size(); j++) {
				int next = seqs[start].get(j);
				sum+=C[next];
				ans=max(ans,sum);
			}
			if (sum>0) {
				long tempK = K-seqs[start].size()+1; //First square doesn't count as move
				tempK=max(tempK,0); //No such thing as negative number of operations
				long itr = (long)(tempK/seqs[start].size());
				long left = K-itr*seqs[start].size();
				curans+=itr*sum; //Number of full cycles
				for (int j = 1; j < seqs[start].size(); j++) {
					int next = seqs[start].get(j);
					curans+=C[next]; //Adding beginning prefix
					left--;
				}
				ans=max(curans,ans);
				int in = 0;
				while (left-->0) {
					int next = seqs[start].get(in);
					curans+=C[next];
					ans=max(ans,curans);
					in++;
				}
			}
		}
		O.pln(ans);
		//O.pln("ZERO");
	}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x, long y) {return Math.abs(x-y);}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
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