
import java.util.Arrays;
import java.util.Scanner;


public class Main{


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int mvalue=scanner.nextInt();
		int[] V=new int[n+1];
		int[] W=new int[n+1];
		
		int[][] dp=new int[n+1][mvalue+1];
		for(int i=0;i<=n;i++)
			Arrays.fill(dp[i], 0);
		//Arrays.fill(dp[0],0);
		for(int i=1;i<=n;i++){
			V[i]=scanner.nextInt();
			W[i]=scanner.nextInt();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=mvalue;j++){
				if(j>=W[i])
					dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-W[i]]+V[i]);
				else dp[i][j]=dp[i-1][j];
			}
		}
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<=mvalue;j++)
//				System.out.print(dp[i][j]+" ");
//			System.out.println();
//		}
//			
		System.out.println(dp[n][mvalue]);
		
	}

}

