import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        long n = sc.nextLong(); int x = sc.nextInt(); int m = sc.nextInt();
        if (n == 1) {
            out.println(0);
            out.close();
            return;
        } else if (n == 2) {
            if (x % 2 == 0) out.println(0);
            else out.println(n);
            out.close();
            return;
        }
        long [] c = new long[m - 2]; long cur = x;
        for (int i = 0; i < m - 2; i++) {
            c[i] = cur;
            cur = (cur * cur) % m;
        }
        //n--;
        if (n <= m - 3) {
            long res = 0;
            for (int i = 0; i < n; i++) {
                res = (res + c[i]);
            }
            out.println(res);
        } else {
            Map<Long, Integer> map = new HashMap<>();
            long a = 0; int start = -1; int end = -1;
            for (int i = 0; i <= m - 3; i++) {
                a += c[i];
                if (!map.containsKey(c[i])) map.put(c[i], i);
                else {
                    start = map.get(c[i]);
                    end = i;
                    break;
                }
            }
            if (c[m - 3] == 0) {
                out.println(a);
            } else {
                if (start == -1) {
                    start = 0; end = m - 2;
                }
                int len = end - start;
                long before = 0;
                for (int i = 0; i < start; i++) before = before + c[i];
                long times = (n - start) / len;
                long cycle = 0;
                for (int i = start; i < end; i++) cycle += c[i];
                long ret = cycle * times;
                long rem = (n - start) % len;
                for (int i = start; i < start + rem; i++) ret += c[i];
                ret += before;
                out.println(ret );
            }
        }
        out.close();
    }


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