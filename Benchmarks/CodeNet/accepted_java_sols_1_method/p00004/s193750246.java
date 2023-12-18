import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new  Scanner(System.in);
		while(in.hasNext())
		{
			double a=in.nextDouble(),b=in.nextDouble(),c=in.nextDouble();
			double d=in.nextDouble(),e=in.nextDouble(),f=in.nextDouble();
			double x,y;
			y=(c*d-a*f)/(b*d-a*e);
			x=(c-b*y)/a;
			System.out.printf("%.3f ",x);
			System.out.printf("%.3f",y);
			System.out.println();
		}
	}
}