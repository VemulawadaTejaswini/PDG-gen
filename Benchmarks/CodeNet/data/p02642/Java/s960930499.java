import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    static int parent[]; 

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = nextInt();
        
        int[] A = new int[N];

        for (int x=0; x<N; x++) {
            A[x] = nextInt();
        }

        Arrays.sort(A);

        int[] cnt = new int[A[N-1]+1];
        boolean[] dp = new boolean[A[N-1]+1];
        Arrays.fill(dp, true); //true mean not contain

        for (int x=0; x<N; x++) {
            cnt[A[x]] ++;
            if( cnt[A[x]] >1 ){
                dp[A[x]] = false;
            }
        }
 
    
        //Sieve of Eratosthenes
        for (int x=0; x<N; x++) {
            int curr = A[x];
            if(dp[curr] || cnt[curr]>1) {
                for (int z = 2; z *curr <=A[N-1]; z++) 
                {
                    dp[z * curr] = false;
                }
            }
        }

        int ans = 0;
        for (int x=0; x<N; x++) {
            if(dp[A[x]]==false){
                ans ++;
            }
        }

        System.out.println(N-ans);
        
    
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