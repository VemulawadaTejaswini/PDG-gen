import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			int tmp=0;
			int now=i;
			while(now>0)
			{
				tmp+=now%10;
				now/=10;
			}
			if(tmp>=a && tmp<=b)
				ans+=i;
		}

		System.out.println(ans);
	}
}