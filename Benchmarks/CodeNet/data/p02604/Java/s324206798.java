import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        long[] x = new long[n];
        long[] y = new long[n];
        long[] p = new long[n];
        long[] minX = new long[n];
        long[] minY = new long[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            minX[i] = Math.abs(x[i]);
            minY[i] = Math.abs(y[i]);
            p[i] = sc.nextLong();
        }
        boolean[] used = new boolean[n];
        long totalP = 0;
        for(int i = 0; i < n; i++){
            totalP += p[i];
        }
        for(int j = 0; j <= n; j++){
            long ans = 0;
            for(int i = 0; i < n; i++){
                ans += Math.min(minX[i],minY[i])*p[i];
            }
            pw.println(ans);
            long min = Long.MAX_VALUE;
            int point = 0;
            for(int i = 0; i < n; i++){
                long tmp = 0;
                for(int k = 0; k < n; k++){
                    if(i == k || used[k]) continue;
                    tmp += Math.min(minX[k],Math.abs(x[i]-x[k])) * p[k];
                }
                if(tmp < min){
                    min = tmp;
                    point = i;
                }
            }
            long min2 = Long.MAX_VALUE;
            int point2 = 0;
            for(int i = 0; i < n; i++){
                long tmp = 0;
                for(int k = 0; k < n; k++){
                    if(i == k || used[k]) continue;
                    tmp += Math.min(minY[k],Math.abs(y[i]-y[k])) * p[k];
                }
                if(tmp < min2){
                    min2 = tmp;
                    point2 = i;
                }
            }
            if(min <= min2){
                for(int i = 0; i < n; i++){
                    minX[i] = Math.min(minX[i],Math.abs(x[i]-x[point]));
                }
                used[point] = true;
            }else{
                for(int i = 0; i < n; i++){
                    minY[i] = Math.min(minY[i],Math.abs(y[i]-y[point2]));
                }
                used[point2] = true;
            }
        }
        pw.flush();
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
