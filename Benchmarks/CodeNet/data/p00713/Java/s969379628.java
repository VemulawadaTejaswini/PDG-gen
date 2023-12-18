import java.util.Arrays;
import java.util.Scanner;
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
			for(int i=0;i<n;i++)
				p[i]=new Point(in.nextDouble(), in.nextDouble());
			int max=1;
			for(int i=0;i<n;i++)
				for(int j=i+1;j<n;j++)
				{
					double d=Point.point_distance(p[i],p[j]);
					if(d>2)
						continue;
					//中点
					double mx=(p[i].x+p[j].x)/2;
					double my=(p[i].y+p[j].y)/2;
					//i->jの単位ベクトル
					double vx=(p[j].x-p[i].x)/d;
					double vy=(p[j].y-p[i].y)/d;
					//m->cの距離
					double e=Math.sqrt(1-d*d/4);
					Point pc=new Point(mx+e*vy,my-e*vx);
					int cnt=2;
					for(int k=0;k<n;k++)
					{
						if(k!=i&&k!=j)
						{
							double tmp_dis=(pc.x-p[k].x)*(pc.x-p[k].x)+(pc.y-p[k].y)*(pc.y-p[k].y);
							if(tmp_dis<=1)
								cnt++;
						}
					}
					pc=new Point(mx-e*vy,my+e*vx);
					cnt=2;
					for(int k=0;k<n;k++)
					{
						if(k!=i&&k!=j)
						{
							double tmp_dis=(pc.x-p[k].x)*(pc.x-p[k].x)+(pc.y-p[k].y)*(pc.y-p[k].y);
							if(tmp_dis<=1)
								cnt++;
						}
					}
					max=Math.max(max,cnt);
				}
			System.out.println(max);
		}
	}

	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
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

	//線分p1-p2と線分p3-p4が交差しているかを判定 true->交差(=含みで接する含む) false->交差せず
	static boolean lineCross(Point p1,Point p2,Point p3,Point p4)
	{
		double a=(p1.x-p2.x)*(p3.y-p1.y)+(p1.y-p2.y)*(p1.x-p3.x);
		double b=(p1.x-p2.x)*(p4.y-p1.y)+(p1.y-p2.y)*(p1.x-p4.x);
		double c=(p3.x-p4.x)*(p1.y-p3.y)+(p3.y-p4.y)*(p3.x-p1.x);
		double d=(p3.x-p4.x)*(p2.y-p3.y)+(p3.y-p4.y)*(p3.x-p2.x);
		return a*b<=0 && c*d<=0;
	}

	//クラスメソッド
	static double point_distance(Point p1,Point p2)
	{
		return Math.hypot(p1.x-p2.x, p1.y-p2.y);
	}
}