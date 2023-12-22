import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            if (n < 2) {
                System.out.println(0);
                return;
            }
            int[] dp = new int[n];
            dp[1] = Math.abs(nums[0] - nums[1]);

            for (int i = 2; i < n; i++) {
                int a = dp[i - 2] + Math.abs(nums[i] - nums[i - 2]);
                int b = dp[i - 1] + Math.abs(nums[i] - nums[i - 1]);
                dp[i] = Math.min(a, b);
            }
            System.out.println(dp[n - 1]);
        }
    }
}
