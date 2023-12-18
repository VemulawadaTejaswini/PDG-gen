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
static class Pair implements Comparable<Pair>{
	int val, ind;
	public Pair(int val, int ind) {
		this.val = val;
		this.ind = ind;
	}
	@Override
	public int compareTo(Pair o) {
		return -Integer.compare(val, o.val);
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
static boolean[]vis;
static ArrayList<ArrayList<Integer>> adj1;
static ArrayList<HashSet<Integer>> adj2;
static int n, m, k, q, h, w, r, c;
static char[]str;
static int[][]v;
static Long[][][]dp;
static long rec(int i, int j, int curRowCount) {
	if(i >= r || j >= c || curRowCount > 3)return -mxx;
	if(i == r-1 && j == c-1) {
		if(curRowCount == 3)return 0;
		return v[i][j];
	}
	if(dp[i][j][curRowCount] != null) return dp[i][j][curRowCount];
	if(curRowCount == 3) {
		return dp[i][j][curRowCount] = rec(i+1, j, 0);
	}
	if(v[i][j] == 0) {
		return dp[i][j][curRowCount] = Math.max(rec(i+1, j, 0), rec(i, j+1, curRowCount));
	}
	long o1 = rec(i+1, j, 0) + v[i][j];
	long o2 = rec(i, j+1, curRowCount + 1) + v[i][j];
	long o3 = rec(i, j+1, curRowCount);
	return dp[i][j][curRowCount] = Math.max(o1, Math.max(o2, o3));
}

public static void solve() throws Exception {
	   // solve the problem here
		s = new MyScanner();
   		out = new PrintWriter(new BufferedOutputStream(System.out), true);
//	   		out = new PrintWriter("output.txt");
        int tc = 1;//s.nextInt();
        while(tc-- > 0){
        	r = s.nextInt(); c = s.nextInt(); k = s.nextInt();
        	v = new int[r][c];
        	for(int i=0; i<k; i++) {
        		v[s.nextInt()-1][s.nextInt()-1] = s.nextInt();
        	}
        	dp = new Long[r][c][4];
        	long ans = rec(0, 0, 0);
        	out.println(ans);
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
