import java.util.*; 
import java.io.*;


// 
public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = nextInt();
        int K = nextInt();

        int[] input = new int[N+1];

        for (int x=1; x<=N; x++) {
            input[x] = nextInt();
        }

        for (int x=K+1; x<=N; x++) {
            if(input[x]>input[x-K]){
                System.out.println("Yes");
                
            }
            else{
                System.out.println("No");
            }
        }


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