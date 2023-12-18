import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

	static int n;
	static double[] x1, y1, x2, y2;
	static double sx, sy, gx, gy;
	static Point[][] seg;
	static ArrayList<Integer>[] g;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Point> ps = new ArrayList<>();
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			x1 = new double[n];
			y1 = new double[n];
			x2 = new double[n];
			y2 = new double[n];
			seg = new Point[n][2];
			for (int i = 0; i < n; ++i) {
				x1[i] = sc.nextDouble();
				y1[i] = sc.nextDouble();
				x2[i] = sc.nextDouble();
				y2[i] = sc.nextDouble();
				Point p1 = new Point(x1[i], y1[i]);
				Point p2 = new Point(x2[i], y2[i]);
				ps.add(p1);
				ps.add(p2);
				seg[i] = new Point[] { p1, p2 };
			}
			sx = sc.nextDouble();
			sy = sc.nextDouble();
			gx = sc.nextDouble();
			gy = sc.nextDouble();
			seg = merge(seg);
			n = seg.length;
			for (int i = 0; i < n; ++i) {
				for (int j = i + 1; j < n; ++j) {
					if (linesIntersect(seg[i][0], seg[i][1], seg[j][0], seg[j][1])) {
						Point p = crossPoint(seg[i][0], seg[i][1], seg[j][0], seg[j][1]);
						ps.add(p);
					}
				}
			}

			Collections.sort(ps);
			for (int i = 0; i < ps.size(); ++i) {
				while (i + 1 < ps.size() && Math.abs(ps.get(i).x - ps.get(i + 1).x) < 1e-6
						&& Math.abs(ps.get(i).y - ps.get(i + 1).y) < 1e-6) {
					ps.remove(i + 1);
				}
			}

			int N = ps.size();
			g = new ArrayList[N];
			for (int i = 0; i < N; ++i)
				g[i] = new ArrayList<>();

			for (int i = 0; i < N; ++i)
				ps.get(i).id = i;
			for (int i = 0; i < n; ++i) {
				ArrayList<Point> tmp = new ArrayList<>();
				for (Point p : ps) {
					if (ccw(seg[i][0], seg[i][1], p) == 0) {
						tmp.add(p);
					}
				}
				Collections.sort(tmp);
				for (int j = 0; j + 1 < tmp.size(); ++j) {
					g[tmp.get(j).id].add(tmp.get(j + 1).id);
					g[tmp.get(j + 1).id].add(tmp.get(j).id);
				}
			}

			int srcId = -1;
			int dstId = -1;
			for (int i = 0; i < N; ++i) {
				if ((Math.abs(ps.get(i).x - sx) + Math.abs(ps.get(i).y - sy)) < 1e-6) {
					srcId = i;
				}
				if ((Math.abs(ps.get(i).x - gx) + Math.abs(ps.get(i).y - gy)) < 1e-6) {
					dstId = i;
				}
			}

			double[][] dist = new double[N][N];
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					dist[i][j] = Double.MAX_VALUE / 10;
				}
			}

			PriorityQueue<State> pq = new PriorityQueue<>();
			for (int dst : g[srcId]) {
				pq.add(new State(srcId, dst, 0));
				dist[srcId][dst] = 0;
			}
			while (!pq.isEmpty()) {
				State s = pq.poll();
				for (int dst : g[s.dst]) {
					double angle = angle(ps.get(s.src), ps.get(s.dst), ps.get(s.dst), ps.get(dst));
					if (dist[s.dst][dst] > s.cost + angle) {
						dist[s.dst][dst] = s.cost + angle;
						pq.add(new State(s.dst, dst, s.cost + angle));
					}
				}
			}

			double ans = Double.MAX_VALUE / 10;
			for (int i = 0; i < N; ++i) {
				ans = Math.min(ans, dist[i][dstId]);
			}
			if (ans >= Double.MAX_VALUE / 10) {
				System.out.println(-1);
			} else {
				ans /= Math.PI;
				ans *= 180;
				System.out.println(ans);
			}
		}
	}

	static class Point implements Comparable<Point> {
		double x, y;
		int id;

		public Point(double x1, double y1) {
			this.x = x1;
			this.y = y1;
		}

		double norm(Point p) {
			double dx = x - p.x;
			double dy = y - p.y;
			return Math.sqrt(dx * dx + dy * dy);
		}

		void show() {
			System.out.println("x:" + x + " y:" + y);
		}

		@Override
		public int compareTo(Point o) {
			if (x != o.x)
				return Double.compare(x, o.x);
			else
				return Double.compare(y, o.y);
		}
	}

	static class State implements Comparable<State> {
		int src, dst;
		double cost;

		public State(int src, int dst, double cost) {
			this.src = src;
			this.dst = dst;
			this.cost = cost;
		}

		public int compareTo(State o) {
			return Double.compare(cost, o.cost);
		};
	}

	static Point crossPoint(Point s1, Point d1, Point s2, Point d2) {
		double[][] mx = { { d1.x - s1.x, -(d2.x - s2.x) }, { d1.y - s1.y, -(d2.y - s2.y) } };
		double[] v = { -s1.x + s2.x, -s1.y + s2.y };
		double[][] rev = { { mx[1][1], -mx[0][1] }, { -mx[1][0], mx[0][0] } };
		double determinent = mx[0][0] * mx[1][1] - mx[0][1] * mx[1][0];
		if (determinent == 0) {
			return s1;
		}
		rev[0][0] /= determinent;
		rev[0][1] /= determinent;
		rev[1][0] /= determinent;
		rev[1][1] /= determinent;
		double[] coe = mulVec(rev, v);
		Point p = new Point((1 - coe[0]) * s1.x + coe[0] * d1.x, (1 - coe[0]) * s1.y + coe[0] * d1.y);
		return p;
	}

	static double[] mulVec(double[][] mx, double[] v) {
		double[] retVec = new double[2];
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 2; ++j) {
				retVec[i] += mx[i][j] * v[j];
			}
		}
		return retVec;
	}

	static double[][] mul(double[][] m1, double[][] m2) {
		double[][] ret = new double[2][2];
		for (int i = 0; i < 2; ++i) {
			for (int j = 0; j < 2; ++j) {
				for (int k = 0; k < 2; ++k) {
					ret[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return ret;
	}

	static boolean linesIntersect(Point s1, Point d1, Point s2, Point d2) {
		long prd1 = ccw(s1, d1, d2) * ccw(s1, d1, s2);
		long prd2 = ccw(s2, d2, s1) * ccw(s2, d2, d1);
		return prd1 <= 0 && prd2 <= 0;
	}

	static long ccw(Point s, Point d, Point p) {
		double cp = crossProduct(s, d, s, p);
		if (Math.abs(cp) > 1e-6)// cp!=0
			return Double.compare(cp, 0);
		else {
			if (dotProduct(s, d, s, p) < 0)
				return -2;
			else if (dotProduct(d, s, d, p) < 0)
				return 2;
			else
				return 0;
		}
	}

	static double angle(Point s1, Point d1, Point s2, Point d2) {
		double dotprd = dotProduct(s1, d1, s2, d2);
		dotprd /= s1.norm(d1);
		dotprd /= s2.norm(d2);
		if (Math.abs(dotprd) > 1 && Math.abs(dotprd) < 1 + 1e-6) {
			dotprd = Math.signum(dotprd);
		}
		double angle = Math.acos(dotprd);
		return angle;
	}

	static double crossProduct(Point s1, Point d1, Point s2, Point d2) {
		return (d1.x - s1.x) * (d2.y - s2.y) - (d1.y - s1.y) * (d2.x - s2.x);
	}

	static double dotProduct(Point s1, Point d1, Point s2, Point d2) {
		return (d1.x - s1.x) * (d2.x - s2.x) + (d1.y - s1.y) * (d2.y - s2.y);
	}

	static Point[][] merge(Point[][] seg) {
		ArrayList<Point[]> tmp = new ArrayList<>();
		for (int i = 0; i < seg.length; ++i) {
			if (seg[i][0].compareTo(seg[i][1]) > 0) {
				tmp.add(new Point[] { seg[i][1], seg[i][0] });
			} else {
				tmp.add(new Point[] { seg[i][0], seg[i][1] });
			}
		}

		for (int i = 0; i < tmp.size(); ++i) {
			for (int j = i + 1; j < tmp.size(); ++j) {
				if (isSegmentOnSegment(tmp.get(i)[0], tmp.get(i)[1], tmp.get(j)[0], tmp.get(j)[1])) {
					ArrayList<Point> ps = new ArrayList<>();
					ps.add(tmp.get(i)[0]);
					ps.add(tmp.get(i)[1]);
					ps.add(tmp.get(j)[0]);
					ps.add(tmp.get(j)[1]);
					Collections.sort(ps);
					tmp.add(new Point[] { ps.get(0), ps.get(3) });
					tmp.remove(j);
					--j;
					tmp.remove(i);
					break;
				}
			}
		}
		Point[][] ret = new Point[tmp.size()][2];
		for (int i = 0; i < tmp.size(); ++i) {
			ret[i] = tmp.get(i);
		}
		return ret;

	}

	static boolean isSegmentOnSegment(Point s1, Point d1, Point s2, Point d2) {
		if (!linesIntersect(s1, d1, s2, d2)) {
			return false;
		}
		double[][] mx = { { d1.x - s1.x, -(d2.x - s2.x) }, { d1.y - s1.y, -(d2.y - s2.y) } };
		double determinent = mx[0][0] * mx[1][1] - mx[0][1] * mx[1][0];
		if (determinent == 0)
			return true;
		else
			return false;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}