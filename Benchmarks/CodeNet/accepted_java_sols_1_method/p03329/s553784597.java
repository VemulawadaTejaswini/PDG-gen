import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();

      	int[] six = new int[10];
      	int[] nine = new int[10];

      	six[0] = 6;
      	nine[0] = 9;
      	for(int i = 1 ; i < 10 ; i++){
      		six[i] = six[i-1]*6;
      		nine[i] = nine[i-1]*9;
      	}

      	int[] dp = new int[n+1];
      	int INIT = (int)1e8;
      	for(int i = 1 ; i <= n ; i++){
      		dp[i] = INIT;
      	}
      	for(int i = 0 ; i < n ; i++){
      		dp[i+1] = Math.min(dp[i]+1, dp[i+1]);
      		for(int k = 0 ; i + six[k] <= n ; k++){
      			dp[i+six[k]] = Math.min(dp[i]+1, dp[i+six[k]]);
      		}
      		for(int k = 0 ; i + nine[k] <= n ; k++){
      			dp[i+nine[k]] = Math.min(dp[i]+1, dp[i+nine[k]]);
      		}
      	}

      	System.out.println(dp[n]);
    }
}