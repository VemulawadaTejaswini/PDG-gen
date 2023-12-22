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
			int cnt=0;
			for(int i=1;i<n;i++)
			{
				int sum=0;
				for(int j=i;j<n;j++)
				{
					sum+=j;
					if(sum>n)
						break;
					if(sum==n)
						cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}