import java.util.Scanner;
import java.lang.Math;


public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);

		int n;
		double x1,x2,x3;
		double y1,y2,y3;
		double X2,Y2,Z2;
		double X3,Y3,Z3;
		double cx,cy,cr;
		
		n = cin.nextInt();
		while(n-- > 0)
		{
			x1 = cin.nextDouble();
			y1 = cin.nextDouble();
			x2 = cin.nextDouble();
			y2 = cin.nextDouble();
			x3 = cin.nextDouble();
			y3 = cin.nextDouble();
			
			X2 = (x2-x1);
			Y2 = (y2-y1);
			Z2 = (x1*x1)+(y1*y1)-(x2*x2)-(y2*y2);
			X3 = (x3-x1);
			Y3 = (y3-y1);
			Z3 = (x1*x1)+(y1*y1)-(x3*x3)-(y3*y3);
			
			cx = -0.5*(Y2*Z3-Y3*Z2)/(Y2*X3-Y3*X2);
			cy = -0.5*(X2*Z3-X3*Z2)/(X2*Y3-X3*Y2);
			cr=Math.sqrt((x1-cx)*(x1-cx)+(y1-cy)*(y1-cy));		
			
			cx=(cx==0.0?0.0:cx);
			cy=(cy==0.0?0.0:cy);
			cr=(cr==0.0?0.0:cr);	
			System.out.printf("%.3f %.3f %.3f\n",cx,cy,cr);	
		}
		

	}
}