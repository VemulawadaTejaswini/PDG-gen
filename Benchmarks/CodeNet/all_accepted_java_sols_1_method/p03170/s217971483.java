import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int K=in.nextInt();
		boolean[] dp=new boolean[K+1];
		int[] a=new int[n];
		for (int i=0;i<n;++i)
			a[i]=in.nextInt();
		for (int i=0;i<=K;++i) {
			boolean flag=false;
			for (int j=0;j<n;++j) {
				if (a[j]>i) continue;
				if (!dp[i-a[j]]) {
					flag=true;
					break;
				}
			}
			dp[i]=flag;
		}
		if (dp[K]) System.out.println("First");
		else System.out.println("Second");
	}
}