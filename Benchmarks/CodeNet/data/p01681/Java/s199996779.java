import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

import javax.imageio.ImageIO;

public class Main {

	static class Vec {
		double x, y;

		public Vec(double x, double y) {
			this.x = x;
			this.y = y;
		}

		Vec add(Vec v) {
			return new Vec(x + v.x, y + v.y);
		}

		Vec subtruct(Vec v) {
			return new Vec(x - v.x, y - v.y);
		}

		double dot(Vec v) {
			return x * v.x + y * v.y;
		}

		Vec reflect(Vec l1, Vec l2) {
			Vec pl1 = l1.subtruct(this);
			Vec l1l2 = l2.subtruct(l1);
			double cos = pl1.mul(-1).dot(l1l2) / (pl1.norm() * l1l2.norm());
			if (pl1.norm() < 1e-5 || Math.abs(cos) > 1 - 1e-5)
				return this;
			Vec ret = (pl1.add(l1l2.mul(cos / l1l2.norm() * pl1.norm())).mul(2)).add(this);
			return ret;
		}

		Vec mul(double a) {
			return new Vec(a * x, a * y);
		}

		Vec normalize() {
			return new Vec(x / this.norm(), y / this.norm());
		}

		double norm() {
			return Math.sqrt(x * x + y * y);
		}

		void show() {
			System.out.println("x:" + x + " y:" + y);
		}

	}

	static int N;
	static double sx, sy;
	static double[] x, y;
	static Vec[] poly;

	public static void main(String[] args) throws Exception {
		PrintWriter pw=new PrintWriter(System.out);	
		Scanner sc = new Scanner(System.in);
		while (true) {
			N = sc.nextInt();
			if (N == 0)
				break;
			sx = sc.nextDouble();
			sy = sc.nextDouble();
			x = new double[N];
			y = new double[N];
			poly = new Vec[N];
			for (int i = 0; i < N; ++i) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				poly[i] = new Vec(x[i], y[i]);
			}
			int[] ord = new int[N];
			for (int i = 0; i < N; ++i)
				ord[i] = i;
			int ans = 0;
			Vec src = new Vec(sx, sy);
			out: do {
				Vec[][] polys = new Vec[N][N];
				polys[0] = poly;
				for (int i = 1; i < N; ++i) {
					for (int j = 0; j < N; ++j) {
						polys[i][j] = polys[i - 1][j].reflect(polys[i - 1][ord[i - 1]],
								polys[i - 1][(ord[i - 1] + 1) % N]);
					}
				}
				Vec left_al = null, right_al = null;
				for (int i = 0; i < N; ++i) {
					Vec left = chleft(polys[i][ord[i]].subtruct(src), polys[i][(ord[i] + 1) % N].subtruct(src));
					Vec right = chright(polys[i][ord[i]].subtruct(src), polys[i][(ord[i] + 1) % N].subtruct(src));
					if (i == 0) {
						left_al = left;
						right_al = right;
					} else {
						left_al = chright(left_al, left);
						right_al = chleft(right_al, right);
					}
					if (!(right_al.x * left_al.y - right_al.y * left_al.x > 0)) {
						continue out;
					}
				}

				++ans;
			} while (nextPermutatino(ord));
			pw.println(ans);
		}
		pw.close();

	}

	static Vec chleft(Vec right, Vec left) {
		if (right.x * left.y - right.y * left.x > 0) {
			return left;
		} else
			return right;
	}

	static Vec chright(Vec right, Vec left) {
		if (right.x * left.y - right.y * left.x > 0) {
			return right;
		} else
			return left;
	}

	static boolean nextPermutatino(int[] ord) {
		int i = ord.length - 1;
		while (i - 1 >= 0 && ord[i - 1] > ord[i])
			--i;
		if (i == 0)
			return false;
		int j = i;
		while (j + 1 < ord.length && ord[j + 1] > ord[i - 1])
			++j;
		int tmp = ord[i - 1];
		ord[i - 1] = ord[j];
		ord[j] = tmp;
		int s = i;
		int t = ord.length - 1;
		while (s < t) {
			tmp = ord[s];
			ord[s] = ord[t];
			ord[t] = tmp;
			++s;
			--t;
		}
		return true;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}