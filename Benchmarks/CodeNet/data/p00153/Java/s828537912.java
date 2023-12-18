import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IN:while(true) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			double minx = x1;
			double maxx = x1;
			double miny = y1;
			double maxy = y1;
			Point2D.Double p1 = new Point2D.Double(x1, y1);
			if(x1 == 0 && y1 == 0) break;
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			minx = Math.min(x2, minx);
			miny = Math.min(y2, miny);
			maxx = Math.max(x2, maxx);
			maxy = Math.max(y2, maxy);
			Point2D.Double p2 = new Point2D.Double(x2, y2);
			int x3 = sc.nextInt();
			int y3 = sc.nextInt();
			minx = Math.min(x3, minx);
			miny = Math.min(y3, miny);
			maxx = Math.max(x3, maxx);
			maxy = Math.max(y3, maxy);
			Point2D.Double p3 = new Point2D.Double(x3, y3);
			int x4 = sc.nextInt();
			int y4 = sc.nextInt();
			minx = Math.min(x4, minx);
			miny = Math.min(y4, miny);
			maxx = Math.max(x4, maxx);
			maxy = Math.max(y4, maxy);
			Point2D.Double p4 = new Point2D.Double(x4, y4);
			int r = sc.nextInt();
			
			Line2D.Double a = new Line2D.Double(p1,p2);
			Line2D.Double b = new Line2D.Double(p1,p3);
			Line2D.Double c = new Line2D.Double(p2,p3);
			
			if(p1.distance(p4) <= r && p2.distance(p4) <= r && p3.distance(p4) <= r) {
				System.out.println("b");
				continue IN;
			}
			else if(a.ptSegDist(p4) >= r && b.ptSegDist(p4) >= r && c.ptSegDist(p4) >= r) {

				Line2D.Double da = new Line2D.Double(p1,p4);
                Line2D.Double db = new Line2D.Double(p2,p4);
                Line2D.Double dc = new Line2D.Double(p3,p4);
                if(minx<x4 && x4<maxx && miny<y4 && y4<maxy && !a.intersectsLine(da) && !b.intersectsLine(db) && !c.intersectsLine(dc)){
                    System.out.println("a");
                }
                else {
                    if(a.ptSegDist(p4) == r || b.ptSegDist(p4) == r || c.ptSegDist(p4) == r) {
                        System.out.println("c");
                    }
                    else{
                        System.out.println("d");
                    }
                }
            }
			else {
				System.out.println("c");
			}
			
			
			
		}
	}
}