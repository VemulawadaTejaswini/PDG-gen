import java.util.*;
public class Main
{
	static boolean used[];
	static int UF[];
	static Point rec[][];
	static double EPS=1e-7;
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int N=in.nextInt();
			if(N==0)
				return;
			while(N-->0)
			{
				int n=in.nextInt();
				rec=new Point[n][4];
				used=new boolean[n];// true is used...
				UF=new int[n];
				Arrays.fill(UF, -1);
				for(int i=0;i<n;i++)
					for(int j=0;j<4;j++)
						rec[i][j]=new Point(in.nextDouble(), in.nextDouble());
				int cnt=0;
				dfs(0);
				for(int i=0;i<n;i++)
					if(UF[i]<0)
						cnt++;
				System.out.println(cnt);
			}
		}
	}

	static int find(int a)
	{
		if(UF[a]<0)
			return a;
		return UF[a]=find(UF[a]);
	}
	static void union(int a, int b)
	{
		a=find(a);
		b=find(b);
		if(a==b)
			return;
		UF[a]=b;
	}

	static void dfs(int now)
	{
		used[now]=true;
		for(int i=0;i<used.length;i++)
		{
			for(int j=i+1;j<used.length;j++)
			{
				boolean go=false;
				for(int k=0;k<4;k++)
					for(int l=0;l<4;l++)
					{
						if(Point.lineCross(rec[i][k], rec[i][(k+1)%4], rec[j][l], rec[j][(l+1)%4]))
							go=true;	
					}

				for(int k=0;k<4;k++)
				{
					if(Point.inclusive(rec[i][0], rec[i][1], rec[i][2], rec[j][k])) go=true;
					if(Point.inclusive(rec[i][0], rec[i][3], rec[i][2], rec[j][k])) go=true;
					if(Point.inclusive(rec[j][0], rec[j][1], rec[j][2], rec[i][k])) go=true;
					if(Point.inclusive(rec[j][0], rec[j][3], rec[j][2], rec[i][k])) go=true;
				}

				if(go)
					union(i, j);
			}
		}
	}
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}

class Point
{
	double x;
	double y;
	static double EPS=1e-7;
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
		return a*b<EPS && c*d<EPS;
	}

	//counterClockWise p1->p2->p3が反時計周りなら1 時計周りなら-1を返す 
	static double ccw(Point p1,Point p2,Point p3)
	{
		Point a=new Point(p2.x-p1.x, p2.y-p1.y);
		Point b=new Point(p3.x-p1.x, p3.y-p1.y);
		if(crossProduct(a, b)>EPS) return 1;//counter clockwise
		if(crossProduct(a, b)<-EPS) return -1;//clockwise
		if (dot(a,b)<0) return +2;// 3--1--2 on line
		if (norm(a)<norm(b)) return -2; // 1--2--3 on line
		else return 0;
	}

	static boolean inclusive(Point a, Point b, Point c, Point p)
	{
		boolean j1=true;
		boolean j2=true;
		if((b.x-a.x)*(p.y-a.y)-(p.x-a.x)*(b.y-a.y)<-EPS) j1=false;
		if((b.x-a.x)*(p.y-a.y)-(p.x-a.x)*(b.y-a.y)>EPS) j2=false;
		if((c.x-b.x)*(p.y-b.y)-(p.x-b.x)*(c.y-b.y)<-EPS) j1=false;
		if((c.x-b.x)*(p.y-b.y)-(p.x-b.x)*(c.y-b.y)>EPS) j2=false;
		if((a.x-c.x)*(p.y-c.y)-(p.x-c.x)*(a.y-c.y)<-EPS) j1=false;
		if((a.x-c.x)*(p.y-c.y)-(p.x-c.x)*(a.y-c.y)>EPS) j2=false;
		return j1||j2;
	}

	//外積
	static double crossProduct(Point a,Point b)
	{
		return a.x*b.y-a.y*b.x;
	}
	static double dot(Point a, Point b)
	{
		return a.x*b.x+a.y*b.y;
	}
	static double norm(Point a)
	{
		return Math.sqrt(a.x*a.x+a.y*a.y);
	}

	//3頂点からなる三角形の面積
	static double triangleArea(Point p1,Point p2,Point p3)
	{
		return Math.abs((p3.y-p1.y)*(p2.x-p1.x)-(p2.y-p1.y)*(p3.x-p1.x))/2;
	}
}

//x>=yの優先度で頂点を昇順ソート
//Arrays.sort(p,new PointComparator());こんな感じで使う
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