import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0;i < n;i++) h[i] = sc.nextInt();
        long[] memo = new long[n];
        for(int i = 0;i < n;i++) memo[i] = -1;
        System.out.println(dp(n, k, h, n - 1, memo));
    }

    private static long dp(int n, int k, int[] h, int i, long[] memo) {
        if(i == 0) return 0;
        else if(memo[i] != -1) return memo[i];
        else {
            long minCost = Long.MAX_VALUE;
            for(int j = k;j > 0;j--) {
                int tmpIdx = i - j;
                long tmpCost = Long.MAX_VALUE;
                if(tmpIdx >= 0) tmpCost = dp(n, k, h, tmpIdx, memo) + Math.abs(h[i] - h[tmpIdx]);
                if(minCost > tmpCost) minCost = tmpCost;
            }

            memo[i] = minCost;
            return minCost;
        }
    }

}
