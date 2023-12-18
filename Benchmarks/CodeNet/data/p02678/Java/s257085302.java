import java.io.*;
import java.math.*;
import java.util.*;


public class Main{
    static long MOD = 998244353L;
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
           int n = sc.nextInt(), m = sc.nextInt();
           ArrayList <Integer> graph[] = new ArrayList[n + 1];
           int [] parent = new int[n + 1];
           Arrays.fill(parent, -1);
           for(int i = 1; i <= n; i++)
               graph[i] = new ArrayList<>();
           for(int i = 0; i < m; i++)
           {
               int e1 = sc.nextInt(), e2 = sc.nextInt();
               graph[e1].add(e2);
               graph[e2].add(e1);
           }
           Queue <Integer> q = new LinkedList<>();
           q.offer(1);
           while(!q.isEmpty())
           {
               int cur = q.poll();
               for(int neigh : graph[cur])
               {
                   if(parent[neigh] != -1) continue;
                   parent[neigh] = cur;
                   q.add(neigh);
               }
           }
           boolean valid = true;
           for(int i = 2; i <= n; i++)
               if(parent[i] == -1)
               {
                   valid = false;
                   break;
               }
           if(!valid) out.println("No");
           else {
               out.println("Yes");
               for(int i = 2; i <= n; i++)
                   out.println(parent[i]);
           }
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