import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    static int matrixChainMultiplication(int n, int[] p) {
        int[][] m = new int[n + 1][n + 1];

        for (int l = 2; l <= n; l++) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j - 1; k++) {
                    m[i][j] = Math.min(m[i][j], m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j]);
                }
            }
        }

//        for (int i = 0; i <= n; i++) {
//            System.out.println(Arrays.toString(m[i]));
//        }

        return m[1][n];
    }

    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter out = new PrintWriter(System.out)) {

            int n = Integer.parseInt(in.readLine());
            int[] p = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                String[] line = in.readLine().split(" ");
                p[i - 1] = Integer.parseInt(line[0]);
                p[i] = Integer.parseInt(line[1]);
            }

            out.println(matrixChainMultiplication(n, p));
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

