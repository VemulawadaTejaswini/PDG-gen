import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int t = sc.nextInt();
        long max = rep2(10,18);
        for(int tt = 0; tt < t; tt++){
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long ans = Long.MAX_VALUE;
            for(long i = 0; i <= 60; i++){
                long tmpA = rep2(2,i);
                long tmp = Math.min(d+a*i,d*tmpA+1);
                for(long j = 0; j <= 36; j++){
                    long tmpB = tmpA*rep2(3,j);
                    long tmp2 = tmp+Math.min(b*j,d*(tmpB-tmpA));
                    for(long k = 0; k <= 26; k++){
                        long tmpC = tmpB*rep2(5,k);
                        long tmp3 = tmp2+Math.min(c*k,d*(tmpC-tmpB));
                        long pow = rep(i,j,k,Math.abs(tmpC-n));
                        if(tmpC < 0 || tmp3+pow*d < 0) break;
                        ans = Math.min(ans,tmp3+pow*d);
                        if(tmpC >= n)break;
                    }
                }
            }
            System.out.println(ans);
        }
        
    }
    
    public static long rep(long k2, long k3, long k5, long now){
        long ret = now;
        for(long i = 0; i < k2; i++){
            long a = rep2(2,i);
            for(long j = 0; j < k3; j++){
                long b = rep2(3,j);
                for(long k = 0; k < k5; k++){
                    long c = rep2(5,k);
                    ret = Math.min(ret,Math.abs(now-a*b*c));
                    if(now-a*b*c < 0) break;
                }
            }
        }
        return ret;
    }
    
    private static long rep2(long b, long n){
        if(n == 0) return 1;
        if(n == 1) return b;
        long bn = rep2(b,n/2);
        if(n % 2 == 0){
            return bn*bn;
        }else{
            return bn*bn*b;
        }
    }
}

class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
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
