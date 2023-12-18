import java.util.*;

class Point{
	double x,y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	Scanner sc = new Scanner(System.in);
	public void input() {
		Point a = new Point(0.0, 0.0);
		Point b = new Point(100.0, 0.0);
		int n = sc.nextInt();
		System.out.printf("%.8f %.8f\n",a.x,a.y);
		koch(n, a, b);
		System.out.printf("%.8f %.8f\n",b.x,b.y);
	}
	public void koch(int n, Point a, Point b) {
		if(n == 0) return;
		Point s, t, u;
		
		s = new Point(0.0, 0.0);
		t = new Point(0.0, 0.0);
		u = new Point(0.0, 0.0);
		double th = Math.PI * 60.0 / 180.0;
		s.x = (2.0 * a.x + 1.0 * b.x) / 3.0;
		s.y = (2.0 * a.y + 1.0 * b.y) / 3.0;
		t.x = (1.0 * a.x + 2.0 * b.x) / 3.0;
		t.y = (1.0 * a.y + 2.0 * b.y) / 3.0;
		u.x = (t.x - s.x)*Math.cos(th) - (t.y - s.y)*Math.sin(th) + s.x;
		u.y = (t.x - s.x)*Math.sin(th) + (t.y - s.y)*Math.cos(th) + s.y;
		
		koch(n-1, a, s);
		System.out.printf("%.8f %.8f\n",s.x,s.y);
		koch(n-1, s, u);
		System.out.printf("%.8f %.8f\n",u.x,u.y);
		koch(n-1, u, t);
		System.out.printf("%.8f %.8f\n",t.x,t.y);
		koch(n-1, t, b);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
	}
}

