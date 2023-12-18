import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for(int i = 0; i < n; ++i){
            digits[i] = sc.nextInt();
        }
        int dp[] = new int[n+1];
        int ans = 1;
        for(int i = n - 1; i >= 0; --i){
            dp[i] = 1;
            for(int j = i + 1; j < n; ++j){
                if(digits[i] < digits[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}