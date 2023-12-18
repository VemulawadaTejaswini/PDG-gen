import java.util.*;
class Main {
    public static final int MAX = 1000000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int dp[] = new int[n];
        Arrays.fill(dp, MAX);
        dp[n - 1] = 0;
        for(int i = n - 2; i >= 0; i--) {
            for(int j = 1; j <= k; j++) {
                if(i + j < n) {
                    dp[i] = Math.min(dp[i], dp[i + j] + Math.abs(ar[i + j] - ar[i]));
                }
            }
        }
        System.out.println(dp[0]);
    }
}
