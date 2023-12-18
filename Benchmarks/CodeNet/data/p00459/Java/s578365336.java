
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(reader.readLine());
			if (n == 0)
				break;
			int m = Integer.parseInt(reader.readLine());
			StringTokenizer t = new StringTokenizer(reader.readLine());
			int p = Integer.parseInt(t.nextToken());
			int q = Integer.parseInt(t.nextToken());
			int r = Integer.parseInt(t.nextToken());
			List<Point> v = new ArrayList<Point>();
			
			v.add(new Point(1, n));
			while (m-- > 0) {
				t = new StringTokenizer(reader.readLine());
				int x = Integer.parseInt(t.nextToken());
				int y = Integer.parseInt(t.nextToken());
				List<Point> a, b, c;
				b = new ArrayList<Point>();
				c = new ArrayList<Point>();
				a = new ArrayList<Point>();
				cut(v, y, c);
				cut(v, x, b);
				a = v;
				v = c;
				v.addAll(b);
				v.addAll(a);
			}
			List<Point> rv = new ArrayList<Point>();
			cut(v, q, rv);
			cut(v, p - 1, rv);
			int ans = 0;
			for (int i = 0; i < rv.size(); i++)
				ans += Math.max(0, Math.min(r - rv.get(i).x + 1, rv.get(i).y));
			System.out.println(ans);
		}
	}
	class Point{
		int x,y;

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		
	}

	private void cut(List<Point> v, int x, List<Point> r) {
		r.clear();
		int n = 0;
		int p = 0;
		while (n + v.get(p).y <= x) {
			n += v.get(p).y;
			p++;
		}
		Point ns = new Point(v.get(p).x + x - n, v.get(p).y - (x - n));
		r.add(ns);
		for (int j = p + 1; j < v.size(); j++) {
			r.add(new Point(v.get(j).x, v.get(j).y));
		}
		for (int j = v.size() - 1; j >= p + 1; j--)
			v.remove(j);
		v.get(v.size() - 1).y = x - n;

	}
}