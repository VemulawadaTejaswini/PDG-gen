import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int [] a = new int[n];
        Set<Integer> set = new HashSet<>();
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (set.contains(a[i])) {
                if (a[i] > 1) ok = false;
            }
            set.add(a[i]);
        }
        long gcd = 0;
        for (int i = 0; i < n; i++) gcd = gcd(gcd, a[i]);
        int [] prime = new int[1000003];
        prime[1] = 1;
        for (int i = 2; i <= Math.sqrt(1000004); i++) {
            if (prime[i] > 0) continue;
            int ct = 0;
            if (set.contains(i)) ct++;
            for (int j = 2 * i; j < prime.length; j += i) {
                if (set.contains(j)) ct++;
                prime[j] = 0;
            }
            if (ct >= 2) ok = false;
        }
        if (ok) {
            out.println("pairwise coprime");
        } else if (!ok && gcd == 1) {
            out.println("setwise coprime");
        } else {
            out.println("not coprime");
        }
        out.close();
    }

    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
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