import java.io.*;
import java.math.*;
import java.util.*;

public class Main{

    static long MOD = 1000000007L;
    static long [] fac;
    static int[][] dir = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static long lMax = 0x3f3f3f3f3f3f3f3fL;
    static int iMax = 0x3f3f3f3f;
    static int n;
    static int[][] block;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Start writing your solution here. -------------------------------------
        //int t = sc.nextInt();
        int t = 1;
        while(t-- > 0)
        {
            n = sc.nextInt();
            int ans = 0;
            int [][] mat = new int[n][n];
            block = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++) {
                    mat[i][j] = Math.min(i, Math.min(n - i - 1, Math.min(j, n - j - 1)));
                    block[i][j] = 1;
                }

            for(int i = 0; i < n * n; i++)
            {
                int ind = sc.nextInt();
                int x = (ind - 1) / n;
                int y = (ind + n - 1) % n;
                ans += mat[x][y];
                block[x][y] = 0;
                dfs(mat, x, y);
                /*System.out.println(x + " " + y + " " + ans);
                for(int j = 0; j < n; j++)
                    System.out.println(Arrays.toString(mat[j]));*/
            }
            System.out.println(ans);
        }
        out.close();
    }
    public static void dfs(int[][] mat, int x, int y)
    {
        //System.out.println((6 * x + y + 1) + " " + mat[x][y]);
        for(int i = 0; i < 4; i++)
        {
            int dx = x + dir[i][0];
            int dy = y + dir[i][1];
            if(dx < 0 || dx >= n || dy < 0 || dy >= n || mat[dx][dy] <= mat[x][y] + block[x][y]) continue;
            mat[dx][dy]--;
            dfs(mat, dx, dy);
        }
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