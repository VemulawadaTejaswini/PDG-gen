import java.io.*;

public class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String t[], s;
			double x[] = new double[8];
			while((s = reader.readLine()) != null) {
				t = s.split(" ");
				for(int i = 0;i < 8;i++) {
					x[i] = Double.parseDouble(t[i]);
				}
				Point x1 = new Point(x[0], x[1]);
				Point x2 = new Point(x[2], x[3]);
				Point x3 = new Point(x[4], x[5]);
				Point z = new Point(x[6], x[7]);
				if(z.isLeft(x1, x2) && z.isLeft(x2, x3) && z.isLeft(x3, x1)
						|| z.isLeft(x1, x3) && z.isLeft(x3, x2) && z.isLeft(x2, x1)
						|| z.isLeft(x2, x1) && z.isLeft(x1, x3) && z.isLeft(x3, x2)
						|| z.isLeft(x2, x3) && z.isLeft(x3, x1) && z.isLeft(x1, x2)
						|| z.isLeft(x3, x1) && z.isLeft(x1, x2) && z.isLeft(x2, x3)
						|| z.isLeft(x3, x2) && z.isLeft(x2, x1) && z.isLeft(x1, x3))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
class Point {
	double x, y;
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	boolean isLeft(Point p, Point q) {
		double x1, x2, y1, y2, s;
		x1 = this.x-p.x;
		y1 = this.y-p.y;
		x2 = q.x-p.x;
		y2 = q.y-p.y;
		s = signedArea(x2, y2, x1, y1);
		return s>0.0;
	}
	double signedArea(double x1, double y1, double x2, double y2) {
		return x1 * y2 - x2 * y1;
	}
}