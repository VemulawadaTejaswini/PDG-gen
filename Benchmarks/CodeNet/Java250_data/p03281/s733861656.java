import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int res,count;
		res=1;
		if(n<105)
			System.out.println(0);
		else if(n==105||n==106)
			System.out.println(1);
		else
		{
			for(int i=107;i<=n;i=i+2)
			{
				count=0;
				for(int j=1;j<=i/2;j=j+2)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==7)
					res++;
			}
			System.out.println(res);
		}		
	}
}
