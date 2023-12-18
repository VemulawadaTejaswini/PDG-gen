import java.util.Scanner;

public class Main {
    static int[] dp;

    private static int fibonacci(int x) {
        if(dp[x] == 0) dp[x] = fibonacci(x - 1) + fibonacci(x - 2);
        return dp[x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        System.out.println(fibonacci(n));

        sc.close();
    }
}

