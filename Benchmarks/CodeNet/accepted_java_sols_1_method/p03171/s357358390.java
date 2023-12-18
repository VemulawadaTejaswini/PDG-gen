import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] deque = new int[n];
        for(int i = 0 ; i < n ; i++) {
            deque[i] = scan.nextInt();
        }
        
        long[][] dp = new long[n][n];
        // We would have to get the 2d loop for getting the answer.
        for(int left = n-1 ; left >= 0 ; left--) {
            for(int right = left ; right < n ; right++) {
                if(left == right) {
                    dp[left][right] = deque[left];
                } else {
                    dp[left][right] = Math.max(deque[left] - dp[left+1][right] , deque[right]-dp[left][right-1]);
                }
            }
        }
        System.out.println(dp[0][n-1]); // last column in the first row will give the max gain for the entire range for the first player.
    }
}