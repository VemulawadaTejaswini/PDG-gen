import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int N = sc.nextInt();
        int[] B = new int[N];

        for (int i=0; i<N-1; i++){
            B[i] = sc.nextInt();
        }
    
        int ans = B[0] + B[N-2];
        for (int i=0; i<N-1; i++){
            ans += Math.min(B[i], B[i+1]);
        }
        System.out.println(ans);

    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;
    
        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }
    
        int nextInt() {
            return Integer.parseInt(next());
        }
    
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}