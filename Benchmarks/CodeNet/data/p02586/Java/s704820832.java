import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int K = sc.nextInt();
        long[][] map = new long[r][c];
        long[][][] dp = new long[r+1][c+1][4];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                Arrays.fill(dp[i][j],-Long.MAX_VALUE);
            }
        }
        dp[0][0][0] = 0;
        for(int i = 0; i < K; i++){
            map[sc.nextInt()-1][sc.nextInt()-1] = sc.nextLong();
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i != 0){
                    for(int k = 0; k < 4; k++){
                        dp[i][j][0] = Math.max(dp[i][j][0],dp[i-1][j][k]);
                    }
                }
                if(j != 0){
                    for(int k = 0; k < 4; k++){
                        dp[i][j][k] = Math.max(dp[i][j][k],dp[i][j-1][k]);
                    }
                }
                for(int k = 3; k >= 0; k--){
                    if(map[i][j] == 0 || k == 3){
                        continue;
                    }else{
                        dp[i][j][k+1] = Math.max(dp[i][j][k+1],dp[i][j][k] + map[i][j]);
                    }
                }
            }
        }
        /*
        for(int k = 0; k < 4; k++){
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    pw.print(dp[i][j][k] + " ");
                }
                pw.println();
            }
            pw.println();
        }
        */
        long ans = 0;
        for(int i = 0; i < 4; i++){
            ans = Math.max(ans,dp[r-1][c-1][i]);
        }
        pw.println(ans);
        pw.flush();
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
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
