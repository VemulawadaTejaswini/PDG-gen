import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		while(in.hasNext())new AOJ0059().doIt();
	}
	
	class AOJ0059{
		Point2D[] plist1,plist2;
		void doIt(){
			plist1 = new Point2D[4];
			for(int i=0;i<4;i+=2)plist1[i] = new Point2D.Double(in.nextDouble(),in.nextDouble());
			plist1[1] = new Point2D.Double(plist1[0].getX(),plist1[2].getY());
			plist1[3] = new Point2D.Double(plist1[2].getX(),plist1[0].getY());
			plist2 = new Point2D[4];
			for(int i=0;i<4;i+=2)plist2[i] = new Point2D.Double(in.nextDouble(),in.nextDouble());
			plist2[1] = new Point2D.Double(plist2[0].getX(),plist2[2].getY());
			plist2[3] = new Point2D.Double(plist2[2].getX(),plist2[0].getY());
//			System.out.println(Arrays.toString(plist1));
//			System.out.println(Arrays.toString(plist2));
			Line2D[] llist1 = new Line2D[4];
			Line2D[] llist2 = new Line2D[4];
			for(int i=0;i<4;i++){
				llist1[i] = new Line2D.Double(plist1[i], plist1[(i+1)%4]);
				llist2[i] = new Line2D.Double(plist2[i], plist2[(i+1)%4]);
			}
			
			boolean sw = false;
			for(int i=0;i<4;i++)for(int s=0;s<4;s++){
				if(llist1[i].intersectsLine(llist2[s])){
					sw = true;
				}
			}
			int num = 0;
			int num2 = 0;
			for(int i=0;i<4;i++){
				for(int s=0;s<4;s++){
					num+=CCW(plist1[i], plist1[(i+1)%4], plist2[s]);
					num2+=CCW(plist2[i], plist2[(i+1)%4], plist1[s]);
				}
			}
			if(num==16||num2==16)sw=true;
			System.out.println(sw? "YES":"NO");
		}
		int CCW(Point2D a,Point2D b,Point2D target){ //a-bの直線はtargetの右か左か
			Point2D q = new Point2D.Double(b.getX()-a.getX(),b.getY()-a.getY());
			Point2D r = new Point2D.Double(target.getX()-a.getX(),target.getY()-a.getY());
			if(cross(q, r)>0)return -1;//左側
			else if(cross(q,r)<0)return 1;//右側
			else return 0;//重なっている
		}
		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY()-p1.getY()*p2.getX();
		}
	}
	
}