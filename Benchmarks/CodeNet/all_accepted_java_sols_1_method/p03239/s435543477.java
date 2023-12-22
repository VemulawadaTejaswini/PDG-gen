import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,total_t;
		n=sc.nextInt();
		total_t=sc.nextInt();
		int c[] = new int[n];
		int t[] = new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=sc.nextInt();
			t[i]=sc.nextInt();
		}
		int min=1001;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(t[i]<=total_t)
			{
				if(c[i]<min)
				{
					min=c[i];
					flag=1;
				}
			}
		}
		if(flag==1)
			System.out.println(min);
		else
			System.out.println("TLE");
	}
}
