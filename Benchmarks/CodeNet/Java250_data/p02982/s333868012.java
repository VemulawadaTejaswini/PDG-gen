import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<Integer> square = new ArrayList<>();
        for(int i = 0; i < 1000; i++) {
            square.add(i * i);
        }
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int[][] pts = new int[N][D];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < D; j++) {
                pts[i][j] = scanner.nextInt();
            }
        }
        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                int tot = 0;
                for(int k = 0; k < D; k++) {
                    tot += (pts[i][k] - pts[j][k])*(pts[i][k] - pts[j][k]);
                }
                if (square.contains(tot)) ans++;
            }
        }
        out.println(ans);
        
        out.flush();
    }
    
    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }
        
        public FastScanner() {
            this(new InputStreamReader(System.in));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        
        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }
    }
}
