import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long x = sc.nextLong();
        long k = sc.nextLong();
        long d= sc.nextLong();

        x=Math.abs(x);
        if (k<=x/d){
            pw.println(x-(k*d));
        }
        else {
            k-=x/d;
            x= x-(x/d)*d;
            long ans=x+d;
            if (k%2==0){
                ans=Math.min(ans,x);
            }else ans=Math.min(ans,Math.abs(x-d));
            pw.println(ans);
        }
        pw.close();

    }



    static class Scanner {
        BufferedReader br;
        StringTokenizer st;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(next());
            }
            return arr;
        }

    }

}