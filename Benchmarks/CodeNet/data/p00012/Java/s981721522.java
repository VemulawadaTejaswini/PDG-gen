import java.awt.geom.Point2D;
import java.util.*;
public class Main {
     Scanner sc = new Scanner(System.in);
     //多角形の包含関係
     int contains(Point2D[] plist,Point2D p){
    	boolean isin = false;
    	int n = plist.length;
    	for(int i = 0;i < n;i++){
    		Point2D a = sub(plist[i],p);
    		Point2D b = sub(plist[(i+1) % n ], p);
    		if(a.getY() > b.getY()){
    			Point2D temp = (Point2D) a.clone();a = b;
    			b = temp;
    		}
    		if(a.getY() <= 0 && 0 < b.getY()){
    			if(cross(a,b) < 0) isin =! isin;
    		}
    		if(cross(a,b) == 0 && dot(a,b) <= 0)return 0;
    	}
    	return isin ? 1 : -1;
     }
     //点と点の差
     Point2D sub(Point2D p1,Point2D p2){
    	 return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
     }
     //内積
     double dot(Point2D p1,Point2D p2){
    	 return p1.getX()*p2.getX()+p1.getY()*p2.getY();
     }
     //外積
     double cross(Point2D p1,Point2D p2){
    	 return p1.getX()*p2.getY()-p1.getY()*p2.getX();
     }
     void doIt() { 
    	 while(sc.hasNext()){
    		 Point2D xy[] = new Point2D.Double [3];
    		 for(int i = 0;i < 3;i++){
    			 xy[i] = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    		 }
    		 Point2D xyp = new Point2D.Double(sc.nextDouble(),sc.nextDouble());
    		 if(contains(xy,xyp) == 1){
    			 System.out.println("YES");
    		 }else{
    			 System.out.println("NO");
    		 }
    	 }
     }
	public static void main(String[] args) {
          // TODO Auto-generated method stub
          new Main().doIt();
     }

}