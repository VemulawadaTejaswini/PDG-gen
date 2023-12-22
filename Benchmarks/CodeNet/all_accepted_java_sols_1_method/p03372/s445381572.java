import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        long[][] nums = new long[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                nums[i][j] = sc.nextLong();
            }
        }
        long[][] max = new long[n + 2][4];
        long[] sum = new long[2];
        for (int i = 0; i < n; i++) {
            sum[0] += nums[i][1];
            max[i + 1][0] = Math.max(max[i][0], sum[0] - nums[i][0]);
            max[i + 1][1] = Math.max(max[i][1], sum[0] - nums[i][0] * 2);
            sum[1] += nums[n - i - 1][1];
            max[n - i][2] = Math.max(max[n - i + 1][2], sum[1] -( c - nums[n - i - 1][0]));
            max[n - i][3] = Math.max(max[n - i + 1][3], sum[1] -(c - nums[n - i - 1][0]) * 2);
        }
        long ans = 0;
        for (int i = 0; i < n + 1; i++) {
            ans = Math.max(ans, max[i][0] + max[i + 1][3]);
            ans = Math.max(ans, max[i][1] + max[i + 1][2]);
        }
        System.out.println(ans);

    }
}