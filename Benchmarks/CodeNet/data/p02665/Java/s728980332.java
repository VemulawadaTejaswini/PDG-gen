import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Main{

    static long MOD = 998244353L;
    static long [] fac;
    static int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static long lMax = 0x3f3f3f3f3f3f3f3fL;
    static int iMax = 0x3f3f3f3f;
    static HashMap <Long, Long> memo = new HashMap();
    static int n, m;
    static int[][] mat;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Start writing your solution here. -------------------------------------
        //int t = sc.nextInt();
        int t = 1;
        while(t-- > 0){
            boolean invalid = false;
            int n = sc.nextInt();
            long a[] = new long[n + 1];
            long b[] = new long[n + 1];
            long min[] = new long[n + 1], max[] = new long[n + 1];
            for(int i = 0; i <= n; i++)
                a[i] = sc.nextLong();
            if(n <= 60 && a[n] > 1L << n) {
                out.println(-1);
                break;
            }
            long ans = 1L;
            min[n] = max[n] = a[n];
            for(int i = n - 1; i >= 0; i--)
            {
                min[i] = (min[i + 1] + 1) / 2 + a[i];
                max[i] = max[i + 1] + a[i];
                if(i <= 60)
                {
                    if(min[i] > (1L << i))
                    {
                        ans = -1;
                        invalid = true;
                        break;
                    }
                    if(max[i] > (1L << i))
                        max[i] = 1L << i;
                }
            }
            if(!invalid) {
                b[0] = 1;
                for (int i = 1; i <= n; i++) {
                    b[i] = Math.min(max[i], 2 * (b[i - 1] - a[i - 1]));
                    ans += b[i];
                }
            }
            out.println(ans);
        }
        out.close();
    }
    public static long C(int n, int m)
    {
        if(m == 0 || m == n) return 1l;
        if(m > n || m < 0) return 0l;
        long res = fac[n] * quickPOW((fac[m] * fac[n - m]) % MOD, MOD - 2) % MOD;

        return res;
    }
    public static long quickPOW(long n, long m)
    {
        long ans = 1l;
        while(m > 0)
        {
            if(m % 2 == 1)
                ans = (ans * n) % MOD;
            n = (n * n) % MOD;
            m >>= 1;
        }
        return ans;
    }
    public static int gcd(int a, int b)
    {
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }
    public static long gcd(long a, long b)
    {
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }
    public static long solve(long cur){
        return 0L;
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
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}