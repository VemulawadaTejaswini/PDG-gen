import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            char[] x = sc.next().toCharArray();
            char[] y = sc.next().toCharArray();
            int[][] dp = new int[x.length+1][y.length+1];
            for (int j = 1; j <= x.length; j++) {
                for (int k = 1; k <= y.length; k++) {
                    if(x[j-1] == y[k-1]) dp[j][k] = dp[j-1][k-1] + 1;
                    else dp[j][k] = Math.max(dp[j-1][k], dp[j][k-1]);
                }
            }
            sb.append(dp[x.length][y.length] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}

