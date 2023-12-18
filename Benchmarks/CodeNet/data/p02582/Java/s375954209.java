import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        char[] a = sc.nextLine().toCharArray();
        int c = 0;
        if (a[0] == 'S' && a[1] == 'S' && a[2] == 'S')
            c = 0;
        else if (a[0] == 'S' && a[1] == 'S' && a[2] == 'R')
            c = 1;
        else if (a[0] == 'S' && a[1] == 'R' && a[2] == 'S')
            c = 1;
        else if (a[0] == 'R' && a[1] == 'S' && a[2] == 'S')
            c = 1;
        else if (a[0] == 'S' && a[1] == 'R' && a[2] == 'R')
            c = 2;
        else if (a[0] == 'R' && a[1] == 'R' && a[2] == 'S')
            c = 2;
        else if (a[0] == 'R' && a[1] == 'S' && a[2] == 'R')
            c = 1;
        else if (a[0] == 'R' && a[1] == 'R' && a[2] == 'R')
            c = 3;
        System.out.println(c);
    }

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
}