import java.util.*;
import java.io.*;
 
public class Main {
    //static long ans = 0;
    static long[] c;
    static long[][] dc;
    static int[] last;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int d = sc.nextInt();
        c = sc.nextLongArray(26);
        dc = new long[d][26];
        last = new int[26];
        int[] schedule = new int[d];
        for(int i = 0; i < d; i++){
            long maxV = -Integer.MAX_VALUE;
            int max = 0;
            for(int j = 0; j < 26; j++){
                dc[i][j] = sc.nextInt();
                if(maxV < dc[i][j]){
                    maxV = dc[i][j] + (c[j] * (i-last[j]));
                    max = j;
                }
            }
            schedule[i] = max;
            last[max] = i;
        }
        int[] top = new int[d];
        long topscore = -Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            int[] tmp1 = new int[d];
            Arrays.fill(tmp1,i);
            long tmpscore = -Integer.MAX_VALUE;
            long score = checkAns(tmp1);
            if(score > tmpscore){
                tmpscore = score;
                top = schedule.clone();
            }
            for(int j = 0; j <= 10000; j++){
                int di = (int)(Math.random()*d);
                int ci = (int)(Math.random()*26);
                tmp1[di] = ci;
                score = checkAns(tmp1);
                if(score > tmpscore){
                    tmpscore = score;
                    tmp1[di] = ci;
                }
            }
            if(topscore < tmpscore){
                topscore = tmpscore;
                top = tmp1.clone();
            }
        }
        
        printSchedule(top);
    }
    
    public static long checkAns(int[] s){
        int d = s.length;
        last = new int[26];
        long ans = 0;
        for(int i = 0; i < d; i++){
            int hold = s[i];
            last[hold] = i+1;
            ans += dc[i][hold];
            ans = calc(i+1,ans);
        }
        return ans;
    }
    
    public static long calc(int d, long ans){
        for(int i = 0; i < 26; i++){
            ans -= c[i] * (d-last[i]);
        }
        return ans;
    }
    
    public static void printSchedule(int[] schedule){
        for(int d : schedule){
            System.out.println(d+1);
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