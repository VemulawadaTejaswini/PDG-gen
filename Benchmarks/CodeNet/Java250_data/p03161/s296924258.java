import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int k = scanner.nextInt();
        int heights[] = new int[i];
        for (int j = 0; j < heights.length; j++) {
            heights[j] = scanner.nextInt();
        }
        long numOfWays = getNumOfWays(heights, k);
        System.out.println(numOfWays);
    }

    private static long getNumOfWays(int hei[], int k) {

        long dp[] = new long[hei.length];
        for (int i = dp.length - 2; i >= 0; i--) {
            long cost = Integer.MAX_VALUE;
            int end = Math.min(dp.length - 1, i + k);
            for (int j = i + 1; j <= end; j++) {
                cost = Math.min(Math.abs(hei[i] - hei[j]) + dp[j], cost);
            }
            dp[i] = cost;
        }
        return dp[0];
    }


}