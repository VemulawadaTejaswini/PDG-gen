import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	static ArrayList<Integer>[] graph;
	static int[] seen;
	static int N;
	public static void main(String[] args) { 
		/*
		 * */
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		StringBuilder ans = new StringBuilder();
		N = I.nextInt();
		int[][] town = new int[N][2];
		int[] min = new int[N+1]; //min[i] = minimum y-coordinate with coordinate <= i
		min[0]=(int)(1e9);
		int[] max = new int[N+5]; //max[i] = maximum y-coordinate with x-coordinate >= i
		int[] a = new int[N+1];
		int[] in = new int[N+1]; //in[i] = index of city with y-coordinate = i
		graph = new ArrayList[N+1];
		seen = new int[N];
		for (int i = 0; i <= N; i++) graph[i] = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			town[i][0]=I.nextInt();
			town[i][1]=I.nextInt();
			a[town[i][0]]=town[i][1]; //a[x]=y
			in[town[i][1]]=i;
		}
		for (int i = 1; i<=N; i++) {
			min[i]=min(min[i-1],a[i]);
		} 
		max[N]=a[N];
		for (int i = N-1; i >= 1; i--) {
			max[i]=max(max[i+1],a[i]);
		}
		for (int i = 0; i < N; i++) {
			int x = town[i][0];
			int y = town[i][1];
			int mn = min[x-1];
			int mx = max[x+1]; //No out of bounds
			if (mn<y) {
				int index = in[mn];
				graph[i].add(index);
				graph[index].add(i);
			}
			else if (mx>y) {
				int index = in[mx];
				graph[i].add(index);
				graph[index].add(i);
			}
		}
		for (int i = 0; i < N; i++) {
			int size = seen[i];
			if (size==0) size=BFS(i);
			ans.append(size);
			ans.append("\n");
		}
		O.pln(ans);
	}
	public static int BFS(int start) {
		boolean[] vis = new boolean[N];
		int ans = 1;
		Queue<Integer> cur = new LinkedList<Integer>();
		cur.add(start);
		vis[start]=true;
		while (!cur.isEmpty()) {
			int size = cur.size();
			for (int i = 0; i < size; i++) {
				int now = cur.poll();
				for (int j = 0; j < graph[now].size(); j++) {
					int nbr = graph[now].get(j);
					if (!vis[nbr]) {
						vis[nbr]=true;
						ans++;
						cur.add(nbr);
					}
				}
			}
		}
		for (int i = 0; i < N; i++) {
			if (vis[i]) seen[i]=ans;
		}
		return ans;
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
