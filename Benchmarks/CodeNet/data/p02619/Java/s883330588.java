import java.util.*;
import java.io.*;
 
public class Main {
    static long ans = 0;
    static int[] c;
    static int[][] dc;
    static int[] last;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int d = sc.nextInt();
        c = sc.nextIntArray(26);
        dc = new int[d][26];
        last = new int[26];
        for(int i = 0; i < d; i++){
            for(int j = 0; j < 26; j++){
                dc[i][j] = sc.nextInt();
            }
        }
        for(int i = 1; i <= d; i++){
            int hold = sc.nextInt()-1;
            last[hold] = i;
            ans += dc[i-1][hold];
            calc(i);
            System.out.println(ans);
        }
    }
    
    public static void calc(int d){
        for(int i = 0; i < 26; i++){
            ans -= c[i] * (d-last[i]);
        }
        return;
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