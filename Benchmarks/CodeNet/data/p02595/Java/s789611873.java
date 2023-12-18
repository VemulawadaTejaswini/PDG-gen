import java.io.*;
import java.util.*;

 class Main {

    public static void main(String[] args) {
        FastReader rv = new FastReader();
        int t,q;
        t=rv.nextInt();
        int n;
        n=rv.nextInt();
        int c=0;
        for(q=0;q<t;q=q+1)
        {
            int a,b;
            a=rv.nextInt();
            b=rv.nextInt();
            double d=Math.sqrt(a*a+b*b);
            if(d<=n)
                c=c+1;
        }
        System.out.println(c);

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