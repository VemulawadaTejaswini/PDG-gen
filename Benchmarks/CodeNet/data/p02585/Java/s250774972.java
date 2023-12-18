import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static class Task {

        private static final int MOD = 998244353;

        private long gcd(long m, long n) {
            if (n == 0) {
                return m;
            }
            return gcd(n, m % n);
        }

        // 快速幂
        public int pow(long x, long n, int mod) {
            long res = 1;
            x %= mod;
            while (n > 0) {
                if ((n & 1) == 1) {
                    res = res * x % mod;
                }

                x = x * x % mod;
                n >>>= 1;
            }
            return (int) res % mod;
        }


        int[] h,to,next,wt,fa;int ct = 0;
        void init(int n ,int m){
            h = new int[n]; Arrays.fill(h,-1);
            to = new int[m*2+2];
            wt = new int[m*2+2];
            next = new int[m*2+2];
            fa = new int[n];Arrays.fill(fa,-1);
            ct = 0;
        }

        void add(int u,int v,int w){
            to[++ct] = v;
            next[ct] = h[u];
            wt[ct] = w;
            h[u] = ct;
        }


        long[][] mult(long a[][],long b[][], long mod){
            int l1 = a.length;
            int l2 = b.length;
            int l3 = b[0].length;
            long r[][] = new long[l1][l3];
            for(int i=0;i<l1;++i){
                for(int j=0;j<l2;++j){
                    for(int k=0;k<l3;++k){
                        r[i][k] = (r[i][k] + a[i][j] * b[j][k])%mod;
                    }
                }
            }
            return r;
        }

        long[][] ones(int len){
            long r[][] = new long[len][len];
            for(int i=0;i<len;++i){
                r[i][i] = 1L;
            }
            return r;
        }

        long[][] quick(long a[][], int times,long mod){
            int len = a.length;
            long ans[][] = ones(len);

            while(times>0){
                if((times&1)==1) {
                    ans = mult(ans, a, mod);
                }
                a = mult(a, a, mod);
                times >>= 1;
            }

            return ans;
        }


        public void solve(int testNumber, InputReader in, PrintWriter out) {

            int n  =in.nextInt();
            int k  =in.nextInt();
            int p[] = in.nextArray(n);
            long c[] = new long[n];
            for(int i=0;i<n;++i){
                c[i] = in.nextLong();
            }
            long r = Long.MIN_VALUE;
            for(int j=0;j<n;++j){
                int vis[] = new int[n];
                long sum[] = new long[n+1];

                long s = 0;
                int go  = 0;
                int pos = j;
                while(go<k){
                    int to = p[pos]-1;
                    if(vis[to]!=0){

                        int z = go-vis[to]+1;
                        long tot = s-sum[vis[to]]+c[to];

                        if(tot>=0) {
                            int d = (k - go) / z;

                            s += (long) d * tot;
                            go += z * d;

                            int sy = k - go;
                            pos = to;
                            r = Math.max(r, s);
                            for (int jj = 0; jj < sy; ++jj) {
                                s += c[pos];
                                r = Math.max(r, s);
                                pos = p[pos] - 1;

                            }


                            break;
                        }else{

                            long ss = s;
                            pos = to;
                            for (int jj = 0; jj < Math.min(k-go,z); ++jj) {
                                ss += c[pos];
                                r = Math.max(r, ss);
                                pos = p[pos] - 1;
                            }

                           
                            break;



                        }
                    }else{
                        s += c[to];
                        vis[to] = ++go;
                        sum[go] = s;
                        r = Math.max(r, s);
                        pos = to;
                    }
                }

            }
            out.println(r);



        }
    }

    private static void sort(double[] arr) {
        Double[] objArr = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(int[] arr) {
        Integer[] objArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void sort(long[] arr) {
        Long[] objArr = Arrays.stream(arr).boxed().toArray(Long[]::new);
        Arrays.sort(objArr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = objArr[i];
        }
    }

    private static void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task task = new Task();
        task.solve(1, in, out);
        out.close();
    }

    public static void main(String[] args) {
        new Thread(null, () -> solve(), "1", 1 << 26).start();
    }

    static class InputReader {

        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] nextArray(int n){
            int res[]  = new int[n];
            for(int i=0;i<n;++i){
                res[i] = nextInt();
            }
            return res;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

    }

}