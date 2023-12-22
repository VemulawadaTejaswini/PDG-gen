import java.util.*; 
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br;  
    static PrintWriter out;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        
        int N = nextInt();
        
        String S= ("" + N);
        String s = S.substring(S.length()-1);

        if(s.equals("3")){
            System.out.println("bon");
        } 
        else if(s.equals("0")||s.equals("1")|s.equals("6")||s.equals("8")){
            System.out.println("pon");
        } 
        else{
            System.out.println("hon");
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