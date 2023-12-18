import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int X = nextInt();
        
        if(X<600) System.out.println(8);
        else if(X<800) System.out.println(7);
        else if(X<1000) System.out.println(6);
        else if(X<1200) System.out.println(5);
        else if(X<1400) System.out.println(4);
        else if(X<1600) System.out.println(3);
        else if(X<1800) System.out.println(2);
        else  System.out.println(1);

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