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
			int ans=0;
			for(int i=0;i<=n;i++)
				a[i]=in.nextInt();
			
			for(int i=0;i<=n;i++)
			{
				boolean judge=false;
				for(int j=0;j<=n-2;j++)
				{
					int x=j+2;
					int y=j+1;
					int z=j;
						if(x==i)
						{
							x++;
						}
						else if(y==i)
						{
							x++;
							y++;
						}
						else if(z==i)
						{
							x++;
							y++;
							z++;
						}
						if(x==a.length)
							break;
					if(a[x]-a[y]==a[y]-a[z])
						judge=true;
					else
					{
						judge=false;
						break;
					}
				}
				if(judge)
				{
					ans=i;
					break;
				}
			}
			System.out.println(a[ans]);
		}
	}
}