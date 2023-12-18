import java.util.Scanner;

class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		double x1,x2,x3,y1,y2,y3,a1,a2,b1,b2,c1,c2,xp,yp,r;
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			x3 = sc.nextDouble();
			y3 = sc.nextDouble();
			
			a1 = 2*(x2-x1);
			a2 = 2*(x3-x1);
			b1 = 2*(y2-y1);
			b2 = 2*(y3-y1);
			c1 = x1*x1 - x2*x2 + y1*y1 - y2*y2;
			c2 = x1*x1 - x3*x3 + y1*y1 - y3*y3;
			
			xp = (b1*c2 - b2*c1)/(a1*b2 - a2*b1);
			yp = (c1*a2 - c2*a1)/(a1*b2 - a2*b1);
			
			r = Math.hypot(xp-x1, yp-y1);
			
			System.out.printf("%.3f %.3f %.3f\n", xp,yp,r);
		}
	}
}