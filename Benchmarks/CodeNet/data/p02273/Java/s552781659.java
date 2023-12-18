import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
   public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Point2D.Double a = new Point2D.Double(0.0, 0.0);
		Point2D.Double b = new Point2D.Double(100.0, 0.0);
		
		Print(a);
		kock(n, a, b);
		Print(b);
	}
	
	public static void kock(int n, Point2D.Double p1, Point2D.Double p2){
		if(n == 0){
			return;
		}
		Point2D.Double s = new Point2D.Double();
		Point2D.Double u = new Point2D.Double();
		Point2D.Double t = new Point2D.Double();
		
		double s1 = (2.0 * p1.getX() + 1.0 * p2.getX()) / 3.0;
		double s2 = (2.0 * p1.getY() + 1.0 * p2.getY()) / 3.0;
		s.setLocation(s1, s2);
		
		double t1 = (1.0 * p1.getX() + 2.0 * p2.getX()) / 3.0;
		double t2 = (1.0 * p1.getY() + 2.0 * p2.getY()) / 3.0;
		t.setLocation(t1, t2);
		
		double u1 = (t.getX() - s.getX()) * Math.cos(Math.toRadians(60)) - (t.getY() - s.getY()) * Math.sin(Math.toRadians(60)) + s.getX();
		double u2 = (t.getX() - s.getX()) * Math.sin(Math.toRadians(60)) + (t.getY() - s.getY()) * Math.cos(Math.toRadians(60)) + s.getY();
		u.setLocation(u1, u2);
		
		kock(n - 1, p1, s);
		Print(s);
		
		kock(n - 1, s, u);
		Print(u);
		
		kock(n - 1, u, t);
		Print(t);
		
		kock(n - 1, t, p2);
	}
	
	public static void Print(Point2D.Double print){
		
		System.out.println(String.format("%.8f", print.getX()) + " " + String.format("%.8f", print.getY()));
		
	}
}