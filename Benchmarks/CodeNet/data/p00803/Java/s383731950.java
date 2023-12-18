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
			int a=0;
			for(int i=0;i*i*i<=n;i++)
				for(int j=0;j<=n;j++)
				{
					int tmp=i*i*i+j*(j+1)*(j+2)/6;
					if(tmp>n)
						break;
					a=Math.max(a, tmp);
				}
			System.out.println(a);
		}
	}
}