import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long ans=0;
		long[] A=new long[N];
		long sum=0;
		int mod=1000000007;
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
			sum+=A[i];
          	sum%=mod;
		}
		for(int i=0;i<N;i++){
				sum+=mod;
          		sum-=A[i];
				ans+=A[i]*sum%mod;
              	ans%=mod;
		}
		System.out.println(ans);
		
		
	}
}
