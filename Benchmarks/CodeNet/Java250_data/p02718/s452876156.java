import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int n = fs.nextInt();
        int m = fs.nextInt();
        int[] inp = new int[n];
        long sum = 0 ;
        for(int i=0 ; i<n ; i++){
            inp[i]=fs.nextInt();
            sum+=inp[i];
        }
long ans = n ;
        for(int i=0 ; i<n ; i++){
            long val = 4*m*inp[i];
            if(val<sum){
               ans--; 
            }
        }
        if(ans>=m){
            out.println("Yes");
        }else{
            out.println("No");
        }








        out.close();
    }
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}
