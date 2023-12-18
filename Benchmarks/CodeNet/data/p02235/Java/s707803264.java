
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
        int q = sc.nextInt();
        String[] SX = new String[q];
        String[] SY = new String[q];
        for(int i = 0; i < q; i++) {
            SX[i] = sc.next();
            SY[i] = sc.next();
        }
        for(int i = 0; i < q; i++) {
            System.out.println(solve(SX[i], SY[i]));
        }
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