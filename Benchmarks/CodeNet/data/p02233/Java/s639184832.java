import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n, new int[n + 1]));
    }

    private static int fib(int n, int[] dp) {
        if (dp[n] != 0) {
            return dp[n];
        }
        int r = 0;
        if (n == 0 || n == 1) {
            r = 1;
        } else {
            r = fib(n - 1, dp) + fib(n - 2, dp);
        }
        dp[n] = r;
        return r;
    }
}