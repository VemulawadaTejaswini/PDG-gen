import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner scn = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Solution Start
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int k = scn.nextInt();
        while (b <= a && k > 0) {
            b *= 2;
            k--;
        }
        while (c <= b && k > 0) {
            c *= 2;
            k--;
        }
        if (a < b && b < c) {
            out.println("Yes");
        } else {
            out.println("No");
        }

        //Solution end
        out.close();
    }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
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
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}
