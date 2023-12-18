import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int n=in.nextInt(); long max=-10000000;
			if(n==0)break;
			
			long data[]=new long[n],dp[]=new long[n];
			for(int i=0;i<n;i++)data[i]=in.nextLong();
			max=data[0];
			for(int i=0;i<n;i++) {
				dp[i]=Math.max(dp[i],data[i]);
				if(i>0)dp[i]=Math.max(data[i],dp[i-1]+data[i]);
				max=Math.max(max,dp[i]);
			}
			
			/*for(int i=0;i<n;i++)System.out.printf("%2d ", dp[i]);
			System.out.println();*/
			System.out.println(max);
		}
	}

}
