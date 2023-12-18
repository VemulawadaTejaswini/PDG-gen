import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static ArrayList<Coordinate> list;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
        list = new ArrayList<Coordinate>();
	Coordinate p1 = new Coordinate(0, 0);
	Coordinate p2 = new Coordinate(100, 0);
	koch(n, p1, p2);
	list.add(0, p1);
	list.add(list.size(), p2);
	Coordinate c;
	for (int i = 0; i < list.size(); i++) {
	    c = list.get(i);
	    System.out.println(c.x + " " + c.y);
	}
    }
    static void koch (int n, Coordinate p1, Coordinate p2) {
	if (n == 0) {
	    return;
	}
	Coordinate s, t, u;
	double sx, sy, tx, ty, ux, uy, radian60;
	sx = (2 * p1.x + p2.x) / 3;
	sy = (2 * p1.y + p2.y) / 3;
	tx = (p1.x + 2 * p2.x) / 3;
	ty = (p1.y + 2 * p2.y) / 3;
	s = new Coordinate(sx, sy);
	t = new Coordinate(tx, ty);
	radian60 = Math.toRadians(60);
	ux = (t.x - s.x) * Math.cos(radian60) - (t.y - s.y) * Math.sin(radian60) + s.x;
	uy = (t.x - s.x) * Math.sin(radian60) + (t.y - s.y) * Math.cos(radian60) + s.y;
	u = new Coordinate(ux, uy);
	koch(n-1, p1, s);
	list.add(s);
	koch(n-1, s, u);
	list.add(u);
	koch(n-1, u, t);
	list.add(t);
	koch(n-1, t, p2);
    }

}
class Coordinate {
    double x, y;
    Coordinate (double x, double y) {
	this.x = x;
	this.y = y;
    }
}