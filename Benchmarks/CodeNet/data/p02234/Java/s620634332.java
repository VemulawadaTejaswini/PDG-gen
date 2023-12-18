
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int SENTINEL = 100000007;
    public static int MAX = 10007;
    public static int NIL = -1;

    public static int[] dp = new int[100];


    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int[][] m = new int[n][n];
        for(int i = 0; i < n; i++) m[i][i] = 0;
        for(int l = 2; l < n + 1; l++) {
            for(int i = 0; i < n - l + 1; i++) {
                int j = i + l - 1;
                m[i][j] = 10000007;
                for(int k = i; k < j; k++) {
                    m[i][j] = Math.min(m[i][j], m[i][k] + m[k + 1][j] + r[i] * c[k] * c[j]);
                }
            }
        }
        System.out.println(m[0][n - 1]);
    }

    public static int solve(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i < m + 1; i++) dp[i][0] = 0;
        for(int j = 0; j < n + 1; j++) dp[0][j] = 0;
        for(int i = 1; i < m + 1; i++) {
            for(int j = 1; j < n + 1; j++) {
                if(X.charAt(i - 1) == Y.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }
}