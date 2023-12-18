import java.awt.Point;
import java.awt.geom.*;
import java.awt.geom.Point2D.Double;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	new aoj0059().doIt();
    }
    class aoj0059{
    	void doIt(){
    		while(sc.hasNext()){
    			boolean in = false;
    			Point2D p[] = new Point2D[4];
    			Point2D p2[] = new Point2D[4];
    			for(int i = 0;i < 2;i++){
    				p[i*2] = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    			}
    			p[1] = new Point2D.Double(p[0].getX(),p[2].getY());
    			p[3] = new Point2D.Double(p[2].getX(),p[0].getY());
    			for(int i = 0;i < 2;i++){
    				p2[i*2] = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    			}
    			p2[1] = new Point2D.Double(p2[0].getX(),p2[2].getY());
    			p2[3] = new Point2D.Double(p2[2].getX(),p2[0].getY());
    			for(int i = 0;i < 4;i++){
    				if(contains(p,p2[i]) > 0)in = true;
    			}
    			if(in)System.out.println("YES");
    			else System.out.println("NO");
            }
    	}
    	int contains(Point2D[] plist,Point2D p) {
    		boolean isin = false;
    		int n = plist.length;
    		for(int i=0;i<n;i++){
    			Point2D a = sub(plist[i], p);
    			Point2D b = sub(plist[(i+1) % n], p);
    			if(a.getY() > b.getY()){
    				Point2D temp = (Point2D) a.clone();
    				a = b;
    				b = temp;
    			}
    			if(a.getY() <= 0 && 0 < b.getY()){
    				if(cross(a,b) < 0) isin = ! isin;
    			}
    			if(cross(a,b) == 0 && dot(a, b) <= 0) return 0;
    		}
    		return isin ? 1 : -1;
    	}
    	Point2D sub(Point2D p2, Point2D p1) {
            double x = p2.getX() - p1.getX();
            double y = p2.getY() - p1.getY();
            return new Point2D.Double(x, y);
    	}
    	double cross(Point2D p1, Point2D p2){
    		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
    		return res;
    	}
    	double dot(Point2D p1,Point2D p2){
    		return p1.getX() * p2.getX() + p1.getY() * p2.getY();
    	}
    }
}