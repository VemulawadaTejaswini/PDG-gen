import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
       MyScanner sc = new MyScanner();
       int N = sc.nextInt();
       Map<String, Long> map = new HashMap<>();
       long ans = 0;
       for (int i=0; i<N; i++) {
           char[] s = sc.next().toCharArray();
           Arrays.sort(s);
           String key = String.valueOf(s);
           if (map.get(key) != null) {
               ans += map.get(key);
               map.put(key, map.get(key) + 1);     
           }
           else {
               map.put(key, 1L);
           }
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