import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b=sc.nextInt(), h=sc.nextInt(), m=sc.nextInt();
		final double ji = 0.5, fun = 6.0;
		double now_ji =ji*(h*60+m), now_fun=fun*m;
		if(now_ji==now_fun) {
			System.out.println(Math.abs(a-b));
		}else {
			double dis = Math.abs(now_ji-now_fun)*Math.PI/180;
			double ans = Math.sqrt(a*a+b*b-2*a*b*Math.cos(dis));
			System.out.printf("%.10f\n",ans);
		}
	}
}
