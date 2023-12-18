import java.io.*;
import java.math.*;
import java.util.*;

class Pair{
    long n1, n2;
    public Pair(long n1, long n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }
}
public class Main{

    static long MOD = 1000000007L;
    static long [] fac;
    static int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static long lMax = 0x3f3f3f3f3f3f3f3fL;
    static int iMax = 0x3f3f3f3f;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Start writing your solution here. -------------------------------------
        //int t = sc.nextInt();
        int t = 1;
        while(t-- > 0)
        {
           int n = sc.nextInt();
           long a[] = new long[n], b[] = new long[n];
           long ans = 1L;
           long zzCnt = 0L, azCnt = 0L, bzCnt = 0L;
           HashMap <String, Pair> cnt = new HashMap();
           ArrayList <Pair> list = new ArrayList();
           for(int i = 0; i < n; i++)
           {
               a[i] = sc.nextLong();
               b[i] = sc.nextLong();
               if(a[i] == 0 && b[i] == 0) zzCnt++;
               else if(a[i] == 0) azCnt++;
               else if(b[i] == 0) bzCnt++;
               else
               {
                   long g = gcd(Math.abs(a[i]), Math.abs(b[i]));
                   a[i] /= g;
                   b[i] /= g;
                   if((a[i] > 0 && b[i] > 0) || a[i] < 0 && b[i] < 0)
                   {
                       String code = Math.abs(a[i]) + "#" + Math.abs(b[i]);
                       if(cnt.get(code) == null)
                           cnt.put(code, new Pair(1, 0));
                       else
                           cnt.get(code).n1++;
                   }
                   else
                   {
                       String code = Math.abs(b[i]) + "#" + Math.abs(a[i]);
                       if(cnt.get(code) == null)
                           cnt.put(code, new Pair(0, 1));
                       else
                           cnt.get(code).n2++;
                   }
               }
           }
           for(Pair p : cnt.values()) list.add(p);
           list.add(new Pair(azCnt, bzCnt));
           for(Pair p : list)
               ans = ans * ( (quickPOW(2L, p.n1) + quickPOW(2L, p.n2) - 1) % MOD) % MOD;
           ans = (ans + zzCnt - 1) % MOD;
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
    public static long solve(long x, long[] res){
        int n = res.length;
        long a = x / n;
        int b = (int)(x % n);
        return res[n - 1] * a + res[b];
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