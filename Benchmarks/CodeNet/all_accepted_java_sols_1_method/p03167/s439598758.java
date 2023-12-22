import java.util.*;
public class Main {
    static int mod = 1000000007;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int dp[][] = new int[n+1][m+1];
        dp[1][1] = 1;
        for(int i=1;i<=n;i++){
            char cur[] = sc.next().toCharArray();
            for(int j=1;j<=m;j++){
                if(cur[j-1] == '.'){
                    dp[i][j] = (dp[i][j]+dp[i-1][j] + dp[i][j-1])%mod;
                }else{
                    dp[i][j] = 0;
                }
            }
        }
//        for(int i[]:dp){
//            for(int j:i)
//                System.out.print(j+" ");
//            System.out.println();
//        }
        System.out.println(dp[n][m]);
    }

}

