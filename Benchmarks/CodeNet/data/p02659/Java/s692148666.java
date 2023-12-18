import java.util.*; 
import java.io.*;


//this is 10 base convert to 26 base question
// 
public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        long A = nextLong();
        Double B = nextDouble();
    
        Double tmp = (double)(A) * B;
      
        long ans = tmp.longValue();
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