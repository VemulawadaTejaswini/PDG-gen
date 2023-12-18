import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int m=s.nextInt();
		
		long t=s.nextLong();
		
		long[] arr=new long[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		long[] brr=new long[m];
		
		for(int i=0;i<m;i++)
		{
			brr[i]=s.nextInt();
		}
		
		long[] sum1=new long[n];
		long[] sum2=new long[m];
		
		sum1[0]=arr[0];
		
		for(int i=1;i<n;i++)
		{
			sum1[i]=sum1[i-1]+arr[i];
		}
		
		sum2[0]=brr[0];
		
		for(int i=1;i<m;i++)
		{
			sum2[i]=sum2[i-1]+brr[i];
		}
		
		long max=0;
		
		for(int i=0;i<n;i++)
		{
			long count=0;
			
			if(t-sum1[i]>=0)
			{
				count=i+1;
				
				count=count+find(t-sum1[i],sum2);
				
				if(count>max)
					max=count;
			}
		}
		
		System.out.println(max);
		
	}
	
	public static long find(long t,long[] sum2)
	{
		int start=0;
		int end=sum2.length-1;
		
		int ans=0;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(sum2[mid]<=t)
			{
				ans=mid+1;
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		
		return ans;
	}
	
}