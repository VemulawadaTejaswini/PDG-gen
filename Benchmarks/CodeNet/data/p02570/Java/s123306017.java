
// import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static List<Integer> al = new ArrayList<>();
    static int[] a;

    static class FastReader {
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

    static Set<String> se = new HashSet<>();

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        StringBuffer sb = new StringBuffer();
        // ArrayList<Integer> al=new ArrayList<>();

       int d=sc.nextInt();
       int t=sc.nextInt();
       int s=sc.nextInt();
       float k=((float)d/(float)s);
      

       if((k)<=(float)t)
       System.out.println("Yes");
       else
       System.out.println("No");

     
    }


}