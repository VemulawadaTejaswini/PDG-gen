import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long max=1000000000000000000l;
		
		int n=s.nextInt();
		
		long[] arr=new long[n];
		
		int z=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextLong();
			
			if(arr[i]==0)
				z++;
		}
		
		long ans=1;
		
		int f=0;
		
		for(int i=0;i<n;i++)
		{
			long p=max/ans;
			
			if(arr[i]<=p)
			{
				ans=ans*arr[i];
			}
			else
			{
				f=1;
				break;
			}
		}
		
		if(f==0)
		{
			System.out.println(ans);
		}
		else if(z>0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(-1);
		}
		
	}
	
}