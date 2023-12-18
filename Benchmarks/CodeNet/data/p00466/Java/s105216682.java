import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int sum=0;
			int r=9;
			while(r-->0)
				sum+=in.nextInt();
			System.out.println(n-sum);
		}
	}
}