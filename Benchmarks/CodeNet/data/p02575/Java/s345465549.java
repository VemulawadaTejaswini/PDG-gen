
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public final class Main {

    public static void main(String[] args) {
        final FastScanner fs = new FastScanner();
        final int n = fs.nextInt();
        final int w = fs.nextInt();
        final int[][] banned = new int[n][2];
        for (int i = 0; i < n; i++) {
            banned[i] = new int[] { fs.nextInt(), fs.nextInt() };
        }
        int y = 1;
        final List<Integer> res = new ArrayList<>();
        int dist = 0;
        for (int i = 0; i < n; i++) {
            if (y >= banned[i][0]) {
                if (banned[i][1] == w) {
                    res.add(-1);
                    break;
                }
                final int needed = banned[i][1] - y + 1;
                y += needed;
                dist += needed;
            }
            dist++;
            res.add(dist);
        }
        for (int i = 0; i < n; i++) {
            final int curr = i >= res.size() ? -1 : res.get(i);
            System.out.println(curr);
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    //noinspection CallToPrintStackTrace
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++) { a[i] = nextInt(); }
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
