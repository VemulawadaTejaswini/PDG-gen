import java.util.Scanner;

public class Main{
	public static void main(String[] args){
      	//入力読み込み
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();      
      	int cost[][] = new int[n][3];
      	for(int i = 0; i < n; i++)
          for(int j = 0; j < 3; j++)
            cost[i][j] = sc.nextInt();
      
      	//コスト初期化
      	int dp[][] = new int[n][3];
      	for(int j = 0; j < n; j++)
      		for(int i = 0; i < 3; i++)
				dp[j][i] = 0;
      	dp[0][0] = cost[0][0];
      	dp[0][1] = cost[0][1];
      	dp[0][2] = cost[0][2];
 
      
      	//コストの計算
      	for(int i = 1; i < n; i++){
          for(int j = 0; j < 3; j++){
            for(int k = 0; k < 3; k++){
              	if(j == k) continue;
            	if(dp[i][j] < cost[i][j] + dp[i-1][k])
                  dp[i][j] = cost[i][j] + dp[i-1][k];
            }
          }
        }
      
      	int max = 0;
        for(int j = 0; j < 3; j++)
          if(max < dp[n-1][j]) max = dp[n-1][j];
        System.out.println(max);
    }
}