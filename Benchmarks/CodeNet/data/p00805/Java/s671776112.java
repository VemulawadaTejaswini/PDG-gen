import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	HashMap<Integer, Character> map = new HashMap<Integer, Character>();
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		while(in.hasNext())new AOH1226().doIt();
	}
	
	class AOH1226{
		void doIt(){
			int n = in.nextInt();
			if(n==0)return;
			double[] a = new double[n];
			double[] b = new double[n];
			double[] c = new double[n];
			double[] d = new double[n];
			for(int i=0;i<n;i++)a[i] = in.nextDouble();
			for(int i=0;i<n;i++)b[i] = in.nextDouble();
			for(int i=0;i<n;i++)c[i] = in.nextDouble();
			for(int i=0;i<n;i++)d[i] = in.nextDouble();
			Line2D[][] lines = new Line2D[n][2];
			for(int i=0;i<n;i++){
				lines[i][0] = new Line2D.Double(new Point2D.Double(a[i], 0),new Point2D.Double(b[i],1));
				lines[i][1] = new Line2D.Double(new Point2D.Double(0,c[i]),new Point2D.Double(1,d[i]));
			}
			int p_n = (n+2)*(n+2);
			Point2D p[] = new Point2D[p_n];
			for(int i=0;i<=n+1;i++){
				for(int s=0;s<=n+1;s++){
					if(i==0){
						if(s==0)p[0] = new Point2D.Double(0,0);
						else if(s==n+1)p[n+1] = new Point2D.Double(0,1);
						else p[s] = new Point2D.Double(0,c[s-1]);
					}else if(i==n+1){
						if(s==0)p[i*(2+n)+s] = new Point2D.Double(1,0);
						else if(s==n+1)p[i*(2+n)+s] = new Point2D.Double(1,1);
						else p[i*(2+n)+s] = new Point2D.Double(1,d[s-1]);
					}else{//i=1~n
						if(s==0)p[i*(2+n)+s] = new Point2D.Double(a[i-1],0);
						else if(s==n+1)p[i*(2+n)+s] = new Point2D.Double(b[i-1],1);
						else p[i*(2+n)+s] = intersectionPoint(lines[i-1][0], lines[s-1][1]);
					}
					System.out.println(i+": "+Arrays.toString(p));
				}
			}
			double max = Double.MIN_VALUE;
			for(int i=0;i<n+1;i++)for(int s=0;s<n+1;s++){
				Point2D v1 = diff(p[i*(n+2)+s+1], p[i*(n+2)+s]),
                        v2 = diff(p[(i+1)*(n+2)+s], p[i*(n+2)+s]);
                double area = Math.abs(cross(v1, v2) /2);
                Point2D v3 = diff(p[i*(n+2)+s], p[i*(n+2)+s+1]),
                        v4 = diff(p[(i+1)*(n+2)+s], p[i*(n+2)+s+1]);
                area += Math.abs(cross(v3, v4)/2);
                max = Math.max(max, area);
            }
			System.out.println(max);
		}
		
		Point2D intersectionPoint(Line2D l1,Line2D l2){
			return intersectionPoint(l1.getP1(), l1.getP2(), l2.getP1(), l2.getP2()); 
		}
		Point2D intersectionPoint(Point2D a1,Point2D a2,Point2D b1,Point2D b2){
			Point2D a=diff(a2,a1),
					b=diff(b2,b1);
			return sum(a1, mul(cross(b, diff(b1,a1))/cross(b,a), a));
		}
		Point2D sum(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(),p1.getY()+p2.getY());
		}
		Point2D diff(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
		}
		Point2D mul(double n,Point2D p1){
			return new Point2D.Double(p1.getX()*n,p1.getY()*n);
		}

		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY()-p1.getY()*p2.getX();
		}
	}
	
}