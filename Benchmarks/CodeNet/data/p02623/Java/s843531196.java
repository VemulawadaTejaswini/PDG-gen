import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int m = sc.nextInt(); long k = sc.nextLong();
        long [] a = new long[n];
        long []b = new long[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        for (int i = 0; i < m; i++) b[i] = sc.nextLong();
        Arrays.sort(a); Arrays.sort(b);
        int ptr1 = 0; int ptr2 = 0; long sum = 0; long ans = 0;
        while (sum <= k) {
            if (ptr1 == n && ptr2 == m) break;
            if (ptr1 == n) {
                if (sum + b[ptr2] > k) break;
                sum += b[ptr2]; ptr2++; ans++; continue;
            }
            if (ptr2 == m) {
                if (sum + a[ptr1] > k) break;
                sum += a[ptr1]; ptr1++; ans++; continue;
            }
            if (a[ptr1] <= b[ptr2]) {
                if (sum + a[ptr1] > k) break;
                sum += a[ptr1]; ptr1++; ans++;
            } else {
                if (sum + b[ptr2] > k) break;
                sum += b[ptr2]; ptr2++; ans++;
            }
        }
        out.println(ans);
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
