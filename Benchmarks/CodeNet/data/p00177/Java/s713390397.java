import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			double t1 = sc.nextDouble();
	        double s1 = sc.nextDouble();
	        double t2 = sc.nextDouble();
	        double s2 = sc.nextDouble();
	        if (t1 == -1 && s1 == -1 && t2 == -1 && s2 == -1) return;
			double r = 6378.1;
			double[] p = pr(t1,s1);
			double[] q = pr(t2,s2);
			double a = p[0] * q[0] + p[1] * q[1] + p[2] * q[2];
			double c = Math.acos(a);
	        double ans = r * c;
	        System.out.printf("%d\n", (int)(ans + 0.5));
		}
	}
	
	static double[] pr(double a, double b) {
		double x = Math.cos(b / 180.0 * Math.PI) * Math.cos(a / 180.0 * Math.PI);
        double y = Math.sin(b / 180.0 * Math.PI) * Math.cos(a / 180.0 * Math.PI);
        double z = Math.sin(a / 180.0 * Math.PI);
        return new double[]{x, y, z};
	}
	

}