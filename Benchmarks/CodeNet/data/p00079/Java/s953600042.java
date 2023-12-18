import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		double x, y, xp, yp, xq, yq;
		double a, b, c, z;
		double sum = 0;
		String[] s = new String[2];
		
		s = sc.next().split(",");
		x = Double.valueOf(s[0]);
		y = Double.valueOf(s[1]);
		s = sc.next().split(",");
		xp = Double.valueOf(s[0]);
		yp = Double.valueOf(s[1]);
		b = Point2D.Double.distance(x, y, xp, yp);
		
		while(sc.hasNext()){
			s = sc.next().split(",");
			xq = xp;
			yq = yp;
			xp = Double.valueOf(s[0]);
			yp = Double.valueOf(s[1]);
			
			a = b;
			b = Point2D.Double.distance(x, y, xp, yp);
			c = Point2D.Double.distance(xp, yp, xq, yq);
			
			z = (a+b+c)/2;
			sum += Math.sqrt(z*(z-a)*(z-b)*(z-c));
		}
		System.out.println(sum);
		
	}	
}