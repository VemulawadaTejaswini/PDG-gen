import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0;i < n;i++) h[i] = sc.nextInt();
        long[] memo = new long[n];
        for(int i = 0;i < n;i++) memo[i] = -1;
        System.out.println(dp(n, h, n - 1, memo));
    }

    private static long dp(int n, int[] h, int i, long[] memo) {
        if(memo[i] != -1) return memo[i];
        else {
            long cost1;
            long cost2;
            if(i == 0) {
                cost1 = 0;
                cost2 = 0;
            }
            else if(i == 1) {
                cost1 = dp(n, h, i - 1, memo) + Math.abs(h[i] - h[i - 1]);
                cost2 = Long.MAX_VALUE;
            }
            else {
                cost1 = dp(n, h, i - 1, memo) + Math.abs(h[i] - h[i - 1]);
                cost2 = dp(n, h, i - 2, memo) + Math.abs(h[i] - h[i - 2]);  
            }
            long result = Long.min(cost1, cost2);
            memo[i] = result;
            return result;
        }
    }

}
