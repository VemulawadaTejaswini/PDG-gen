import java.util.Comparator;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			Point2 p[]=new Point2[4];
			for(int i=0;i<4;i++)
				p[i]=new Point2(in.nextDouble(), in.nextDouble());
			boolean judge=false;
			if((Point2.ccw(p[0],p[1],p[3])>0&&Point2.ccw(p[1],p[2],p[3])>0&&Point2.ccw(p[2],p[0],p[3])>0)
					||(Point2.ccw(p[0],p[1],p[3])<0&&Point2.ccw(p[1],p[2],p[3])<0&&Point2.ccw(p[2],p[0],p[3])<0))
				judge=true;
			System.out.println(judge ? "YES":"NO");
		}
	}
}
class Point2
{
	double x;
	double y;
	Point2(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	
	 //counterClockWise p1->p3->p2が時計周りなら正 反時計周りなら負を返す 
	 static double ccw(Point2 p1,Point2 p2,Point2 p3)
	{
		double res=(p3.y-p1.y)*(p2.x-p1.x)-(p2.y-p1.y)*(p3.x-p1.x);
		return res;
	}
}