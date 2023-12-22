import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();
        int[][] ab = new int[n][2];

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ab[i][0] = a;
            ab[i][1] = b;
        }

        int[] dp = new int[h+20000];

        for (int i=1; i<=h; i++){
            int idx = i+10000;
            dp[idx] = Integer.MAX_VALUE;
            for (int j=0; j<n; j++){
                dp[idx] = Math.min(dp[idx], dp[idx-ab[j][0]]+ab[j][1]);
            }
        }

        System.out.println(dp[h+10000]);

    }
}




