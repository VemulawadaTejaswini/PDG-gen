import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.readLine();
          	Main app = new Main();
            String[] split = br.readLine().split(" ");
            int n = split.length;
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
               A[i] = Integer.parseInt(split[i]); 
            }
            long[][] dp = new long[n + 1][n + 1];
            for (int L = n - 1; L >= 0; L--) {
                for (int R = L; R < n; R++) {
                    if (L == R) {
                        dp[L][R] = A[L];
                    } else {
                        dp[L][R] = Math.max(A[L] - dp[L + 1][R], A[R] - dp[L][R - 1]);
                    }
                }
            }
            System.out.println(dp[0][n - 1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
