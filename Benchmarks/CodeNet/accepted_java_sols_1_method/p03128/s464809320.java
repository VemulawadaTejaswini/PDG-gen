import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    // cost[数字] でコストが出る
    public static int[] cost = { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
    public static String[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] a = new Integer[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
        dp = new String[n + 1];
        Arrays.fill(dp, "");
        for (int i = 0; i < n + 1; i++) {
            int max = -1;
            String tar = "";
            int pos = -1;
            for (int j = 0; j < m; j++) {
                int point = i - cost[a[j]];
                if (point < 0)
                    continue;
                if (point != 0 && dp[point] == "") {

                } else {
                    if (max < dp[point].length() + 1) {
                        max = dp[point].length() + 1;
                        tar = String.valueOf(a[j]);
                        pos = point;
                    }
                }
            }
            if (max != -1) {
                dp[i] = tar + dp[pos];
            }
        }
        System.out.println(dp[n]);
    }

}
