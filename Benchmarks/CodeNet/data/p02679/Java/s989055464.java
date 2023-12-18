import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = nextInt();
    
        int DP[] = new int [N+1];
        int Sum[] = new int [N+1];

        long Input[][] = new long [2][N+1];
        int mod = 1000000007;
        for (int x=1; x<=N; x++) {
            Input[0][x] = nextLong() % mod;
            Input[1][x] = nextLong() % mod;
        }

        DP[1] = 1;
        Sum[1] = 1;

        for (int x=2; x<=N; x++) {
            DP[x] = 1; // always add myself 
            for (int y=1; y<x; y++) {
                long check = Input[0][x] * Input[0][y] + Input[1][x]* Input[1][y];
                if(check!=0){
                    DP[x] += DP[y];
                } 
            }
            Sum[x] = Sum[x-1] + DP[x];             
        }
         

        
        System.out.println(Sum[N]);

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