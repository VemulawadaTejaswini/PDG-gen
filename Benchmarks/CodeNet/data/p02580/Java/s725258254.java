import java.io.*;
import java.util.*;

public class Main {


    private static void solve(InputReader sc, PrintWriter out) throws Exception {
       int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        Set<Pair> hs = new HashSet<>();
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i=0; i<q; i++){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            hs.add(new Pair(x, y));
            row[x]++; col[y]++;
        }
        int max=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                int cur = row[i] + col[j];
                if(hs.contains(new Pair(i, j))) cur--;
                if(cur  > max) max = cur;
            }
        }
        out.println(max);
    }

    public static Set<Integer> seive(int n) {
        boolean[] arr = new boolean[n + 1];
        Set<Integer> hs = new HashSet<>();
        Arrays.fill(arr, true);
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                for (int j = i + i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i]) hs.add(i);
        }
        return hs;
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solve(in, out);
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}

class Pair {
    int x, y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return x == pair.x &&
                y == pair.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}