import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        int[] dp = new int[n];
        for(int i = 1; i <= n - 1; i++) {
            if(s.substring(i - 1, i + 1).equals("AC")) {
                dp[i] = dp[i - 1] + 1;
            }else {
                dp[i] = dp[i - 1];
            }
        }

        for(int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(dp[r - 1] - dp[l - 1]);
        }

        sc.close();
    }
}