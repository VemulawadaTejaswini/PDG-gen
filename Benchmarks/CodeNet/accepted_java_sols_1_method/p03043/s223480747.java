import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int first = 0;
        if (n >= k) {
            first = n - k + 1;
        }
        long dp[] = new long[300000];
        for (int i = 0; i < 300000; i++) {
            dp[i] = 1;
        }
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = i;
            int cnt = 1;
            while (tmp < k) {
                tmp *= 2;
                cnt *= 2;
            }
            ans += 1 / (1.0 * cnt);
        }
        System.out.println(ans / n);

        sc.close();
    }
}