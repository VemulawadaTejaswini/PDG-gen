import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			Point3 p[]=new Point3[3];
			for(int i=0;i<3;i++) {
				p[i]=new Point3(in.nextDouble(), in. nextDouble());
				if(p[0].x==0&&p[0].y==0)
					return;
			}
			Point3 c=new Point3(in.nextDouble(), in.nextDouble());
			double r=in.nextDouble();
			boolean judge=false;
			if(ccw(p[0],c,p[1])==1&&ccw(p[1],c,p[2])==1&&ccw(p[2],c,p[0])==1
					||ccw(p[0],c,p[1])==-1&&ccw(p[1],c,p[2])==-1&&ccw(p[2],c,p[0])==-1)
				judge=true;

			double rd1=pointDistance(p[0], c);
			double rd2=pointDistance(p[1], c);
			double rd3=pointDistance(p[2], c);
			//円の中心と辺の距離
			double d1=Point3.lp_dis(c.x, c.y, p[0].x, p[0].y, p[1].x, p[1].y);
			double d2=Point3.lp_dis(c.x, c.y, p[1].x, p[1].y, p[2].x, p[2].y);
			double d3=Point3.lp_dis(c.x, c.y, p[2].x, p[2].y, p[0].x, p[0].y);

			if(judge)//円の中心が三角形内
			{

				if(r>=rd1&&r>=rd2&&r>=rd3)
					System.out.println("b");
				else if(r<=d1&&r<=d2&&r<=d3)
					System.out.println("a");
				else System.out.println("c");
			}
			else//円の中心が三角形外(接する含む)
			{
				if(r>=rd1&&r>=rd2&&r>=rd3)
					System.out.println("b");
				else if(r<d1&&r<d2&&r<d3)
					System.out.println("d");
				else System.out.println("c");
			}
		}
	}
	static double ccw(Point3 p1,Point3 p2,Point3 p3)
	{
		Point3 a=new Point3(p2.x-p1.x, p2.y-p1.y);
		Point3 b=new Point3(p3.x-p1.x, p3.y-p1.y);
		if(crossProduct(a, b)>0) return 1;//counter clockwise
		if(crossProduct(a, b)<0) return -1;//clockwise
		else return 0;
	}
	//外積
	static double crossProduct(Point3 a,Point3 b)
	{
		return a.x*b.y-a.y*b.x;
	}
	static double pointDistance(Point3 p1, Point3 p2)
	{
		return Math.hypot(p1.x-p2.x, p1.y-p2.y); 
	}
}

class Point3
{
	double x;
	double y;
	Point3(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	
	//point to line dis
	static double lp_dis(double px,double py,double x1,double y1,double x2,double y2)
	{
		double dx=x2-x1,dy=y2-y1;
		double a=dx*dx+dy*dy,b=dx*(x1-px)+dy*(y1-py);
		double t=-b/a;
		if(t<0) t=0;
		if(t>1) t=1;
		double tx=x1+dx*t;
		double ty=y1+dy*t;
		return Math.hypot(px-tx, py-ty);
	}	
}