import java.util.Scanner;
public class Main {
	public static boolean isSyntropy(double x1,double y1,double x2,double y2,double x3,double y3,double xp,double yp) {
		if(((y3-y1)*(x3-x2)-(x3-x1)*(y3-y2))*((yp-y1)*(xp-x2)-(xp-x1)*(yp-y2))>=0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3,xp,yp;    //三角形的三个顶点坐标 进行判断的点
		while(in.hasNext()) {
			x1 = in.nextDouble();
			y1 = in.nextDouble();
			x2 = in.nextDouble();
			y2 = in.nextDouble();
			x3 = in.nextDouble();
			y3 = in.nextDouble();
			xp = in.nextDouble();
			yp = in.nextDouble();
			if(isSyntropy(x1,y1,x2,y2,x3,y3,xp,yp)&&isSyntropy(x1,y1,x3,y3,x2,y2,xp,yp)&&isSyntropy(x2,y2,x3,y3,x1,y1,xp,yp))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}
}
