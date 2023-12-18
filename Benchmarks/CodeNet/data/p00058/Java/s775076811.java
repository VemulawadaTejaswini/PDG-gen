import java.awt.geom.*;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	new aoj0058().doIt();
    }
    class aoj0058{
    	void doIt(){
    		while(sc.hasNext()){
    			Point2D p1 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    			Point2D p2 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    			Point2D p3 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    			Point2D p4 = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    			Point2D p12 = sub(p1,p2);
    			Point2D p34 = sub(p3,p4);
                if(Math.abs(dot(p12,p34))<1e-10)System.out.println("YES");
                else System.out.println("NO");
            }
    	}
    	Point2D sub(Point2D p2, Point2D p1) {
            double x = p2.getX() - p1.getX();
            double y = p2.getY() - p1.getY();
            return new Point2D.Double(x, y);
        }
    	double dot(Point2D p1, Point2D p2){
            return p1.getX() * p2.getX() + p1.getY() * p2.getY();
        }
    }
}