import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = nextInt();
        int K = nextInt();

        int cnt[] = new int[N+1];

        for(int i = 0; i<K; i++){
            int d = nextInt();
            for(int j = 0; j<d; j++){
                cnt[nextInt()] ++;
            }
        }
        
        int ans = 0;
        for(int i = 1; i<= N; i++){
            if(cnt[i]==0){
                ans++;
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