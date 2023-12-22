import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int count=0;
		for(;;){
			count++;
			int W = sc.nextInt();
			if(W==0) break;
			int N = sc.nextInt();
			int[] value = new int[N];
			int[] weight = new int[N];
			int[][] dp= new int[N+1][W+2];
			String read;
			String[] read2;
			for(int i=0;i<N;i++){
				read = sc.next();
				read2 = read.split(",");
				value[i] = Integer.parseInt(read2[0]);
				weight[i] = Integer.parseInt(read2[1]);
			}
			for(int i=0;i<N;i++){
				for(int j=0;j<=W;j++){
					if(j<weight[i]){
						dp[i+1][j] = dp[i][j];
					}else{
						dp[i+1][j]=Math.max(dp[i][j], dp[i][j-weight[i]]+value[i]);
					}
				}
			}
			int max = dp[N][W];
			int sumWeight=0;
			for(int j=0;j<=W;j++){
				if(dp[N][j]>=max){
					sumWeight = j;
					break;
				}
			}
			System.out.println("Case "+count+":\n"+max);
			System.out.println(sumWeight);
		}
	}
}