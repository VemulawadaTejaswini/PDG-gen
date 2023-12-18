import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		for(int i = 0; i < N; i++){
			Point2D[] points = new Point2D[3];
			for(int j = 0; j < 3; j++){
				points[j] = new Point2D(sc.nextInt(), sc.nextInt());
			}
			
			Point2D start = new Point2D(sc.nextInt(), sc.nextInt());
			Point2D end = new Point2D(sc.nextInt(), sc.nextInt());
			
			int count = 0;
			
			for(int j = 0; j < 3; j++){
				int next = j + 1 >= 3 ? 0 : j + 1;
				
				if(Point2D.intersect_s(points[j], points[next], start, end)){
					count++;
				}
			}
			
			System.out.println(count % 2 == 0 ? "NG" : "OK");
		}

	}

}

class Point2D {
	public double x;
	public double y;
	
	public static final double EPS = 1e-10;
	
	public Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Point2D(Point2D point){
		this.x = point.x;
		this.y = point.y;
	}
	
	public Point2D add(double x, double y){
		return new Point2D(this.x + x, this.y + y);
	}
	
	public Point2D sub(double x, double y){
		return add(-x, -y);
	}
	
	public Point2D add(Point2D another){
		return add(another.x, another.y);
	}
	
	public Point2D sub(Point2D another){
		return sub(another.x, another.y);
	}
	
	public Point2D mul(double d){
		return new Point2D(this.x * d, this.y * d);
	}
	
	public Point2D div(double d){
		return new Point2D(this.x / d, this.y / d);
	}
	
	public double dot(double x, double y){
		return this.x * x + this.y * y; 
	}
	
	public double dot(Point2D another){
		return dot(another.x, another.y);
	}
	
	public double cross(double x, double y){
		return this.x * y - this.y * x; 
	}
	
	public double cross(Point2D another){
		return cross(another.x, another.y);
	}
	
	public double dist(double x, double y){
		return Math.sqrt((this.x - x)*(this.x - x) + (this.y - y) * (this.y * y));
	}
	
	public double dist(Point2D another){
		return dist(another.x, another.y);
	}
	
	public double dist_o(){
		return dist(0, 0);
	}
	
	public Point2D unit(){
		return div(dist_o());
	}
	
	public boolean pol(Point2D start, Point2D end){
		return end.sub(start).cross(this.sub(start)) < EPS;
	}
	
	public boolean pos(Point2D start, Point2D end){
		return (start.dist(this) + this.dist(end) < start.dist(end) + EPS);
	}
	
	public double psd(Point2D start, Point2D end){
		if(end.sub(start).dot(this.sub(start)) < EPS){
			return this.dist(start);
		}else if(start.sub(end).dot(this.sub(end)) < EPS){
			return this.dist(end);
		}else{
			return end.sub(start).cross(this.sub(start)) / end.dist(start);
		}
	}
	
	public static boolean intersect_s(Point2D a1, Point2D a2, Point2D b1, Point2D b2){
		return (a2.sub(a1).cross(b1.sub(a1)) * a2.sub(a1).cross(b2.sub(a1)) < EPS) && (b2.sub(b1).cross(a1.sub(b1)) * b2.sub(b1).cross(a2.sub(b1)) < EPS);
	}
	
	public static Point2D interpoint_s(Point2D a1, Point2D a2, Point2D b1, Point2D b2){
		Point2D b = b2.sub(b1);
		double d1 = Math.abs(b.cross(a1.sub(b1)));
		double d2 = Math.abs(b.cross(a2.sub(b1)));
		double t = d1 / (d1 + d2);
		Point2D a = a2.sub(a1), v = a.mul(t);
		return a1.add(v);
	}
	
}