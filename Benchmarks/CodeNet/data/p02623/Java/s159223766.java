import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextInt();
        int[] a = sc.nextIntArray(n);
        int[] b = sc.nextIntArray(m);
        long[] al = new long[n+1];
        long[] bl = new long[m+1];
        for(int i = 1; i <= n; i++){
            al[i] += al[i-1]+a[i-1];
        }
        for(int i = 1; i <= m; i++){
            bl[i] += bl[i-1]+b[i-1];
        }
        int ans = 0;
        for(int i = 0; i <= n; i++){
            if(al[i] > k){
                break;
            }
            ans = Math.max(ans,i+beamSearch(bl,k-al[i]));
        }
        System.out.println(ans);
    }
    
    public static int beamSearch(long[] arr, long k){
        int left = 0;
        int right = arr.length;
        while(right - left > 1){
            int mid = (right+left)/2;
            if(arr[mid] > k){
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
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