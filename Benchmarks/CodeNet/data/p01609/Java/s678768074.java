import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
	static final double EPS = 1e-8;
	
	void run(){
		Scanner in = new Scanner(System.in);
		double W = in.nextDouble(), H = in.nextDouble();
		int N = in.nextInt();
		double[] as = new double[N], ps = new double[N], qs = new double[N];
		for (int i = 0; i < as.length; i++) {
			as[i] = in.nextDouble();
			ps[i] = in.nextDouble();
			qs[i] = in.nextDouble();
		}
		ArrayList<Double> crs = new ArrayList<Double>();
		crs.add(0.0);
		crs.add(W);
		for (int i = 0; i < N; i++) {
			addPoint(crs, as[i], ps[i], qs[i], 0, 0, 0);
			for (int j = 0; j < i; j++) {
				addPoint(crs, as[i], ps[i], qs[i], as[j], ps[j], qs[j]);
			}
		}

		Collections.sort(crs);
		double ans = 0.0;
		for (int i = 0; i + 1 < crs.size(); i++) {
			double x1 = crs.get(i), x2 = crs.get(i+1);
			if (x1 < 0 || W < x2 || x2 < x1 + EPS) {
				continue;
			}
			int key = -1;
			double maxi = -1.0;
			for (int j = 0; j < N; j++) {
				double y = as[j] * sq((x1 + x2)/2.0 - ps[j]) + qs[j];
				if (y > maxi) {
					key = j;
					maxi = y;
				}
			}
			if (key == -1 || maxi < -EPS) {
				continue;
			}
			ans += calcIntegral(x1, x2, as[key], ps[key]);
		}
		System.out.printf("%.13f\n", ans);
	}

	double calcIntegral(double x1, double x2, double a, double p) {
		double ans = 0.0;
		final int ITER = 10000;
		double d = (x2 - x1) / ITER;
		for (int i = 0; i < ITER; i++) {
			ans += d / 2.0 *(func(x1+i*d, a, p) + func(x1+(i+1)*d, a, p));
		}
		return ans;
	}

	double func(double x, double a, double p) {
		return Math.sqrt(1 + sq(2*a*(x-p)));
	}

	void addPoint(ArrayList<Double> crs, double a1, double p1, double q1,
			double a2, double p2, double q2) {
		double a = a1 - a2, b = -2*a1*p1 + 2*a2*p2, c = a1*sq(p1)+q1 - a2*sq(p2)-q2;
		double d = b*b - 4*a*c;
		if (Math.abs(a) > EPS) {
			if (Math.abs(d) < EPS) {
				crs.add(-b/(2*a));
			} else if (d > 0) {
				crs.add( (-b - Math.sqrt(d)) / (2*a) );
				crs.add( (-b + Math.sqrt(d)) / (2*a) );
			}
		} else if (Math.abs(b) > EPS) {
			crs.add(-c / b);
		}
	}

	double sq(double x) {
		return x * x;
	}

	public static void main(String args[]){
		new Main().run();
	}
}