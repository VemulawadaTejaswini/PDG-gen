import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	int n;
	double[] x;
	double[] y;

	void run() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			x = new double[n];
			y = new double[n];
			for (int i = 0; i < n; ++i) {
				x[i] = sc.nextDouble();
				y[i] = -sc.nextDouble();
			}
			solver();
		}
	}

	@SuppressWarnings("unchecked")
	void solver() throws FileNotFoundException {
		ArrayList<Double> cand = new ArrayList<>();
		cand.add(0d);
		cand.add(Math.PI);
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i == j)
					continue;
				cand.add((Math.atan2(y[j] - y[i], x[j] - x[i]) + Math.PI * 2) % (2 * Math.PI));
				cand.addAll(f(x[i], x[j], y[i], y[j]));
			}
		}
		cand = reduct(cand);
		int sz = cand.size();
		for (int i = 0; i + 1 < sz; ++i) {
			double l = cand.get(i);
			double r = cand.get(i + 1);
			double m = h((l + r) / 2);
			cand.add(m);
		}
		cand = reduct(cand);
		double max = 0;
		double min = Double.MAX_VALUE / 16;
		double max_arg = -1, min_arg = -1;
		for (double d : cand) {
			if (d > Math.PI)
				throw new AssertionError();
			if (max < g(d)) {
				max = g(d);
				max_arg = d;
			}
			if (min > g(d)) {
				min = g(d);
				min_arg = d;
			}
		}
		System.out.println(min_arg);
		System.out.println(max_arg);
	}

	double[] pos(double a) {
		double[] pos = new double[n];
		double c = Math.cos(a);
		double s = Math.sin(a);
		for (int i = 0; i < n; ++i) {
			pos[i] = s * x[i] - c * y[i];
		}
		Arrays.sort(pos);
		return pos;
	}

	double h(double a) {
		double[] pos = pos(a);
		int[] coe = new int[n];
		for (int i = 0; i < n; ++i) {
			if (i + 1 < n && pos[i + 1] - pos[i] <= 2) {
				--coe[i];
			}
			if (i - 1 >= 0 && pos[i] - pos[i - 1] <= 2) {
				++coe[i];
			}
		}
		double A = 0, B = 0;
		for (int i = 0; i < n; ++i) {
			A += x[i] * coe[i];
			B += y[i] * coe[i];
		}
		return f(A, B);
	}

	double g(double a) {
		double[] pos = pos(a);
		double ret = 2;
		for (int i = 0; i + 1 < n; ++i) {
			if (pos[i + 1] - pos[i] > 2) {
				ret += 2;
			} else {
				ret += pos[i + 1] - pos[i];
			}
		}
		return ret;
	}

	ArrayList<Double> f(double x1, double y1, double x2, double y2) {
		ArrayList<Double> ret = new ArrayList<>();
		double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		double shift = Math.atan2(1, d / 2);
		double theta = Math.atan2(y1 - y2, x1 - x2);
		ret.add((shift + theta + 4 * Math.PI) % (2 * Math.PI));
		ret.add((-shift + theta + 4 * Math.PI) % (2 * Math.PI));
		return ret;
	}

	double f(double A, double B) {
		if (A < 0) {
			A *= -1;
			B *= -1;
		}
		double ret = Math.atan2(A, -B);
		if (!(0 <= ret && ret <= Math.PI)) {
			throw new AssertionError();
		}
		return ret;
	}

	ArrayList<Double> reduct(ArrayList<Double> lis) {
		Collections.sort(lis);
		for (int i = 0; i < lis.size(); ++i) {
			if (lis.get(i) > Math.PI) {
				lis.remove(i);
				--i;
			}
		}
		for (int i = 0; i < lis.size(); ++i) {
			while (i + 1 < lis.size() && lis.get(i + 1) - lis.get(i) < 1e-13) {
				lis.remove(i + 1);
			}
		}
		return lis;
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}