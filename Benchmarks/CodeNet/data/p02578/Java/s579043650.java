import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));

       int n = fs.nextInt();
       int[] inp = new int[n];

       for(int i=0 ; i<n ; i++){
           inp[i] = fs.nextInt();
       }

       long ans = 0 ;

       for(int i=0 ; i<n ; i++){
           int max = inp[i];
           for(int j=i+1 ; j<n ; j++){
               if(inp[j]<max){
                   ans += (max-inp[j]);
               }else{
                   i = j - 1 ;
                   break;
               }
               if(j==n-1){
                   i = j;
               }
           }
       }

       out.println(ans);

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

