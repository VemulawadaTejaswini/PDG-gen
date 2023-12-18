import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double A = 2*(x2 - x1);
			double B = 2*(y2 - y1);
			double C = (x1*x1)-(x2*x2)+(y1*y1)-(y2*y2);
			double A2 = 2*(x3 - x1);
			double B2 = 2*(y3 - y1);
			double C2 = (x1*x1)-(x3*x3)+(y1*y1)-(y3*y3);
			double px = (B*C2-B2*C)/(A*B2-A2*B);
			double py = (C*A2-C2*A)/(A*B2-A2*B);
			double exe = Math.hypot(x1-px,y1-py);
			System.out.printf("%.3f %.3f %.3f",round(px),round(py),round(exe));
			n--;
		}
	}
	static double round(double d){
		d = Math.round(d*1000);
		d = d/1000;
		return d;
	}
}