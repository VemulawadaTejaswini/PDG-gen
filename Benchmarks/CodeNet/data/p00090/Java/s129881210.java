import java.awt.geom.Point2D;
import java.util.Scanner;

public class Main{
	static double eps = 0.0000000001;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			Point2D.Double[] p = new Point2D.Double[n];
			for(int i = 0; i < n; i++) {
				String[] s = sc.next().split(",");
				double x = Double.parseDouble(s[0]);
				double y = Double.parseDouble(s[1]);
				p[i] = new Point2D.Double(x, y);
			}
			int max = 0;
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					Point2D.Double[] t = CircleCross.getCross(p[i], p[j]);
					if(t == null) continue;
					boolean flag = false;
					if(t.length == 2) flag = true;
					int cnt1 = 0;
					int cnt2 = 0;
					for(int k = 0; k < n; k++) {
						if (Point2D.Double.distance(t[0].getX(), t[0].getY(), p[k].getX(), p[k].getY()) -1.0 <= 10e-6) {
                            cnt1++;
                        }
						if (flag && Point2D.Double.distance(t[1].getX(), t[1].getY(), p[k].getX(), p[k].getY()) -1.0 <= 10e-6) {
                            cnt2++;
                        }
					}
					max = Math.max(max, cnt1);
					max = Math.max(max, cnt2);
				}
			}
			System.out.println(max);
		}
		sc.close();
	}
}

class CircleCross {
static double DIF = 10e-6;
    public static Point2D.Double[] getCross(Point2D.Double p1, Point2D.Double p2) {
        Point2D.Double[]  cRet = null;
        if (p1 != null && p2 != null) {
            double  length = p1.distance(p2);
            if (length <= DIF) {
                cRet    = new Point2D.Double[1];
                cRet[0] = new Point2D.Double(p1.x, p1.y);
            } else if (length <= 2.0 + DIF) {
                double  theta = Math.atan2(p2.y - p1.y, p2.x - p1.x);
                double  alpha = Math.acos(length / 2.0);

                cRet    = new Point2D.Double[2];
                cRet[0] = new Point2D.Double(p1.x + Math.cos(theta + alpha), p1.y + Math.sin(theta + alpha));
                cRet[1] = new Point2D.Double(p1.x + Math.cos(theta - alpha), p1.y + Math.sin(theta - alpha));
            }
        }

        return cRet;
    }
}
