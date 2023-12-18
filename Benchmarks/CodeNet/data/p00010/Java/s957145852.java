import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1,x2,x3,y1,y2,y3;
		double px,py,r;
		double xa,xb,ya,yb,da,db,s;
		int temp=scan.nextInt();;

		for(int i=0;i<temp;i++){
		x1=scan.nextDouble();
		y1=scan.nextDouble();
		x2=scan.nextDouble();
		y2=scan.nextDouble();
		x3=scan.nextDouble();
		y3=scan.nextDouble();

		xa=x2-x1;
		xb=x3-x1;
		ya=y2-y1;
		yb=y3-y1;

		da=(xa*xa)+(ya*ya);
		db=(xb*xb)+(yb*yb);
		s=(xa*yb)-(xb*ya);

		px=-((ya*db)-(yb*da))/(2*s);
		py=-((xb*da)-(xa*db))/(2*s);

		px+=x1;
		py+=y1;

		r=Math.hypot(px-x1, py-y1);
		System.out.printf("%.3f %.3f %.3f\n",px,py,r);
		}
	}

}