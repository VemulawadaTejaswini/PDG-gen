import java.util.Scanner;
public class Main
{
	public static void main(String aeg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int sum=0;
			for(int i=0; i<(n*(n-1))/2;i++)
				sum+=in.nextInt();
			System.out.println(sum/(n-1));
		}
	}
}