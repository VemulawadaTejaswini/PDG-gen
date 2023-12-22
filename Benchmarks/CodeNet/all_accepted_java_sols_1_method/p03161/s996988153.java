import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),f[]=new int[n],dp[]=new int[n];
		Arrays.setAll(f,i->s.nextInt());
		Arrays.fill(dp,1,n,1000000000);
		for(int i=0;i<n;++i){
			for(int j=i+1,e=Math.min(n,i+k+1);j<e;++j)
				dp[j]=Math.min(
						dp[j],
						dp[i]+Math.abs(f[j]-f[i]));
		}
		System.out.println(dp[n-1]);
	}
}