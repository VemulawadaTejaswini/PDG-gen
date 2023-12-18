import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext())
		{
			int n = sc.nextInt();
			boolean a[] = new boolean[n*n];
			Arrays.fill(a, true);
			a[0]=a[1]=false;
			for(int i =2; i*i<=n+n; i++)
			{
				if(!a[i])
					continue;
				for(int j=i+i; j<=n+n;j+=i)
				{
					a[j] = false;
				}
			}

			for(int i=n-1; i>=0; i--)
			{
				if(a[i])
				{
					System.out.print(i);
					break;
				}
			}
			for(int i =n+1; i<=n+n; i++)
			{
				if(a[i])
				{
					System.out.println(" "+i);
					break;
				}
			}
		}
	}

}