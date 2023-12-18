
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int[] dp = new int[3];
    static int[] vac = new int[3];
    public static void main(String[] args) {
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 0;
        while (sc.hasNext()){
            vac[0] = sc.nextInt();
            vac[1] = sc.nextInt();
            vac[2] = sc.nextInt();
            int tempA = Math.max(dp[1] + vac[1], dp[2] + vac[2]);
            int tempB = Math.max(dp[0] + vac[0], dp[2] + vac[2]);
            int tempC = Math.max(dp[1] + vac[1], dp[0] + vac[0]);
            dp[0] = tempA;
            dp[1] = tempB;
            dp[2] = tempC;
        }
        System.out.println(Math.max(Math.max(dp[0], dp[1]), dp[2]));

    }
}
