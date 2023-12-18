import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);

		double a,b,c,d;
		double p,q,x,y;
		
		while(cin.hasNext())
		{
			a=cin.nextDouble();
			b=cin.nextDouble();
			p=cin.nextDouble();
			c=cin.nextDouble();
			d=cin.nextDouble();
			q=cin.nextDouble();
		
			x = ( d*p-b*q)/(a*d-b*c);
			y = (-c*p+a*q)/(a*d-b*c);
		
			if(x==0.0) x=0.0;
			if(y==0.0) y=0.0;
			
			System.out.printf("%.3f %.3f\n",x,y);
		}
	}
}