import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] hight=new int[n];
		for (int i=0;i<n;i++) hight[i]=sc.nextInt();
		int[] dp=new int[n];
		for (int i=1;i<n;i++) {
			int tmp=Integer.MAX_VALUE;
			for (int j=1;j<=k;j++) {
				if (i-j>=0) tmp=Math.min(tmp, dp[i-j]+Math.abs(hight[i]-hight[i-j]));
			}
			dp[i]=tmp;
		}
		System.out.println(dp[n-1]);
	}
}