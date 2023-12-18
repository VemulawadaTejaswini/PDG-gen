import java.util.*; 
import java.io.*;


// 
public class Main  {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = nextInt();
        // we can get total - wrong
        long total = 1;
        long wrong = 0;
        long mod = (long)1e9 + 7;
        
        long[] map8 = new long[N+1];
        long[] map9 = new long[N+1];
        map8[0] = 1; 
        map9[0] = 1;

        for (int i=1; i<=N; i++) {
            map8[i] = 8 * map8[i-1];
            map9[i] = 9 * map9[i-1];
            total *= 10;

            map8[i] %= mod;
            map9[i] %= mod;
            total %= mod;
        }
 
        long no0and9 = map8[N];
        long no9 = map9[N];
        //use venn diagram
        wrong = 2* no9 - no0and9;
        wrong %= mod;

        long ans = total-wrong;
        ans %= mod;
        if(ans<0) ans+=mod;
        System.out.println(ans);
    }

      
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}