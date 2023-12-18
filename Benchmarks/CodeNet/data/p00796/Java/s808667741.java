import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		double EPS=1e-4;
		while(N-->0)
		{
			double QR=in.nextDouble();
			double RP=in.nextDouble();
			double PQ=in.nextDouble();
			int n=in.nextInt();
			Point p[]=new Point[n];
			for(int i=0;i<n;i++)
				p[i]=new Point(in.nextDouble(),in.nextDouble(),in.nextDouble());

			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					for(int k=0;k<n;k++)
					{
						if(i==j||j==k||k==i)
							continue;
						double dis1=distance(p[i],p[j]);
						double dis2=distance(p[j],p[k]);
						double dis3=distance(p[k],p[i]);
						boolean judge=false;
						if(dis1/dis2-PQ/QR<EPS)
							if(dis2/dis3-QR/RP<EPS)
								if(dis3/dis1-RP/PQ<EPS)
									judge=true;
						if(judge)
						{
							System.out.println((i+1)+" "+(j+1)+" "+(k+1));
							break;
						}
					}

		}
	}

	static double distance(Point p1,Point p2)
	{
		double d1=Math.hypot(p1.x-p2.x,p1.y-p2.y);
		double dis=Math.hypot(d1,p1.z-p2.z);
		return dis;
	}

	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}

class Point
{
	double x,y,z;
	Point(double x,double y,double z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
}