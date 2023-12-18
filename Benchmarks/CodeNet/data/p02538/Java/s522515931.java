import java.io.*;
import java.util.*;
 
public class Main {
    //static final long MOD = 1000000007L;
    static final long MOD = 998244353L;
    static final int INF = 50000000;
    static final int NINF = -500000000;
    
    static long[] powers;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        powers = new long[N];
        powers[N-1] = 1L;
        for (int i = N-2; i >= 0; i--)
        	powers[i] = (powers[i+1]*10)%MOD;
        int Q = sc.ni();
        int S = (int)Math.sqrt(N);
        Node[] vals = new Node[N/S+1];
        int index = 0;
        int T = 0;
        for (int i = 0; i < vals.length; i++) {
        	if (index+S-1 < N) {
        		vals[i] = new Node(index,index+S-1);
        		index += S;
        	} else {
        		vals[i] = new Node(index,N-1);
        		index = N;
        	}
        	T++;
        	if (index==N)
        		break;
        }
        for (int q = 0; q < Q; q++) {
        	int L = sc.ni()-1;
        	int R = sc.ni()-1;
        	int D = sc.ni();
        	long ans = 0;
        	for (int i = 0; i < T; i++) {
        		if (vals[i].R < L || vals[i].L > R) {
        			
        		} else if (L <= vals[i].L && vals[i].R <= R) {
        			vals[i].set(D);
        		} else {
        			//not complete overlap
        			int A = Math.max(L, vals[i].L);
        			int B = Math.min(R, vals[i].R);
        			vals[i].change(A,B,D);
        		}
        		ans += vals[i].val;
        		ans %= MOD;
        	}
        	pw.println(ans);
        }
        pw.close();
    }
    
    static class Node {
    	public int equal;
    	public int L;
    	public int R;
    	public int[] arr;
    	public long digit;
    	
    	public long val;
    	
    	public Node(int L, int R) {
    		equal = 1;
    		this.L = L;
    		this.R = R;
    		arr = new int[R-L+1];
    		for (int i = L; i <= R; i++) {
    			digit += powers[i];
    			if (digit >= MOD)
    				digit -= MOD;
    		}

    		val = digit;
    	}
    	
    	public void set(int d) {
    		equal = d;
    		val = (digit*d)%MOD;
    	}
    	
    	public void change(int A, int B, int D) {
    		if (equal >= 1) {
    			if (equal==D)return;
    			Arrays.fill(arr, equal);
    			for (int i = A; i <= B; i++) {
    				val += (10*MOD+(D-arr[i-L])*powers[i]);
    				val %= MOD;
    				arr[i-L] = D;
    			}
    			equal = 0;
    		} else {
    			for (int i = A; i <= B; i++) {
    				val += (10*MOD+(D-arr[i-L])*powers[i]);
    				val %= MOD;
    				arr[i-L] = D;
    			}
    		}
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