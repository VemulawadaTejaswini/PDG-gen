import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[n];
        for(int i = 1; i < n; i++){
            int now = i;
            int c = 0;
            while(now != 0){
                now %= Integer.bitCount(now);
                c++;
            }
            cnt[i] = c;
        }
        char[] c = sc.next().toCharArray();
        int bit = 0;
        for(int i = 0; i < n; i++){
            if(c[i] == '1'){
                bit++;
            }
        }
        long[] mod10 = new long[n];
        long[] mod01 = new long[n];
        long m10 = 0;
        long m01 = 0;
        for(int i = 0; i < n; i++){
            mod01[n-1-i] = rep2(2L,i,(bit+1));
            if(bit > 1){
                mod10[n-1-i] = rep2(2L,i,(bit-1));
            }
            if(c[n-1-i] == '1'){
                m10 += mod10[n-1-i];
                m01 += mod01[n-1-i];
            }
        }
        for(int i = 0; i < n; i++){
            if(c[i] == '1'){
                if(bit <= 1){
                    System.out.println(0);
                }else{
                    System.out.println(1+cnt[(int)((m10-mod10[i])%(bit-1))]);
                }
            }else{
                System.out.println(1+cnt[(int)((m01+mod01[i])%(bit+1))]);
            }
        }
    }
    
    private static long rep2(long b, long n, long mod){
        if(n == 0) return 1;
        long bn = rep2(b,n/2,mod);
        if(n % 2 == 0){
            return (bn*bn)%mod;
        }else{
            return (bn*bn)%mod*b%mod;
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
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
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
