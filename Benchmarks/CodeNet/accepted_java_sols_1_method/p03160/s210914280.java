import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N + 1];
    for (int i = 1; i <= N; i++) A[i] = sc.nextInt();
    int[] dp = new int[N + 1];
    dp[2] = Math.abs(A[1] - A[2]);
    for (int i = 3; i <= N; i++) {
    	dp[i] = Math.min(dp[i - 1] + Math.abs(A[i] - A[i - 1]), dp[i - 2] + Math.abs(A[i] - A[i - 2]));
    }
    System.out.println(dp[N]);
  }
}