import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] nums=new int[n][3];
        int[][] dp=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        dp[0][0]=nums[0][0];
        dp[0][1]=nums[0][1];
        dp[0][2]=nums[0][2];
        for(int i=1;i<n;i++){
            dp[i][0]=Math.max(dp[i-1][1],dp[i-1][2])+nums[i][0];
            dp[i][1]=Math.max(dp[i-1][0],dp[i-1][2])+nums[i][1];
            dp[i][2]=Math.max(dp[i-1][0],dp[i-1][1])+nums[i][2];
        }
        System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
    }
}