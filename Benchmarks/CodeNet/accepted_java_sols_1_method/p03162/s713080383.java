/**
 * 
 */
//package AtCoder;
import java.util.*;
/**
 * @author Shivansh Singh
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t,i,j,n,max=0;
		n=sc.nextInt();
		int [][]arr=new int[n][3];
		for (i=0;i<n;i++) {
			for (j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int [][]dp=new int[n][3];
		for (j=0;j<3;j++)
			dp[n-1][j]=arr[n-1][j];
		for (i=n-2;i>=0;i--) {
			for (j=2;j>=0;j--) {
				if(j==0) {
					dp[i][j]=arr[i][j]+(int)Math.max(dp[i+1][j+1],dp[i+1][j+2]);
				}
				else if(j==1) {
					dp[i][j]=arr[i][j]+(int)Math.max(dp[i+1][j+1],dp[i+1][j-1]);
				}
				else {
					dp[i][j]=arr[i][j]+(int)Math.max(dp[i+1][j-1],dp[i+1][j-2]);
				}
			}
		}
		for (j=0;j<3;j++) {
			if(dp[0][j]>max)
				max=dp[0][j];
		}
		System.out.println(max);
		sc.close();
	}

}
