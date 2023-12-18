import java.io.*;
import java.util.*;


public class Main{
	static LinkedList<Integer>adjList[];
	static int INF=(int)1e9;
	static int n,par[];
	static int[] mind(int s) {
		int[]dist=new int[n];Arrays.fill(dist,INF); 
		dist[s] = 0;
		Queue<Integer> q=new LinkedList<Integer>(); q.add(s);
		
		while (!q.isEmpty()) {
			int u = q.poll();
			for (int v:adjList[u]) {
				if (dist[v] == INF) {
					par[v]=u;
					dist[v] = dist[u] + 1;
					q.add(v);
				} 
				
			}
			
		}
		return dist;
	}
	static void main() throws Exception{
		n=sc.nextInt();int m=sc.nextInt();
		adjList=new LinkedList[n];
		for(int i=0;i<n;i++)adjList[i]=new LinkedList<>();
		for(int i=0;i<m;i++) {
			int x=sc.nextInt()-1,y=sc.nextInt()-1;
			adjList[x].add(y);
			adjList[y].add(x);
		}
		par=new int[n];
		int[]dist=mind(0);
		for(int i:dist) {
			if(i==INF) {
				pw.println("No");
				return;
			}
		}
		pw.println("Yes");
		for(int i=1;i<n;i++) {
			pw.println(par[i]+1);
		}
	}
	public static void main(String[] args) throws Exception{
		pw=new PrintWriter(System.out);
		sc = new MScanner(System.in);
		int tc=1;
		while(tc-->0)main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
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
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}
