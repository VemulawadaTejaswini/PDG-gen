import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1,x2,x3,y1,y2,y3;
		double px,py,r;
		double xa,xb,ya,yb,d1,d2,s;
		int temp=scan.nextInt();;

		for(int i=0;i<temp;i++){
		x1=scan.nextDouble();
		y1=scan.nextDouble();
		x2=scan.nextDouble();
		y2=scan.nextDouble();
		x3=scan.nextDouble();
		y3=scan.nextDouble();
		xa=x1-x2;
		xb=x1-x3;
		ya=y1-y2;
		yb=y1-y3;
		d1=xa*xa+ya*ya;
		d2=xb*xb+yb*yb;
		s=xa*yb-xb*ya;
		px=-(yb*d1-ya*d2)/(2*s);
		py=(xb*d1-xa*d2)/(2*s);
		r=Math.hypot(px-x1, py-y1);
		System.out.printf("%.3f %.3f %.3f\n",px,py,r);
		}
	}

}