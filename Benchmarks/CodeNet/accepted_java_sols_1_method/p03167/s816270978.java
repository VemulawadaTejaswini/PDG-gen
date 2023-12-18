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
		int i,j,H,W;
		H=sc.nextInt();
		W=sc.nextInt();
		char [][]arr=new char[H][W];
		for (i=0;i<H;i++) {
			String str=sc.next();
			arr[i]=str.toCharArray();
		}
		int [][]dp=new int[H][W];
		boolean b=true;
		for(i=0;i<W;i++) {
			if(arr[0][i]=='#')
				b=false;
			if(b)
				dp[0][i]=1;
			else
				dp[0][i]=0;
		}
		b=true;
		for(i=0;i<H;i++) {
			if(arr[i][0]=='#')
				b=false;
			if(b)
				dp[i][0]=1;
			else
				dp[i][0]=0;
		}
		for (i=1;i<H;i++) {
			for (j=1;j<W;j++) {
				if(arr[i][j]=='#')
					dp[i][j]=0;
				else 
					dp[i][j]=(dp[i-1][j]+dp[i][j-1])%1000000007;
			}
		}
//		for (i=0;i<H;i++) {
//			for (j=0;j<W;j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(dp[H-1][W-1]);
		sc.close();
	}

}
