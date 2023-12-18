import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        int[] dp = new int[h+1];
        Arrays.fill(dp, Integer.MAX_VALUE/2);
        dp[0] = 0;
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < n; j++) {
                int nex = h < a[j][0] + i ? h : a[j][0] + i;
                if(a[j][1] + dp[i] < dp[nex]) dp[nex] = a[j][1] + dp[i];
            }
        }
        System.out.println(dp[h]);
        sc.close();

    }

}
