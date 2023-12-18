import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a=new int[100010];
		int n=sc.nextInt();
		int mm=0;
		long m=0;
		for(int i=1; i<=n; i++) {
			a[i]=sc.nextInt();
			mm=Math.max(mm, a[i]);
		}
		long[] dp= new long[mm+1];
		for(int i=1; i<=n; i++) {
			if(a[i]==0) {
				dp[a[i]]=1;
			}
			else {
			dp[a[i]]=dp[a[i]-1]+1;
			for(int j=a[i]+1; j<=mm; j++) {
				dp[j]=dp[a[i]];
			}
			}
			m=Math.max(m, dp[a[i]]);
		}
		System.out.println(m);
	}
}
