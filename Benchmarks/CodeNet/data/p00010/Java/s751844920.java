import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++) {
			double a1 = in.nextDouble();
			double a2 = in.nextDouble();
			double b1 = in.nextDouble();
			double b2 = in.nextDouble();
			double c1 = in.nextDouble();
			double c2 = in.nextDouble();
			double A = (Math.pow(b1,2)+Math.pow(b2,2)-Math.pow(a1,2)-Math.pow(a2,2))*(c2-a2);
			double B = (Math.pow(c1,2)+Math.pow(c2,2)-Math.pow(a1,2)-Math.pow(a2,2))*(b2-a2);
			double C = (b1-a1)*(c2-a2)-(c1-a1)*(b2-a2);
			double p = (A-B)/2/C;
			double AA = (Math.pow(b1,2)+Math.pow(b2,2)-Math.pow(a1,2)-Math.pow(a2,2))*(c1-a1);
			double BB = (Math.pow(c2,2)+Math.pow(c1,2)-Math.pow(a2,2)-Math.pow(a1,2))*(b2-a1);
			double CC = (b2-a2)*(c1-a1)-(c2-a2)*(b1-a1);
			double q = (AA-BB)/2/CC;
			double r = Math.sqrt(Math.pow(a1-p,2) + Math.pow(a2-q,2));
			System.out.printf("%.3f %.3f %.3f\n", Math.abs(p), Math.abs(q), r);
		}
	}
}