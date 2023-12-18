
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

import static java.lang.Integer.*;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] nums = new int[n][3];
        int[] dp = new int[3]; //
        for (int i = 0; i < n; i++) {
           int[] c = new int[3];
           int[] newDp = new int[3];
            for (int j = 0; j < 3; j++) {
               c[j] = scan.nextInt();
            }

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(j != k) {
                       newDp[k] = max(newDp[k], dp[j] + c[k]);
                    }
                }
            }
            dp = newDp;
        }
        System.out.println(max(dp[2], max(dp[0], dp[1])));

    }

}
