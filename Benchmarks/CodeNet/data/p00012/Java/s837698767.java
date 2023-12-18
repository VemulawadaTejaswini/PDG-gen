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
			if(ccw(p[0],p[3],p[1])==1&&ccw(p[1],p[3],p[2])==1&&ccw(p[2],p[3],p[0])==1
					||ccw(p[0],p[3],p[1])==-1&&ccw(p[1],p[3],p[2])==-1&&ccw(p[2],p[3],p[0])==-1)
				judge=true;
			System.out.println(judge ? "YES":"NO");
		}
	}
	//counterClockWise p1->p2->p3が反時計周りなら正 時計周りなら負を返す 
	static double ccw(Point2 p1,Point2 p2,Point2 p3)
	{
		Point2 a=new Point2(p2.x-p1.x, p2.y-p1.y);
		Point2 b=new Point2(p3.x-p1.x, p3.y-p1.y);
		 if(crossProduct(a, b)>0) return 1;//counter clockwise
		 if(crossProduct(a, b)<0) return -1;//clockwise
		 else return 0;
	}
	//外積
	static double crossProduct(Point2 p2,Point2 p3)
	{
		return p2.y*p3.x-p2.x*p3.y;
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
}