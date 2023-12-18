import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		long[] arr=new long[n];
		long k=s.nextLong();
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLong();
		}
		
		long ans=Long.MAX_VALUE;
		
		long st=1;
		long end=1000000000000000l;
		
		while(st<=end) {
			long mid=(st+end)/2;
			
			long b=0;
			for(int i=0;i<n;i++) {
				long p=arr[i]/mid;
				if(arr[i]%mid!=0) {
					p++;
				}
				
				b=b+p-1;
				
			}
			if(b<=k) {
				ans=mid;
				end=mid-1;
			}else {
				st=mid+1;
			}
			
			
			
		}
		
		
		System.out.println(ans);
		
		
	}
}