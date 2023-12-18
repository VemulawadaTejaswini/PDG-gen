import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in =new Scanner(System.in);
		while(in.hasNext())
		{
			double m=in.nextDouble();
			double t=m/9.8;
			double y=4.9*t*t;
			int f=0;
			while(true)
			{
				if(5*f-5>y)
					break;
				f++;
			}
			System.out.println(f);
		}
	}
}