
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i ++){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double p = ((y1-y3)*(y1*y1 -y2*y2 +x1*x1 -x2*x2) -(y1-y2)*(y1*y1 -y3*y3 +x1*x1 -x3*x3)) / (2*(y1-y3)*(x1-x2)-2*(y1-y2)*(x1-x3));
			double q = ((x1-x3)*(x1*x1 -x2*x2 +y1*y1 -y2*y2) -(x1-x2)*(x1*x1 -x3*x3 +y1*y1 -y3*y3)) / (2*(x1-x3)*(y1-y2)-2*(x1-x2)*(y1-y3));		
			double r = Math.sqrt((x1-p)*(x1-p)+(y1-q)*(y1-q));
			System.out.println(String.format("%.3f %.3f %.3f",p,q,r));
		}
	}
}