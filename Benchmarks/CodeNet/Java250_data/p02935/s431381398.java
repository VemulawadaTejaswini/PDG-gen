import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        
        int n = sc.nextInt();

        double[] v = new double[n];
        for(int i=0;i<n;i++){
            v[i] = sc.nextInt();
        }

        Arrays.sort(v);

        for(int i=0;i<n-1;i++){
            v[i+1]=(double) ((v[i]+v[i+1])/2);
        }

        System.out.println(v[n-1]);

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