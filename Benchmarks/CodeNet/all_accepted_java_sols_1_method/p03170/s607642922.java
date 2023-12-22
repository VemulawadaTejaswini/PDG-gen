import java.util.Scanner;

public class Main {
  public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        boolean []dp = new boolean[k + 1];

        for(int i = 0; i <= k; i++) {
            for(int j = 0; j < n; j++) {
                if(i - a[j] >= 0) {
                    dp[i] |= (!dp[i - a[j]]);
                }
            }
        }

        if(dp[k]) {
            System.out.println("First");
        }
        else {
            System.out.println("Second");
        }
    }
}