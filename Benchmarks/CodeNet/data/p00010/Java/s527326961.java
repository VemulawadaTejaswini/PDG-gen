import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			Point a=new Point(sc.nextDouble(),sc.nextDouble());
			Point b=new Point(sc.nextDouble(),sc.nextDouble());
			Point c=new Point(sc.nextDouble(),sc.nextDouble());
			double A=a.x-b.x;
			double B=a.y-b.y;
			double C=(a.distance2()-b.distance2())/2;
			double D=a.x-c.x;
			double E=a.y-c.y;
			double F=(a.distance2()-c.distance2())/2;
			double X=(C*E-B*F)/(A*E-B*D);
			double Y=-(C*D-A*F)/(A*E-B*D);
			Point p=new Point(X-a.x,Y-a.y);
			double r=Math.sqrt(p.distance2());
			System.out.printf("%.3f %.3f %.3f\n",X,Y,r);
		}
	}
}

class Point{
	double x,y;
	Point(double a,double b){
		x=a;
		y=b;
	}
	double distance2(){
		return x*x+y*y;
	}
}