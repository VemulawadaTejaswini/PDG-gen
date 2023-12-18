import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n= sc.nextInt();
			if(n==0)
				return;
			int count =0;
			while(n!=1)
			{
				if(n%2!=0)
					n=n*3+1;
				else
					n/=2;
				count++;
			}
			System.out.println(count);
		}
	}
}