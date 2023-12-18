import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int Case = 1;
		while(true){
			int W_Bag = stdIn.nextInt();
			if(W_Bag==0){
				return;
			}
			int N_Count = stdIn.nextInt();
			int[] value = new int[N_Count+1];
			int[] weight = new int[N_Count+1];
			for(int i=1;i<=N_Count;i++){
				String[] s = stdIn.next().split(",");
				value[i] = Integer.parseInt(s[0]);
				weight[i] = Integer.parseInt(s[1]);
			}
			int[][] dp = new int[N_Count+1][W_Bag+1];
			int maxValue = 0;
			int minWeight = Integer.MAX_VALUE;
			for(int i=1;i<=N_Count;i++){
				for(int j=1;j<=W_Bag;j++){
					if(j-weight[i]>=0){
						dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]]+value[i]);
						if(maxValue<dp[i][j]){
							maxValue = dp[i][j];
							minWeight = j;
						}
						else if(maxValue==dp[i][j]){
							minWeight = Math.min(minWeight, j);
						}
					}
					else{
						dp[i][j] = dp[i-1][j];
					}
				}
			}
			System.out.println("Case "+Case+++":");
			System.out.println(maxValue);
			System.out.println(minWeight);
		}
	}
}