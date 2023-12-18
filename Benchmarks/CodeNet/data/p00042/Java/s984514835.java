import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main {

    public static void main(String[] args) throws IOException {
        doit(args, System.in, System.out);
    }

    static void doit(String[] args, InputStream in, PrintStream out)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int caseNumber = 0;
        while (true) {
            int w = Integer.parseInt(reader.readLine());
            if (w == 0) {
                break;
            }

            caseNumber++;
            int n = Integer.parseInt(reader.readLine());
            int[][] priceWeightPairs = new int[n][2];
            for (int i = 0; i < n; i++) {
                String[] values = reader.readLine().split(",");
                priceWeightPairs[i] = new int[] { Integer.parseInt(values[0]),
                        Integer.parseInt(values[1]) };
            }

            int[][][] dp = new int[n + 1][w + 1][2];
            for (int i = 0; i < n; i++) {
                int[] priceWeightPair = priceWeightPairs[i];
                for (int j = 0; j <= w; j++) {
                    int[] curr = dp[i][j];
                    int[] next = dp[i + 1][j];
                    if (j >= priceWeightPair[1]) {
                        int[] left = dp[i][j - priceWeightPair[1]];
                        int price = left[0] + priceWeightPair[0];
                        int weight = left[1] + priceWeightPair[1];
                        if (price > curr[0]
                                || (price == curr[0] && weight < curr[1])) {
                            next[0] = price;
                            next[1] = weight;
                            continue;
                        }
                    }
                    next[0] = curr[0];
                    next[1] = curr[1];
                }
            }

            out.println("Case " + caseNumber + ":");
            out.println(dp[n][w][0]);
            out.println(dp[n][w][1]);
        }
    }
}