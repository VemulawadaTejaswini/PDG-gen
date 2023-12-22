import java.util.*; 
import java.io.*;

public class Main{
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int K = nextInt();
        
        long sum = 0;

        for (int i=1; i<=K; i++) {
            for (int j=1; j<=K; j++) {
                for (int k=1; k<=K; k++) {
                    sum += gcd(j, gcd(i, k));
                }
            }
        }
        System.out.println(sum);
    }

    public static int gcd(int a, int b) {
        if(b==0) return a;

        return gcd(b, a%b);
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