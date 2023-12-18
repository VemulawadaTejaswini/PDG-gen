import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		long m=1000000007;
		long psum[]=new long[n];
		psum[n-1]=arr[n-1];
		long sum=0;
		for(int i=n-2;i>=0;i--) {
			psum[i]=(psum[i+1]%m+arr[i]%m)%m;
		}
		long ans=0;
		for(int i=0;i<n-1;i++) {
			long product=((arr[i]%m)*(psum[i+1]%m))%m;
			ans=(ans%m+product%m)%m;
		}
		
		System.out.println(ans);

	}

}
