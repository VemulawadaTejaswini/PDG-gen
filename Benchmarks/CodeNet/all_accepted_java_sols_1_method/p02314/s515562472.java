import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
	
	
	public static void main(String args[])throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] c = new int[M];
		for(int i=0;i<M;i++){
			c[i] = sc.nextInt();
		}
		int[] dp = new int[N+1];
		Arrays.fill(dp, 100000);
		dp[0] = 0;
		for(int i=1;i<=N;i++){
			for(int j=0;j<M;j++){
				if(i-c[j]>=0){
					dp[i] = Math.min(dp[i], dp[i-c[j]]+1);
				}
			}
		}
		System.out.println(dp[N]);
		
		
	}
	
	
}

