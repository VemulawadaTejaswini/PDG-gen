import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
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
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i == j)
					continue;
				cand.add(f(-(y[i] - y[j]), (x[i] - x[j]), 0));
				double u = cand.get(cand.size() - 1);
				cand.add(h(u + 1e-10));
				cand.add(h(u - 1e-10));
				if ((x[i] - x[j] * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) <= 2 * 2)) {
					cand.add(f(-(y[i] - y[j]), (x[i] - x[j]), 2));
					u = cand.get(cand.size() - 1);
					cand.add(h(u + 1e-10));
					cand.add(h(u - 1e-10));
				}
			}
		}
		for (int i = 0; i < cand.size(); ++i) {
			if (cand.get(i) > Math.PI) {
				cand.remove(i);
				--i;
			}
		}
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
		return f(A, B, 0);
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

	double f(double A, double B, double C) {
		if (A < 0) {
			B *= -1;
			A *= -1;
			C *= -1;
		}
		double tmp = Math.sqrt(A * A + B * B);
		A /= tmp;
		B /= tmp;
		C /= tmp;
		double a = Math.asin(A);
		if (B * Math.cos(a) < 0) {
			a = (Math.PI - a);// [0,PI]
		}
		double ret = Math.asin(C) - a;// [PI/2,-3/2*PI]
		ret = (2 * Math.PI + ret) % (2 * Math.PI);
		if (ret > Math.PI) {
			ret = Math.PI - a - Math.asin(C);
		}
		// if (Math.abs(A * Math.cos(ret) + B * Math.sin(ret) - C) > 1e-6 || !(0
		// <= ret && ret <= Math.PI)) {
		//
		if (Math.abs(A * Math.cos(ret) + B * Math.sin(ret) - C) > 1e-6) {
			tr(A * Math.cos(ret) + B * Math.sin(ret), C);
			throw new AssertionError();
		}
		return ret;
	}

	private static void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
}