import java.util.*;
import java.awt.geom.Rectangle2D;

public class Main{
	private static final double EPS = 1e-10;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextDouble()){
			double x,y,w,h;
			x = sc.nextDouble()-EPS;
			y = sc.nextDouble()-EPS;
			w = sc.nextDouble()-x+EPS;
			h = sc.nextDouble()-y+EPS;
			Rectangle2D r = new Rectangle2D.Double(x,y,w,h);

			x = sc.nextDouble();
			y = sc.nextDouble();
			w = sc.nextDouble()-x;
			h = sc.nextDouble()-y;
			System.out.println(r.intersects(x,y,w,h) ? "YES" : "NO");
		}
	}
}