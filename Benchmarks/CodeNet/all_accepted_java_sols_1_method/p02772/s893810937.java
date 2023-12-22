import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0,d=0;
		a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
			b=sc.nextInt();
			if(b%2==0)
			{
				if(b%3==0 || b%5==0)
				{
					
				}
				else
				{
					
					c=1;
				}
			}
			else
			{
				int e=b;
			}
		}
		if(c==0)
		{
			System.out.println("APPROVED");
		}
		else
		{
			System.out.println("DENIED");
		}
	}
}