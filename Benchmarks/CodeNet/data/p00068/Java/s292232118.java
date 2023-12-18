import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			Point p[]=new Point[n];
			Point q[]=new Point[n*2];
			for(int i=0;i<n;i++)
			{
				String st[]=in.next().split(",");
				p[i]=new Point(Double.valueOf(st[0]), Double.valueOf(st[1]));
			}
			
			Arrays.sort(p,new PointComparator());
			
			int k=0;
			for(int i=0;i<n;i++)
			{
				while(k>1 && cross(q[k-1].x-q[k-2].x, q[k-1].y-q[k-2].y , p[i].x-q[k-1].x, p[i].y-q[k-1].y)<=0)
						k--;
				q[k++]=p[i];
			}
			
			for(int i=n-2,t=k;i>=0;i--)
			{
				while(k>t && cross(q[k-1].x-q[k-2].x, q[k-1].y-q[k-2].y , p[i].x-q[k-1].x, p[i].y-q[k-1].y)<=0)
						k--;
				q[k++]=p[i];
			}
			System.out.println(n-k+1);
		}
	}
	
	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
	
	static double cross(double x1,double y1, double x2,double y2)
	{
		return x1*y2-y1*x2;
	}
}

class Point
{
	double x;
	double y;
	Point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}

class PointComparator implements Comparator<Point>
{
	public int compare(Point p1,Point p2)
	{
		double cmp=p1.x-p2.x;
		if(cmp==0)
			cmp=p1.y-p2.y;
		if(cmp<0)
			cmp=-1;
		else
			cmp=1;
		return (int) cmp;
	}
}