import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = -10000000000007L;
    //static final long MOD = 998244353L;
    static final int INF = 50000000;
    static final int NINF = -500000000;
    
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        int K = sc.ni();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++)
        	nums[i] = sc.ni();
        SegmentTree st = new SegmentTree(300001);
        for (int i = 0; i < N; i++) {
        	int L = Math.max(0,nums[i]-K);
        	int R = Math.min(300000,nums[i]+K);
        	long ans = st.query(L, R)+1;
        	if (st.arr[nums[i]] < ans)
        		st.update(nums[i], ans);
        }
        pw.println(st.query(0, 300000));
        
        pw.close();
    }
    
    static class SegmentTree {
    	public long[] tree;
    	public long[] arr;
    	public long NONE;
    	public int N;

    	//Zero initialization
    	public SegmentTree(int n) {
    		N = n;
    		tree = new long[2*N+1];
    		arr = new long[N];
    		NONE = 0L; //set this manually (Long.MIN_VALUE for max-st, Long.MAX_VALUE for min-st, 0 for sum,xor-st, etc.)
    	}

    	public long merge(long a, long b) {
    		return Math.max(a, b); //set this manually
    	}

    	public long query(int i, int j) {
    		return query(0,0,N-1,i,j);
    	}

    	public void update(int i, long val) {
    		arr[i] = val;
    		update(0,0,N-1,i,val);
    	}

    	private long query(int t, int lo, int hi, int i, int j) {
    		// query for arr[i..j]
    		if (lo > j || hi < i)
    			return NONE;
    		if (i <= lo && j >= hi)
    			return tree[t];

    		int mid = (lo+hi)/2;
    		if (i > mid)
    			return query(t+2*(mid-lo+1),mid+1,hi,i,j);
    		else if (j <= mid)
    			return query(t+1,lo,mid,i,j);

    		// merge query results
    		return merge(query(t+1, lo, mid, i, mid), query(t+2*(mid-lo+1),mid+1,hi,mid+1,j));
    	}

    	private void update(int t, int lo, int hi, int i, long val) {
    		if (lo == hi) {
    			tree[t] = val;
    			return;
    		}

    		int mid = (lo+hi)/2;
    		if (i > mid)
    			update(t+2*(mid-lo+1),mid+1,hi,i,val);
    		else if (i <= mid)
    			update(t+1,lo,mid,i,val);

    		// merge updates
    		tree[t] = merge(tree[t+1],tree[t+2*(mid-lo+1)]);
    	}
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
 
        int ni() {
            return Integer.parseInt(next());
        }
 
        long nl() {
            return Long.parseLong(next());
        }
 
        double nd() {
            return Double.parseDouble(next());
        }
 
        String nextLine() {
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