import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ma = sc.nextInt();
        int mb = sc.nextInt();
        int[][] a = new int[n][3];
        int amax = 0;
        int bmax = 0;
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            a[i][2] = sc.nextInt();
            amax += a[i][0];
            bmax += a[i][1];
        }
        int[][] dp = new int[amax+1][bmax+1];
        for (int i = 0; i < amax+1; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE/2);
        }
        dp[0][0] = 0;
        for (int k = 0; k < n; k++) {
            for (int i = amax; i >= 0; i--) {
                if(i - a[k][0] < 0)continue;
                for (int j = bmax; j >= 0; j--) {
                    if(j - a[k][1] < 0)continue;
                    if(dp[i-a[k][0]][j-a[k][1]] + a[k][2] < dp[i][j]) dp[i][j] = dp[i-a[k][0]][j-a[k][1]] + a[k][2];
                }
            }
        }
        int r = 1;
        int ans = Integer.MAX_VALUE;
        while(ma*r <= amax && mb*r <= bmax){
            if(dp[ma*r][mb*r] < ans) ans = dp[ma*r][mb*r];
            r++;
        }
        System.out.println(4000 < ans ? -1 : ans);
        sc.close();

    }

}
