import java.util.Scanner;

//155
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n], dp[] = new int[n], res = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            a[i] = sc.nextInt();
            for (int j = 0; j < i;j++) {
                if (a[j] < a[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);
    }
}
