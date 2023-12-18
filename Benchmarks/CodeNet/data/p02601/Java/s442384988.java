import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        long R = nextInt();
        long G = nextInt();
        long B = nextInt();
        
        int K = nextInt();
        
        int K_G = 0;

        if(G<=R){
            for (int i=1; i<=K; i++) {
                G = G*2;
                if(G>R){
                    K_G = i;
                    break;
                }
            }
            if(K_G==0){
                System.out.println("No");
                return;
            }
        }
        
        int K_B = 0;
   
        if(B<=G){
            for (int i=1; i<=K; i++) {
                B = B*2;
                if(B>G){
                    K_B = i;
                    break;
                }
            }
            if(K_B==0){
                System.out.println("No");
                return;
            }
        }

        if(K_G + K_B <=K){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
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
