import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            int n = sc.nextInt();
            if(n == 0) break;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[][] dp = new int[n][n];
            for (int i = 1; i < n; i++) {
                for (int j = 0; j+i < n; j++) {
                    if(Math.abs(a[j] - a[j+i]) <= 1){
                        if(i == 1 || dp[j+1][j+i-1] == i-1 ) dp[j][j+i] = i+1;
                    }
                    for (int k = 0; k < i; k++) {
                        if(dp[j][j+i] < dp[j][j+k] + dp[j+k+1][j+i])
                            dp[j][j+i] = dp[j][j+k] + dp[j+k+1][j+i];
                    }
                }
            }
            sb.append(dp[0][n-1] + "\n");
        }
        System.out.print(sb.toString());
        sc.close();

    }

}

