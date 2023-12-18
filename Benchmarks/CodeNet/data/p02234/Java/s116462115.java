import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] m;
    static int[] p;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        p = new int[n+1];
        m = new int[n + 1][n + 1];
        for (int i = 0; i < n; i++) {
            String[] s = bf.readLine().split(" ");
            p[i] = Integer.parseInt(s[0]);
            p[i + 1] = Integer.parseInt(s[1]);
        }
        System.out.println(matrixChainMultiplication());
    }

    private static int matrixChainMultiplication() {
        for (int l = 2; l <= n; l++) {
            ////1~5
            for (int i = 1; i <= n-l+1; i++) {
                //1~5+2-1
                int j=i+l-1;
                m[i][j]=Integer.MAX_VALUE;
                //5~6
                for (int k = i; k < j; k++) {
                    m[i][j] = Math.min(m[i][j],m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j]);
                }
            }
        }
        return m[1][n];
    }
}
