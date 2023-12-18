import java.io.*;
import java.util.*;

public class Main {
static class cell{
	int a, b;
	public cell(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
public static void main(String[] args){

   new Thread(null, null, "Anshum Gupta", 99999999) {
        public void run() {
            try {
                solve();
            } catch(Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }.start();
}
static final long mxx = (long)(1e18+5);
static final int mxN = (int)(1e6);
static final int mxV = (int)(1e6), log = 18;
static long mod = (long)(1e9+7); //998244353;//̇
static final int INF = (int)1e9;
static boolean[][]vis;
static ArrayList<ArrayList<Integer>> adj;
static int n, m, k, q, p;
static char[]str;
static int[]a;
static char[][]arr;
static int[][]dist;
static int[]dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1}, wx = {-2, -1, 0, 1, 2}, wy = {-2, -1, 0, 1, 2};
public static void solve() throws Exception {
	   // solve the problem here
		s = new MyScanner();
   		out = new PrintWriter(new BufferedOutputStream(System.out), true);
//	   		out = new PrintWriter("output.txt");
        int tc = 1;//s.nextInt();
        while(tc-- > 0){
        	n = s.nextInt();
        	m = s.nextInt();
        	cell start = new cell(s.nextInt()-1, s.nextInt()-1);
        	cell dest = new cell(s.nextInt()-1, s.nextInt()-1);
        	dist = new int[n][m];
        	arr = new char[n][m];
        	for(int i=0; i<n; i++)Arrays.fill(dist[i], INF);
        	dist[start.a][start.b] = 0;
        	for(int i=0; i<n; i++) {
        		arr[i] = s.next().toCharArray();
        	}
        	ArrayDeque<Integer> xs = new ArrayDeque<Integer>(), ys = new ArrayDeque<Integer>();
        	xs.add(start.a);
        	ys.add(start.b);
        	while(!xs.isEmpty()) {
        		int a = xs.poll();
        		int b = ys.poll();
        		for(int k=0; k<4; k++) {
        			int x = a + dx[k];
        			int y = b + dy[k];
        			if(x < 0 || y < 0 || x >= n || y >= m || arr[x][y] == '#')continue;
        			if(dist[x][y] > dist[a][b]) {
        				xs.addFirst(x);
        				ys.addFirst(y);
        				dist[x][y] = dist[a][b];
        			}
        		}
        		for(int i=0; i<5; i++) {		
        			for(int j=0; j<5; j++) {
        				int x = a + wx[i];
        				int y = b + wy[j];
        				if(x < 0 || y < 0 || x >= n || y >= m || arr[x][y] == '#')continue;
        				if(dist[x][y] > dist[a][b] + 1) {
        					dist[x][y] = dist[a][b] + 1;
            				xs.addLast(x);
            				ys.addLast(y);
        				}
        			}
        		}
        	}
        	out.println(dist[dest.a][dest.b] == INF ? "-1" : dist[dest.a][dest.b]);
        } 
           
        out.flush();
        out.close();
}

public static PrintWriter out;
public static MyScanner s;
static class MyScanner {

    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }
    public MyScanner(String fileName) {
    	try {
			br = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }
    long nextLong() { return Long.parseLong(next()); }
    double nextDouble() { return Double.parseDouble(next()); }
    int[] nextIntArray(int n){
    	int[]a = new int[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    long[] nextlongArray(int n) {
    	long[]a = new long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    Integer[] nextIntegerArray(int n){
    	Integer[]a = new Integer[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextInt();
    	}
    	return a;
    }
    Long[] nextLongArray(int n) {
    	Long[]a = new Long[n];
    	for(int i=0; i<n; i++) {
    		a[i] = this.nextLong();
    	}
    	return a;
    }
    char[][] next2DCharArray(int n, int m){
    	char[][]arr = new char[n][m];
    	for(int i=0; i<n; i++) {
    		arr[i] = this.next().toCharArray();
    	}
    	return arr;
    }
    ArrayList<ArrayList<Integer>> readUndirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    		adj.get(v).add(u);
    	}
    	return adj;
    }
    ArrayList<ArrayList<Integer>> readDirectedUnweightedGraph(int n, int m) {
    	ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
    	for(int i=0; i<=n; i++)adj.add(new ArrayList<Integer>());
    	for(int i=0; i<m; i++) {
    		int u = s.nextInt();
    		int v = s.nextInt();
    		adj.get(u).add(v);
    	}
    	return adj;
    }
    String nextLine(){
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

 
}
