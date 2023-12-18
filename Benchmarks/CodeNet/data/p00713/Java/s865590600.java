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
			int dir[]={1,-1};
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
					for(int s=0;s<2;s++)
					{
						//円の中心座標
						Point pc=new Point(mx-e*vy*dir[s],my+e*vx*dir[s]);
						int cnt=2;
						for(int k=0;k<n;k++)
						{
							if(k!=i&&k!=j)
							{
								//hypotを使わずに距離を比較し計算時間が1/10になった
								double tmp_dis=(pc.x-p[k].x)*(pc.x-p[k].x)+(pc.y-p[k].y)*(pc.y-p[k].y);
								if(tmp_dis<=1)
									cnt++;
							}
						}
						max=Math.max(max,cnt);
					}
				}
			System.out.println(max);
		}
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
	//クラスメソッド
	static double point_distance(Point p1,Point p2)
	{
		return Math.hypot(p1.x-p2.x, p1.y-p2.y);
	}
}