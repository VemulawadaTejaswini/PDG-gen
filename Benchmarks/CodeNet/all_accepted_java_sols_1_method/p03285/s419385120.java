import java.util.Scanner;

public class Main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int ans=0;
		int k;
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<26;j++)
			{
				k=7*i+4*j;
				if(k==n)
				{
					ans=1;
					break;
				}
				if(k>n)
					break;
			}
		}
		if(ans==1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
