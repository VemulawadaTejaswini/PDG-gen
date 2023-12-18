import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int v=in.nextInt();
		int[] val=new int[n+5];
		int[] wei=new int[n+5];
		int[] dp=new int[v+5];
		Arrays.fill(dp,0);
		for(int i=1;i<=n;i++){
			val[i]=in.nextInt();
			wei[i]=in.nextInt();
		}
		in.close();
		for(int i=1;i<=n;i++)
			for(int j=wei[i];j<=v;j++)
				dp[j]=Math.max(dp[j],dp[j-wei[i]]+val[i]);
		System.out.println(dp[v]);
	}
}