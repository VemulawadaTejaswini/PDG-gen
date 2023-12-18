import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int N=1299709;
		boolean a[] = new boolean[N+1];
		Arrays.fill(a, true);
		a[0]=a[1]=false;
		for(int i=2; i*i<=N; i++)
		{
			if(!a[i])
				continue;
			for(int j=i*2; j<=N; j+=i)
			{
				a[j]=false;
			}
		}
	
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			if(n==0)
				return;
			if(a[n]||n==1)
			{
			System.out.println(0);	
				continue;
			}
			int ans=0;
			
			for(int i=n+1; i<=N; i++)
			{
				if(!a[i])
					ans++;
				else
				{
					ans++;
					break;
				}
			}
			for(int i=n-1; i>=0; i--)
			{
				if(!a[i])
					ans++;
				else
				{
					ans++;
					break;
				}
			}
			System.out.println(ans);
		}
	}
}