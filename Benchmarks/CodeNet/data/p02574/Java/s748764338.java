import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter __out = new PrintWriter(new OutputStreamWriter(System.out));
    final static int MAX = 1_000_000+10;

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int N = fs.nextInt();
        int [] a = fs.readArray(N);

        int cur = 0;
        for (int i : a) {
            cur = gcd(cur, i);
        }
        if (cur > 1) {
            System.out.println("not coprime");
            return;
        }
        int m = 0;
        int []c = new int[MAX];
        Arrays.fill(c,0);
        for (int i = 0; i < N; i++) {
            m = Math.max(m, a[i]);
            c[a[i]]++;
        }
        boolean []prime = new boolean[m+1];
        Arrays.fill(prime, true);
        for (int i = 2; i * i <= m; i++) {
            if (prime[i]) {
                int cnt = 0;
                for (int j = i; j <= m; j += i) {
                    prime[j] = false;
                    cnt += c[j];
                    if (cnt > 1) {
                        System.out.println("setwise coprime");
                        return;
                    }
                }
            }
        }
        System.out.println("pairwise coprime");

        }

    static int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b);}
    static final Random random = new Random();

    static void ruffleSort(int[] a) {
        int n = a.length;//shuffle, then sort
        for (int i = 0; i < n; i++) {
            int oi = random.nextInt(n), temp = a[oi];
            a[oi] = a[i];
            a[i] = temp;
        }
        Arrays.sort(a);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }


}