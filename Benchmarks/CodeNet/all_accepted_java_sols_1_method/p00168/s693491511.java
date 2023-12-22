import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		//今いる階段までどんだけかかったかを記憶
		int dp[]=new int[31];
		dp[0]=0;dp[1]=1;dp[2]=2;dp[3]=4;
		for(int i=4;i<31;i++)
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int ans=dp[n]/3650+1;
			System.out.println(ans);
		}
	}		
}