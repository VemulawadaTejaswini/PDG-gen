import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Line a = new Line(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
			Line b = new Line(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
			double ret = cross(a,b);
			boolean ok = false;
			if(Math.abs(ret) < 1.0e-5) ok = true;
			System.out.println((ok)?"YES":"NO");
		}
	}
	
	static double cross(Line a, Line b) {
		return (a.p2x - a.p1x) * (b.p2y - b.p1y) - (a.p2y - a.p1y) * (b.p2x - b.p1x);
	}

	static class Line {
		double p1x;
		double p1y;
		double p2x;
		double p2y;
		Line(double a, double b, double c, double d) {
			p1x = a;
			p1y = b;
			p2x = c;
			p2y = d;
		}
	}
}