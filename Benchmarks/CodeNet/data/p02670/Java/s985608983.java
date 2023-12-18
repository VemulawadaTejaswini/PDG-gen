import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[][] up = new int[n][n];
        int[][] left = new int[n][n];
        int[][] right = new int[n][n];
        int[][] down = new int[n][n];
        for(int i = 0; i < n; i++){
            int upi = i;
            int downi = n-1-i;
            for(int j = 0; j < n; j++){
                int lefti = j;
                int righti = n-1-j;
                up[i][j] = upi;
                down[i][j] = downi;
                left[i][j] = lefti;
                right[i][j] = righti;
                
            }
        }
        long ans = 0;
        for(int i = 0; i < n*n; i++){
            int now = sc.nextInt()-1;
            int h = now/n;
            int w = now%n;
            ans += Math.min(right[h][w],Math.min(left[h][w],Math.min(up[h][w],down[h][w])));
            for(int j = 0; j < h; j++){
                down[j][w]--;
            }
            for(int j = n-1; j > h; j--){
                up[j][w]--;
            }
            for(int j = 0; j < w; j++){
                right[h][j]--;
            }
            for(int j = n-1; j > w; j--){
                left[h][j]--;
            }
        }
        System.out.println(ans);
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
