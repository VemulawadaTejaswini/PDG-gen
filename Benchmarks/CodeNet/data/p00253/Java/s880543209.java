import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
				if(n==0)
					return;
			int a[]=new int[n+1];
			int b[]=new int[n];
			int ans=0;
			for(int i=0;i<=n;i++)
				a[i]=in.nextInt();
			for(int i=0;i<n;i++)
				b[i]=a[i+1]-a[i];
			
			for(int i=0;i<n;i++)
			{
				if(b[i]!=b[i+1])
				{
					if(i+1==n-1)
					{
						ans=n;
						break;
					}
					else if(b[i+1]==b[i+2])
					{
						ans=i;
						break;
					}
					else if(b[i+1]!=b[i+2])
					{
						ans=i+2;
						break;
					}
				}
			}
			System.out.println(a[ans]);
		}
	}
}