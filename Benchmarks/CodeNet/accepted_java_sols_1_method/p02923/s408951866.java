
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = in.nextInt();
        }

        int[] dp = new int[n];
        int max = -1;
        for (int i = n - 2; i >= 0 ; i--) {

            if (a[i] >= a[i+1]) {
                dp[i] = dp[i+1]+1;
                max = Math.max(max, dp[i]);
            } else {
                dp[i] = 0;
            }

        }
        if (max == -1) {
            System.out.println(0);
        } else {
            System.out.println(max);

        }




    }



}
