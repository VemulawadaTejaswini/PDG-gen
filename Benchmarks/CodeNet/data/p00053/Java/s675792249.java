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
			if(n==0)
				return;
			int ans =0;
			boolean a[] = new boolean[1000001];
			Arrays.fill(a, true);
			a[0]=a[1]=false;

			for(int i=0; i*i<=1000000; i++)
			{
				if(!a[i])
					continue;
				for(int j=i+i; j<=1000000; j+=i)
				{
					a[j] = false;
				}
			}

			int i=0;
			while(n>0)
			{
				
				if(a[i])
				{
					ans+=i;
					n--;
				}
				i++;
			}
			System.out.println(ans);
		}
	}
}