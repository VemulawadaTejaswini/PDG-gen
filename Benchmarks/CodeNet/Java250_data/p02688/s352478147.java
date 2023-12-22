import java.io.*;
import java.util.*;
public class Main {
	static PrintWriter pw;
	static boolean[][] visit;
	static char[][] adj;
//	static void dfs(int i, long c) {
//		visit[i]=true;
//		max=Math.max(c, max);
//		for(Pair p: adj[i]) {
//			if(!visit[p.x-1]) {
//				dfs(p.x-1, c+1l*p.y);
//			}
//		}
//	}
//	static Queue<Integer> q;
//	static void bfs(int i) {
//		visit[i].x=true;
//		visit[i].n=0;
//		q.add(i);
//		while(!q.isEmpty()){
//			int u = q.poll();
//			for(int v : adj[u]){
//				if(!visit[v].x){
//					q.add(v);
//					visit[v].x = true;
//					visit[v].n=visit[u].n+1;
//				}
//			}
//		}
//	}
//	static void tpsort(int i) {
//		visit[i]=true;
//		for(int x: adj[i]) {
//			if(!visit[x-1]) {
//				tpsort(x-1);
//			}
//		}
//		sticks.add(i+1);
//	}
	static int max;
	static int[] dx= {1,-1,0,0};
	static int[] dy= {0,0,1,-1};
	static boolean valid(int i, int j) {
		return i<adj.length && i>=0 && j<adj.length && j>=0;
	}
	static void dfs(int i, int j) {
		visit[i][j]=true;
		max++;
		for(int k=0; k<4; k++) {
			if(valid(i+dx[k],j+dy[k]) && !visit[i+dx[k]][j+dy[k]] && (adj[i+dx[k]][j+dy[k]]=='x' || adj[i+dx[k]][j+dy[k]]=='@')) {
				dfs(i+dx[k],j+dy[k]);
			}
		}
	}
	public static boolean contain(String s) {
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i)==' ')
				return true;
		return false;
	}
	public static double dist(Pair a, Pair b) {
		return Math.sqrt((a.x-b.x)*(a.x-b.x)+ (a.y-b.y)*(a.y-b.y));
	}
	public static boolean sign(int x) {
		return x>0;
	}
	static long ceildiv(long x,long y) {
		return x%y==0? x/y: x/y+1;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		pw = new PrintWriter(System.out);
		int n=sc.nextInt(),k=sc.nextInt();
		boolean[] arr=new boolean[n];
		while(k-->0) {
			int d=sc.nextInt();
			while(d-->0) {
				arr[sc.nextInt()-1]=true;
			}
		}
		int ans=0;
		for(int i=0; i<n; i++) {
			if(!arr[i])
				ans++;
		}
		pw.println(ans);
		pw.close();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br; 
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
 
		public Scanner(FileReader r) {
			br = new BufferedReader(r);
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public int[] nextArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = nextInt();
			return arr;
		}
		public Integer[] nextsort(int n) throws IOException{
			Integer[] arr=new Integer[n];
			for(int i=0; i<n; i++) 
				arr[i]=nextInt();
			return arr;
		}
		public boolean ready() throws IOException {
			return br.ready();
		}
	}
	static class Pair implements Comparable<Pair>{
		int x;
		int y;
		public Pair(int a, int b) {
			this.x=a;
			this.y=b;
		}
		public int compareTo(Pair other) {
			return this.x-other.x;
		}
	}
	static class visit{
		boolean x;
		int n;
		public visit(){
			this.x=false;
			this.n=-1;
		}
		public int compareTo(visit other) {
			return this.n-other.n;
		}
	}
	static class Tuple implements Comparable<Tuple>{
		int x;
		int y;
		boolean d;
		public Tuple(int a, int b, boolean t) {
			this.x=a;
			this.y=b;
			this.d=t;
		}
		public int compareTo(Tuple other) {
			if(this.d && !other.d) {
				return 1;
			}else if(!this.d && other.d) {
				return -1;
			}else {
				return this.y-other.y;
			}
		}
	}
}