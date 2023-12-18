import java.util.*;
import java.awt.geom.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Point2D[] p = new Point2D[n];

			for(int i=0;i<n;i++){
				String[] s = sc.next().split(",");
				p[i] = new Point2D.Double(Double.parseDouble(s[0]), Double.parseDouble(s[1]));
			}

			System.out.println(p.length - convexHull(p).length);
		}
	}

	public static Point2D[] convexHull(Point2D[] ps) {        
		Arrays.sort(ps , new Comparator< Point2D >() {
				public int compare(Point2D o1, Point2D o2) {
					if(o1.getX() < o2.getX()) return -1;
					else if(o1.getX() > o2.getX()) return 1;
					else if(o1.getY() < o2.getY()) return -1;
					else if(o1.getY() > o2.getY()) return 1;
					else return 0;        
				}
			});
		int n = ps.length, k = 0;
		Point2D[] ch = new Point2D[2 * n];

		for (int i = 0; i < n; ch[k++] = ps[i++])
			while (k >= 2
						 && Line2D.relativeCCW(ch[k - 2].getX(), ch[k - 2].getY(),
																	 ch[k - 1].getX(), ch[k - 1].getY(), ps[i].getX(),
																	 ps[i].getY()) <= 0)
				k--;

		for (int i = n - 2, t = k + 1; i >= 0; ch[k++] = ps[i--])
			while (k >= t
						 && Line2D.relativeCCW(ch[k - 2].getX(), ch[k - 2].getY(),
																	 ch[k - 1].getX(), ch[k - 1].getY(), ps[i].getX(),
																	 ps[i].getY()) <= 0)
				k--;
		return Arrays.copyOf(ch, k - 1);
	}
}