import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[][] dp = new int[11][10];
        Arrays.fill(dp[1], 1);
        long ans=0;
        if(k<10){
           ans = k;
        }else{
            int sum = 9;
            int dij=0 , num=0;
            OUTER:for (int i = 2; i < 11; i++) {
                dij = i;
                for (int j = 0; j < 10; j++) {
                    if(j==0){
                        dp[i][j] = dp[i-1][0] + dp[i-1][1];
                        continue;
                    }
                    num = j;
                    int pre1 = j - 1, pre2 = j +1;
                    if(-1<pre1) {dp[i][j] += dp[i-1][pre1]; sum+=dp[i-1][pre1];}
                    dp[i][j] += dp[i-1][j]; sum+= dp[i-1][j];
                    if(pre2<10){dp[i][j] += dp[i-1][pre2]; sum+=dp[i-1][pre2];}
                    if(k <= sum)break OUTER;
                }
            }
            sum -= dp[dij][num];
            int[] a = new int[dij+1];
            a[dij] = num;
            for (int i = dij-1; i > 0; i--) {
                int f = a[i+1];
                int pre1 = f - 1, pre2 = f +1;
                int t = sum;
                if(-1<pre1) {
                    t += dp[i][pre1];
                    if(k <= t){
                        a[i] = pre1; continue;
                    }
                }
                sum =t;
                t += dp[i][f];
                if(k <= t){
                    a[i] = f; continue;
                }
                sum =t;
                if(pre2<10){
                    t += dp[i][pre2];
                    if(k <= t){
                        a[i] = pre2; continue;
                    }
                }
                sum =t;
            }
            long b = 1;
            for (int i = 1; i < dij+1; i++) {
                ans += a[i] * b;
                b *= 10;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
