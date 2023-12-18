import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			new AOJ1107().doIt(n);
		}
	}
	
	class AOJ1107{
		void doIt(int n){
			double EPS = 1.0e-8;
			Point2D[] p = new Point2D[n];
			for(int i=0;i<n;i++)p[i] = new Point2D.Double(in.nextDouble(), in.nextDouble());
			boolean[] used = new boolean[n];
			double result = 0;
			Point2D before = new Point2D.Double(0,-1);
			Point2D now = new Point2D.Double(0,0);
			int visit = 0;
			while(visit!=n){
				double max = Integer.MIN_VALUE;
				double len = Double.MAX_VALUE;
				int index = -1;
				for(int i=0;i<n;i++)if(!used[i]){
					//内積
					double ccw = dot(sub(now, before),sub(p[i],now));
					double res = now.distance(p[i]);
//					System.out.println(sub(now, before));
//					System.out.println(sub(p[i], now));
					ccw /= sub(now,before).distance(0,0);
					ccw /= sub(p[i],now).distance(0,0);
//					System.out.println("CCW " + ccw+" "+i+" "+p[i]);
					if((max<ccw)||(Math.abs(max-ccw)<EPS&&res<len)){
						max = ccw;
						index = i;
						len = res;
					}
				}

//				System.out.println(sub(now, before));
//				System.out.println(sub(p[index], now));
				used[index] = true;
//				System.out.println("CCW "+index+" "+p[index]);
				result += p[index].distance(now);
				before = now;
				now = p[index];
				visit++;
			}
			System.out.printf("%.1f\n",result);
		}
		double dot(Point2D p1,Point2D p2){
			return p1.getX()*p2.getX()+p1.getY()*p2.getY();
		}
		Point2D sub(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
		}
	}
}