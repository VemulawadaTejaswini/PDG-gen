import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		boolean a[] = new boolean [50001];
		Arrays.fill(a, true);
		a[0]=a[1]=false;
		for(int i=0; i*i<=50000;i++)
		{
			if(!a[i])
				continue;
			for(int j=i*2; j<=50000; j+=i)
				a[j]=false;
		}

		while(sc.hasNext())
		{
			int n=sc.nextInt();
			if(n==0)
				return;
			int ans=0;

			for(int i=1; i<=n; i++)
			{
				if(!a[i])
					continue;
				for(int j=i; j<=n; j++)
				{
					if(!a[j])
						continue;				
					if(n ==i+j)
						ans++;
				}
			}
			System.out.println(ans);

		}
	}

}