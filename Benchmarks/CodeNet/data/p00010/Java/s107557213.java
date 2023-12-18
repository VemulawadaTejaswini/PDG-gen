import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		while(N-->0)
		{
			double x1=in.nextDouble(),y1=in.nextDouble();
			double x2=in.nextDouble(),y2=in.nextDouble();
			double x3=in.nextDouble(),y3=in.nextDouble();
			
			double A1=2*(x2-x1);
			double B1=2*(y2-y1);
			double C1=x1*x1-x2*x2+y1*y1-y2*y2;
			double A2=2*(x3-x1);
			double B2=2*(y3-y1);
			double C2=x1*x1-x3*x3+y1*y1-y3*y3;
			
			double x=(B1*C2-B2*C1)/(A1*B2-A2*B1);
			double y=(C1*A2-C2*A1)/(A1*B2-A2*B1);
			double d=Math.sqrt(Math.abs((x-x1)*(x-x1)+(y-y1)*(y-y1)));
			
			System.out.printf("%.3f ",x);
			System.out.printf("%.3f ",y);
			System.out.printf("%.3f\n",d);
			
		}
	}
}