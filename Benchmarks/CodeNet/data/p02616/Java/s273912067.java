import java.util.*;

public class Main{
	public static void main (String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int k=sc.nextInt();

		int[] a= new int[n];

		int mod=(int)Math.pow(10,9)+7;

		for(int i=0;i<n;i++){
			a[i]=sc.nextInt()%mod;
		}

		Arrays.sort(a);
		
		int left=0;
		int right=n-1;
		
		long ans= k%2==0? 1:a[right--];
		int c=1;
		if(ans<0)c=-1;
		
		while(k>=2) {
			if(c*a[left]*a[left+1]>c*a[right]*a[right-1]) {
				ans=ans*a[left]%mod;
				ans=ans*a[left+1]%mod;
				left+=2;
			}else {
				ans=ans*a[right]%mod;
				ans=ans*a[right-1]%mod;
				right-=2;
			}
			k-=2;
		}
		



		if(ans<0)ans+=mod;
		System.out.println(ans);

	}
}