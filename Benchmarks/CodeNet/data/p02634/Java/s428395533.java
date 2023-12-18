import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        long mod = 998244353L;
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        combination comb = new combination(3001);
        long[][] dp = new long[3000][3000];
        dp[0][0] = 1;
        for(int i = 0; i <= c-a; i++){
            for(int j = 0; j <= d-b; j++){
                if(i == 0 && j == 0){
                    continue;
                }else if(i == 0){
                    dp[i][j] += dp[i][j-1] * b % mod;
                }else if(j == 0){
                    dp[i][j] += dp[i-1][j] * a % mod;
                }else{
                    dp[i][j] += ((dp[i][j-1] * (b+j) % mod + (dp[i-1][j] * (a+i)% mod))-(a*b)) % mod;
                }
                /*
                if(i != 0){
                    dp[i][j] += (dp[i-1][j] * (a+i)-(b+j-1)) % mod;
                }
                if(j != 0){
                    dp[i][j] += (dp[i][j-1] * (b+j)-(a+i-1)) % mod;
                }
                */
                /*
                if(i == 0 && j == 0){
                    continue;
                }else if(i == 0){
                    dp[i][j] = (dp[i][j-1] * (a+i)) % mod;
                }else if(j == 0){
                    dp[i][j] = (dp[i-1][j] * (b+j)) % mod;
                }else{
                    dp[i][j] = ((dp[i][j-1] * (a+i)) % mod + (dp[i-1][j] * (b+j)) % mod) % mod;
                }
                */
                /*
                dp[i+1][j] += (dp[i][j] * (b+j)) % mod;
                dp[i][j+1] += (dp[i][j] * (a+i)) % mod;
                */
            }
        }
        //printDp(dp,c-a,d-b);
        System.out.println(dp[c-a][d-b] % mod);
    }
    
    public static long getFact(long n, long mod){
        long ret = 1;
        for(long i = 2; i <= n; i++){
            ret *= i;
            ret %= mod;
        }
        return ret;
    }
    public static void printDp(long[][] dp, int imax, int jmax){
        for(int i = 0; i <= imax; i++){
            for(int j = 0; j <= jmax; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static long rep2(long b, long n, long mod){
        if(n == 0) return 1;
        if(n == 1) return b;
        long bn = rep2(b,n/2,mod)%mod;
        if(n % 2 == 0){
            return (long)(bn%mod*bn%mod)%mod;
        }else{
            return (long)(bn%mod*bn%mod)%mod*b%mod;
        }
    }
}

class combination {
    final static long mod = (long)Math.pow(10,9)+ 7;
    private static long[] fact, ifact;
    public combination(int n){
        fact = new long[n+1];
        ifact = new long[n+1];
        fact[0] = 1;
        long ln = n;
        for (long i = 1; i <= ln; ++i){
            int ii = (int)i;
            fact[ii] = fact[ii-1]%mod * i % mod;
        }
        ifact[n] = pow(fact[n],this.mod-2);
        for (int i = n; i >= 1; --i){
            int ii = (int)i;
            ifact[ii-1] = ifact[ii]%mod*i%mod;
        }
    }
    public static long comb(int n, int k){
        if (k < 0 || k > n) return 0;
        return fact[n] % mod * ifact[k] % mod * ifact[n-k] % mod;
    }
    public static long pow(long a,long b) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1){
                ret = (ret * tmp) % mod;
            }
            tmp = (tmp * tmp) % mod;
            b = b>>1;
        }
        return ret;
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }
    
    public void close() throws Exception{
        this.reader.close();
        return;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}