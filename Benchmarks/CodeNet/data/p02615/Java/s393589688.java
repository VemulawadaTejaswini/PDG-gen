import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    static final int INF = 50000000;
    static final int NINF = -50000000;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int N = sc.ni();
        long[] nums = new long[N];
        for (int i = 0; i < N; i++)
        	nums[i] = sc.nl();
        Arrays.sort(nums);
        long ans = nums[N-1];
        int X = N-2;
        for (int i = N-2; i >= 0; i--) {
        	if (X <= 2) {
        		ans += X*nums[i];
        		break;
        	} else {
        		ans += 2*nums[i];
        		X -= 2;
        	}
        }
        pw.println(ans);
        
        pw.close();
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