import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			double[]p0 = new double[2];
			double[]p1 = new double[2];
			double[]p2 = new double[2];
			double[]p3 = new double[2];
			p0[0] = scan.nextInt();
			p0[1] = scan.nextInt();
			p1[0] = scan.nextInt();
			p1[1] = scan.nextInt();
			p2[0] = scan.nextInt();
			p2[1] = scan.nextInt();
			p3[0] = scan.nextInt();
			p3[1] = scan.nextInt();
			double[]h1 = project(p0, p1, p2);
			double[]h2 = project(p0, p1, p3);
			double d1 = Math.sqrt(norm(vec(p2, h1)));
			double d2 = Math.sqrt(norm(vec(p3, h2)));
			double t = d1 / (d1 + d2);
			double[]u = vec(p2, p3);
			double x = u[0] * t + p2[0];
			double y = u[1] * t + p2[1];
			//double[]p = getCrossPoint(p0, p1, p2, p3);
			System.out.println(x + " " + y);
		}
		scan.close();
	}
	static double[] getCrossPoint(double[]p1, double[]p2, double[]p3, double[]p4) {
		double[]base = vec(p3, p4);
		double d1 = Math.sqrt(Math.abs(cross(base, vec(p3, p1))));
		double d2 = Math.sqrt(Math.abs(cross(base, vec(p3, p2))));
		double t = d1 / (d1 + d2);
		double[]p = {p1[0] + (p3[0] - p1[0]) * t, p1[1] + (p3[1] - p1[1]) * t};
		return p;
	}
	static double[] project(double[]p1, double[]p2, double[]p3) {
		double[]base = vec(p1, p2);
		double[]u = vec(p1, p3);
		double r = dot(u, base) / norm(base);
		double x = p1[0] + base[0]  * r;
		double y = p1[1] + base[1]  * r;
		double[]h = {x, y};
		return h;
	}
	static double norm(double[]p) {
		return p[0] * p[0] + p[1] * p[1];
	}
	static double[] vec(double[]p1, double[]p2) {
		double[]u = {p2[0] - p1[0], p2[1] - p1[1]};
		return u;
	}
	static double dot(double[]u, double[]v) {
		return u[0] * v[0] + u[1] * v[1];
	}
	static double cross(double[]u, double[]v) {
		return u[0] * v[1] - u[1] * v[0];
	}
}
