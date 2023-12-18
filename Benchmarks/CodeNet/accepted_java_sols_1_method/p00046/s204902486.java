import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		double max=sc.nextDouble();
		double min=max;


		while(sc.hasNext())
		{
			double h =sc.nextDouble();
			if(h>max)
				max=h;
			if(h<min)
				min=h;
		}
		System.out.println(max-min);
	}
}