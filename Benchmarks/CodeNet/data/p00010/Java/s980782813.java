import java.util.*;

public class Main{
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double x1,x2,x3,y1,y2,y3;
		int n = stdin.nextInt();
		while( n-- > 0 ){
			x1 = sc.nextDouble(); y1 = sc.nextDouble();
			x2 = sc.nextDouble(); y2 = sc.nextDouble();
			x3 = sc.nextDouble(); y3 = sc.nextDouble();
			double[] ans = solve( 2*(x1-x2), 2*(y1-y2), x1*x1+y1*y1-(x2*x2+y2*y2), 2*(x1-x3), 2*(y1-y3), x1*x1+y1*y1-(x3*x3+y3*y3));
			System.out.printf("%.3f %.3f %.3f\n", ans[0], ans[1], Math.sqrt( Math.pow(ans[0]-x1, 2) + Math.pow(ans[1]-y1, 2) ) );
		}
	}
	static double[] solve(double a, double b, double c, double d, double e, double f){
		double[] ans = new double[2];
		ans[0] = (c*e - b*f) / (a*e - b*d) + 0.0;
		ans[1] = (a*f - c*d) / (a*e - b*d) + 0.0;
		return ans;
	}
}