import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 	static ArrayList<Integer>[] adj;
 	static boolean[] vis;
 	static int N;
	public static void main(String[] args) {  
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		N = I.nextInt();
		int M = I.nextInt();
		TreeSet<Integer>[] graph = new TreeSet[N+1]; //Avoid duplicates
		for (int i = 1; i <= N; i++) graph[i]=new TreeSet<Integer>();
		adj = new ArrayList[N+1];
		vis = new boolean[N+1];
		for (int i = 1; i <= N; i++) adj[i] = new ArrayList<Integer>();
		int ans = 0;
		while (M-->0) {
			int A = I.nextInt();
			int B = I.nextInt();
			graph[A].add(B);
			graph[B].add(A);
		}
		for (int i = 1; i <= N; i++) {
			while (graph[i].size()>0) {
				adj[i].add(graph[i].pollFirst());
			}
		}
		for (int root = 1; root<=N; root++) {
			if (!vis[root]) {
				ans=max(ans,BFS(root));
			}
		}
		O.pln(ans);
	}
	public static int BFS(int root) {
		int cnt = 1;
		Queue<Integer> cur = new LinkedList<Integer>();
		vis[root]=true;
		cur.add(root);
		while (!cur.isEmpty()) {
			int size = cur.size();
			for (int i = 0; i < size; i++) {
				int now = cur.poll();
				for (int j = 0; j < adj[now].size();j++) {
					int nbr = adj[now].get(j);
					if (!vis[nbr]) {
						vis[nbr]=true;
						cnt++;
						cur.add(nbr);
					}
				}
			}
		}
		return cnt;
	}
	public static double max(double a, double b) {return Math.max(a, b);}
	public static double min(double a, double b) {return Math.min(a, b);}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x, long y) {return Math.abs(x-y);}
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
