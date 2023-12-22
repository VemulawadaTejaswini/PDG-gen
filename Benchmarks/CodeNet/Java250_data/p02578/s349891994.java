import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        MyScanner scn = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        // Start writing your solution here. -------------------------------------

        /*
         * int n = sc.nextInt(); // read input as integer long k = sc.nextLong(); //
         * read input as long double d = sc.nextDouble(); // read input as double String
         * str = sc.next(); // read input as String String s = sc.nextLine(); // read
         * whole line as String
         * 
         * int result = 3*n; out.println(result); // print via PrintWriter
         */

        // Stop writing your solution here. -------------------------------------

        int n = scn.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextLong();

        long[] check = new long[n];
        check[0] = arr[0];

        long stool = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= check[i - 1]) {
                check[i] = arr[i];

            } else {
                check[i] = check[i - 1];
                stool += check[i] - arr[i];
            }
        }
        out.println(stool);
        out.close();
    }

    public static PrintWriter out;

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