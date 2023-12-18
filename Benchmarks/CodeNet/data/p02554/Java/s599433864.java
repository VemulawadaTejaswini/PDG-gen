import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		long m=1000000007;
		
		int n=s.nextInt();
		
		long ans=power(10,n,m);
		ans=(ans+power(8,n,m))%m;
		
		long val=(2*power(9,n,m))%m;
		
		ans=(ans-val+m)%m;
		
		System.out.println(ans);
	}
	
	public static long power(long a,long b,long m)
	{
		long res=1;
		
		while(b>0)
		{
			if(b%2!=0)
			{
				res=(res%m*a%m)%m;
			}
			
			b=b/2;
			a=(a%m*a%m)%m;
		}
		
		return res;
		
	}
	
}