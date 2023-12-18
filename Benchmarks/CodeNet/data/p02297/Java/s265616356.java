import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new CGL_2B().doIt();
	}

	class CGL_2B{

		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY()-p1.getY()*p2.getX();
		}
		double area(ArrayList<Point2D> points){
			double ret=0.0;
			for(int i=0; i<points.size(); ++i){
				Point2D p1=points.get(i), p2=points.get((i+1)%points.size()); 
				ret+=cross(p1, p2); 
			}
			return Math.abs(ret)/2.0;
		}
		void doIt(){
			int n = in.nextInt();
			ArrayList<Point2D> list= new ArrayList<Point2D>();
			for(int i=0;i<n;i++)list.add(new Point2D.Double(in.nextDouble(),in.nextDouble()));
			System.out.printf("%.5f\n",area(list));
		}
	}


}