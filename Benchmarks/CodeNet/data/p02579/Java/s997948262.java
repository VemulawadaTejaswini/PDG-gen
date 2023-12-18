import java.io.*;
import java.math.*;
import java.util.*;
public class WizardInMaze {
	/*BFS over adjacent road sections
	 * Country/Territory 
	 * If a square could be achieved through 0 magic, a hard square will take at most 1
	 * magic (Therefore BFS on numbers 0-upper bound); Until all valid road cells possible 
	 * to hit from start have been visited*/
	static long[][] dp;
	static int R;
	static int C;
	static boolean[][] vis;
	static char[][] grid;
	static ArrayList<int[]> coords;
	public static void main(String[] args) {  
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		R = I.nextInt();
		C = I.nextInt();
		int r1 = I.nextInt()-1;
		int c1 = I.nextInt()-1;
		int r2 = I.nextInt()-1;
		int c2 = I.nextInt()-1;
		coords=new ArrayList<int[]>(); //Faster removal time
		grid = new char[R][C];
		int cur = 0;
		vis = new boolean[R][C];
		for (int i = 0; i < R; i++) grid[i] = I.next().toCharArray();
		dp = new long[R][C];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				dp[i][j] = Integer.MAX_VALUE;
				if (grid[i][j]=='.') {
					int[] add = {i,j};
					coords.add(add);
				} 
			} 
		}
		dp[r1][c1]=0;
		while (true) {
			boolean added=false;
			for (int i = 0; i < coords.size(); i++) {
				int[] start = coords.get(i);
				int r = start[0];
				int c = start[1];
				if (dp[r][c]==cur) {
					BFS(start,cur);
					added=true;
				}
			}
			cur++;
			if (!added) break;
		}
		O.pln(dp[r2][c2]==Integer.MAX_VALUE?-1:dp[r2][c2]);
	}
	public static void BFS(int[] start, int cur) {
		vis[start[0]][start[1]]=true;
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(start);
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int[] pos = q.poll();
				int r = pos[0];
				int c = pos[1];
				dp[r][c]=cur;
				if (r-1>=0&&grid[r-1][c]=='.'&&!vis[r-1][c]) {
					int[] add = {r-1,c};
					vis[r-1][c]=true;
					dp[r-1][c]=cur; //Can go there without magic
					q.add(add);
				}
				if (r+1<R&&grid[r+1][c]=='.'&&!vis[r+1][c]) {
					int[] add = {r+1,c};
					vis[r+1][c]=true;
					dp[r+1][c]=cur; //Can go there without magic
					q.add(add);
				}
				if (c-1>=0&&grid[r][c-1]=='.'&&!vis[r][c-1]) {
					int[] add = {r,c-1};
					vis[r][c-1]=true;
					dp[r][c-1]=cur; //Can go there without magic
					q.add(add);
				}if (c+1<C&&grid[r][c+1]=='.'&&!vis[r][c+1]) {
					int[] add = {r,c+1};
					vis[r][c+1]=true;
					dp[r][c+1]=cur; //Can go there without magic
					q.add(add);
				}
				for (int backr = max(r-2,0); backr<=min(r+2,R-1); backr++) {
					for (int backc = max(c-2,0); backc<=min(c+2,C-1); backc++) {
						if (grid[backr][backc]=='.') dp[backr][backc]=min(dp[backr][backc],cur+1);
						//Maybe magic is best in some cases
					}
				}
			}
		}
	}
	public static long min(long a, long b) {return Math.min(a,b);}
	public static long max(long a, long b) {return Math.max(a,b);}
	public static int min(int a, int b) {return Math.min(a,b);}
	public static int max(int a, int b) {return Math.max(a,b);}
	public static long abs(long x, long y) {return Math.abs(x-y);}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return max(a,b);
		return GCD(max(a,b),max(a,b)%min(a,b));
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