import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] happy = new int[n][3];
        for (int i = 0; i < n; i++) {
            happy[i][0] = sc.nextInt();
            happy[i][1] = sc.nextInt();
            happy[i][2] = sc.nextInt();
        }

        int[][] dp = new int[n][3];
        for(int i=0; i<3; i++){
            dp[0][i] = happy[0][i];
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<3; j++){
                dp[i][j] = happy[i][j]
                        + Math.max(dp[i-1][(j+1)%3], dp[i-1][(j+2)%3]);
            }
        }

        int result = 0;
        for(int i : dp[n-1]){
            if(i>result) result = i;
        }
        System.out.println(result);
    }
}