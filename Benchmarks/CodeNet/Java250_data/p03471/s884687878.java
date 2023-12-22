import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n-i; j++){
                int z = n-i-j;
                int zy = y-10000*i-5000*j;
                if((z == 0 && zy == 0) || (z != 0 && zy % z == 0 && zy/z == 1000)){
                    System.out.println(i + " " + j + " " + z);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
    
    public static int beamSearch(long[] arr, long target){
        int left = 0;
        int right = arr.length;
        while(right-left > 1){
            int mid = (left+right)/2;
            if(arr[mid] > target){
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
