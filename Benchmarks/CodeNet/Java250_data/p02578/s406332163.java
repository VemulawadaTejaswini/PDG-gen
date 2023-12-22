import java.util.*; 
import java.io.*;


// A1 * Sum(A2+...+An)
// +A2 * Sum(A3+...+An)
// +A3 * Sum(A4+...+An)
public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
    
    static long mod = (long)1e9 + 7;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = nextInt();
   
        long ans = 0;
        int prev =  nextInt();
        // we get PreSum
        for (int i=2; i<=N; i++) {
            int next = nextInt();
            if(next<prev){
                ans += prev-next;
            }
            else{
                prev = next;
            }
        }

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