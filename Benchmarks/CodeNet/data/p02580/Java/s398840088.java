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
static boolean[][]vis;
static ArrayList<ArrayList<Integer>> adj1;
static ArrayList<HashSet<Integer>> adj2;
static int n, m, k, q, p, h, w;
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
        	h = s.nextInt();
        	w = s.nextInt();
        	m = s.nextInt();
        	cell[]bombs = new cell[m];
        	adj1 = new ArrayList<ArrayList<Integer>>();
        	adj2 = new ArrayList<HashSet<Integer>>();
        	for(int i=0; i<h; i++)adj1.add(new ArrayList<Integer>());
        	for(int i=0; i<w; i++)adj2.add(new HashSet<Integer>());
        	HashSet<cell> hs = new HashSet<Main.cell>();
        	HashSet<Integer> maximumCols = new HashSet<Integer>();
        	for(int i=0; i<m; i++) {
        		bombs[i] = new cell(s.nextInt()-1, s.nextInt()-1);
        		adj1.get(bombs[i].a).add(bombs[i].b);
        		adj2.get(bombs[i].b).add(bombs[i].a);
        		hs.add(bombs[i]);
        	}
        	int[]colsum = new int[w], rowsum = new int[h];
        	for(int i=0; i<m; i++) {
        		colsum[bombs[i].b]++;
        		rowsum[bombs[i].a]++;
        	}
        	Pair[]rows = new Pair[h], cols = new Pair[w];
        	for(int i=0; i<h; i++) {
        		rows[i] = new Pair(rowsum[i], i);
        	}
        	for(int i=0; i<w; i++) {
        		cols[i] = new Pair(colsum[i], i);
        	}
        	Arrays.parallelSort(cols);
        	int val = cols[0].val;
        	int st = 0;
        	while(st < w && cols[st].val == val) {
        		maximumCols.add(cols[st++].ind);
        	}
        	int ans = 0;
//        	out.println(Arrays.toString(colsum));
//        	out.println(maximumCols);
        	for(int i=0; i<h; i++) {
        		boolean poss = isThereYInMaxColsSuchThatNoBombAtIY(i, maximumCols);
        		ans = Math.max(ans, rowsum[i] + cols[0].val + (poss ? 0 : -1) );
        	}
        	out.println(ans);
        } 
           
        out.flush();
        out.close();
}

private static boolean isThereYInMaxColsSuchThatNoBombAtIY(int i, HashSet<Integer> maximumCols) {
	for(Integer x : maximumCols) {
		if(!adj2.get(x).contains(i))return true;
	}
	return false;
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
