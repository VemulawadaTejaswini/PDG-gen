import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int Q = scan.nextInt();
        String S = scan.next();
        int[][] q = new int[Q][2];
        for (int i = 0; i < Q; i++) {
            q[i][0] = scan.nextInt();
            q[i][1] = scan.nextInt();
        }
        int[] dp = new int[N+1];
        boolean found_A = false;
        char[] data = S.toCharArray();
        for (int i = 1; i <= N; i++) {
            if (data[i-1] == 'A') {
                found_A = true;
                dp[i] = dp[i-1];
                continue;
            }
            if (found_A && data[i-1] == 'C') {
                dp[i] = dp[i-1] + 1;
                found_A = false;
                continue;
            }
            found_A = false;
            dp[i] = dp[i-1];
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(dp[q[i][1]] - dp[q[i][0]]);
        }
    }
}
