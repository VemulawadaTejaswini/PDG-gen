import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();

		Point a, b;

		a = new Point();

		b = new Point();

		a.x = 0;

		a.y = 0;

		b.x = 100;

		b.y = 0;

		System.out.println(a.x+" "+a.y);

		koch(n,a,b);

		System.out.println(b.x+" "+b.y);

	}

	static void koch(double n, Point a, Point b) {

		if(n==0) return;

		Point s, t, u;

		s = new Point();

		t = new Point();

		u = new Point();

		double th = Math.PI*60.0/180.0;

		s.x = (2.0*a.x + 1.0*b.x) / 3.0;

		s.y = (2.0*a.y + 1.0*b.y) / 3.0;

		t.x = (1.0*a.x + 2.0*b.x) / 3.0;

		t.y = (1.0*a.x + 2.0*b.y) / 3.0;

		u.x = (t.x-s.x)*Math.cos(th) - (t.y-s.y)*Math.sin(th) + s.x;

		u.y = (t.x-s.x)*Math.sin(th) + (t.y-s.y)*Math.cos(th) + s.y;

		koch(n-1,a,s);

		System.out.println(s.x+" "+s.y);

		koch(n-1, s, u);

		System.out.println(u.x+" "+u.y);

		koch(n-1,u,t);

		System.out.println(t.x+" "+t.y);

		koch(n-1,t,b);

		return;
	}

	static class Point{

		double x, y;
	}
}

