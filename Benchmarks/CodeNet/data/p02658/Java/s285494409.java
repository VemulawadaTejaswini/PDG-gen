import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        int n=sc.nextInt();
        BigInteger x=BigInteger.ONE;
        long a[]=new long[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextLong();
            if (a[i]==0){
                System.out.println(0);
                return;
            }
        }
        for (int i=0;i<n;i++){
            x=x.multiply(new BigInteger(a[i]+""));
            System.out.println(x);
            if (x.compareTo(new BigInteger("1000000000000000000"))>=1){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(x);
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
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
}