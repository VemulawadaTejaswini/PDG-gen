import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datasetNum = sc.nextInt();
        sc.nextLine();

        for (int datasetidx = 0; datasetidx < datasetNum; datasetidx++) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            int NA = A.length();
            int NB = B.length();

            int[][] dp = new int[NA+1][NB+1];

            for (int i = 0; i < NA; i++) {
                for (int j = 0; j < NB; j++) {
                    if (A.charAt(i) == B.charAt(j)) {
                        dp[i+1][j+1] = dp[i][j] + 1;
                    } else {
                        dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                    }
                }
            }

            System.out.println(dp[NA][NB]);
        }
    }
}
