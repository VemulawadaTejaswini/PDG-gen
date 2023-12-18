import java.awt.geom.*;
import java.util.*;

public class Main {
	final double EPS = 1.0e-08;
	
	private double getR(double dis, int h){
		if(dis > (double) h)
			return (double)(dis * dis + h * h) / (2 * h);
		else
			return dis;
	}
	
	private double getD(Point2D a,Point2D b,Point2D c){
		Point2D ba = getV(b, a);
		Point2D ca = getV(c, a);
		Point2D ab = getV(a, b);
		Point2D cb = getV(c, b);
		double result;
		if(getDot(ba, ca) < EPS)
			result = a.distance(c);
		else if(getDot(ab,cb) < EPS)
			result = c.distance(b);
		else{
			result = Math.abs(getCross(ba,ca)) / b.distance(a);
			//System.out.print("A = " + result + " ");
		}
		return result;
	}
	
	private Point2D getV(Point2D a, Point2D b){
		Point2D ab = new Point2D.Double(a.getX() - b.getX(), a.getY() - b.getY());
		return ab;
	}
	private double getDot(Point2D a, Point2D b){
		return (a.getX() * b.getX() + a.getY() * b.getY());
	}
	
	private double getCross(Point2D a, Point2D b){
		return (a.getX() * b.getY() - a.getY() * b.getX());
	}
	
	private boolean check(Point2D p1, Point2D p2,Point2D p3){
		boolean flg1 = p1.getX() - p3.getX() <= EPS;
		boolean flg2 = p3.getX() - p2.getX() <= EPS;
		boolean flg3 = p1.getX() - p3.getX() <= EPS;
		boolean flg4 = p3.getY() - p2.getY() <= EPS;
		if(flg1 && flg2 && flg3 && flg4){
			return true;
		}
		else{
			return false;
		}
	}
	
	private void doit() {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0 )	break;
			int sx = sc.nextInt();
			int sy = sc.nextInt();
			int ex = sc.nextInt();
			int ey = sc.nextInt();
			Point2D cp1 = new Point2D.Double((double) sx, (double) sy);
			Point2D cp2 = new Point2D.Double((double) ex, (double) ey);
			Line2D  cLine = new Line2D.Double(cp1, cp2);
			double ansR = 1001.0;
			int [] input = new int[4];
			for(int i =0; i < n; i++){
				for(int j =0; j < 4; j++){
					input[j] = sc.nextInt();
				}
				int h = sc.nextInt();
				Point2D [] pList = new Point2D[4];
				pList[0]= new Point2D.Double(input[0], input[1]);
				pList[1]= new Point2D.Double(input[0], input[3]);
				pList[2]= new Point2D.Double(input[2], input[3]);
				pList[3]= new Point2D.Double(input[2], input[1]);
				double minDis = 10001.0;
				for(int j =0; j < 4; j++){
					Line2D nowLine = new Line2D.Double(pList[j], pList[(j+1)%4]);
					double result;
					if(nowLine.intersectsLine(cLine)){
						result = 0.0;
					}
					else if(check(pList[0], pList[2], cp1) && check(pList[0], pList[2], cp2)){
						result = 0.0;
					}
					else{
						double result1 = getD(pList[j], pList[(j+1) % 4] , cp1);
						double result2 = getD(pList[j] , pList[(j+1)%4], cp2);
						double result3 = getD(cp1, cp2, pList[j]);
						//System.out.println(result1 + " res1  res2 " + result2 + " res3 " +result3);
						//System.out.println(pList[j].toString());
						result = Math.min(result1, Math.min(result2, result3));
					}
					//System.out.println(result + " result  minDis " + minDis);
					minDis = Math.min(minDis, result);
				}
				//calc R
				double resultR = getR(minDis, h);
				//System.out.println(minDis + " mindis resultR "+ resultR+" ans " + ansR);
				ansR = Math.min(ansR, resultR);
			}
			//System.out.print("ANS=");
			System.out.printf("%1.10f\n",ansR);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}