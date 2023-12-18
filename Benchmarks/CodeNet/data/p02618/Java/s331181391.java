import java.util.*;
import java.io.*;
 
public class Main {
    static long[] c;
    static long[][] dc;
    //static int[] last;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int d = sc.nextInt();
        c = sc.nextLongArray(26);
        dc = new long[d][26];
        int[] schedule = new int[d];
        for(int i = 0; i < d; i++){
            long maxV = -Integer.MAX_VALUE;
            int max = 1;
            for(int j = 0; j < 26; j++){
                dc[i][j] = sc.nextLong();
                if(maxV < dc[i][j]){
                    maxV = dc[i][j];
                    max = j+1;
                }
            }
            schedule[i] = max;
        }
        printSchedule(schedule);
    }
    
    public static void printSchedule(int[] schedule){
        for(int d : schedule){
            System.out.println(d);
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