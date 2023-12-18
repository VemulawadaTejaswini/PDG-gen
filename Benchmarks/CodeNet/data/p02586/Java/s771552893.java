import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /**
     * Class for buffered reading int and double values
     */
    static class Reader {
        static BufferedReader reader;
        static StringTokenizer tokenizer;

        /**
         * call this method to initialize reader for InputStream
         */
        static void init(InputStream input) {
            reader = new BufferedReader(
                    new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }

        /**
         * get next word
         */
        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                //TODO add check for eof if necessary
                tokenizer = new StringTokenizer(
                        reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) throws IOException {
        Reader.init(System.in);
        int m = Reader.nextInt();
        int n = Reader.nextInt();
        int k = Reader.nextInt();
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            int r = Reader.nextInt() - 1;
            int c = Reader.nextInt() - 1;
            int v = Reader.nextInt();
            Map<Integer, Integer> orDefault = map.getOrDefault(r, new HashMap<>());
            orDefault.put(c, v);
            map.put(r, orDefault);
        }
        long[][][] dp = new long[m][n][4];
        if (map.get(0) != null && map.get(0).get(0) != null) {
            dp[0][0][1] = map.get(0).get(0);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < 4; l++) {
                    if (i + 1 < m) {
                        dp[i + 1][j][0] = Math.max(dp[i + 1][j][0], dp[i][j][l]);
                        if (map.get(i + 1) != null && map.get(i + 1).get(j) != null) {
                            dp[i + 1][j][1] = Math.max(dp[i + 1][j][1], dp[i][j][l] + map.get(i + 1).get(j));
                        }
                    }
                    if (j + 1 < n) {
                        dp[i][j + 1][l] = Math.max(dp[i][j + 1][l], dp[i][j][l]);
                        if (l != 3 && map.get(i) != null && map.get(i).get(j + 1) != null) {
                            dp[i][j + 1][l + 1] = Math.max(dp[i][j + 1][l + 1], dp[i][j][l] + map.get(i).get(j + 1));
                        }
                    }
                }
            }
        }
//        System.out.println(Arrays.deepToString(dp));
        long ans = 0;
        for (int l = 0; l < 4; l++) {
            ans = Math.max(dp[m - 1][n - 1][l], ans);
        }
        System.out.println(ans);

    }

}