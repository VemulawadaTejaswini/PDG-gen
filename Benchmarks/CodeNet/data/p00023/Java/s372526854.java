import java.util.Scanner;

public class Main
 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0; i < count; i++){
			Circle a = new Circle(sc.nextDouble(),
					sc.nextDouble(), sc.nextDouble());
			Circle b = new Circle(sc.nextDouble(),
					sc.nextDouble(), sc.nextDouble());
			System.out.println(a.isInclude(b));
		}
		sc.close();
	}
	
	public static class Circle{
		private Point p;
		private double r;
		
		public Circle(double x, double y, double r){
			this(new Point(x,y), r);
		}
		public Circle(Point p, double r){
			this.p = p;
			this.r = r;
		}
		
		public Point getCenter(){return p;}
		public double getRadius(){return r;}
		
		public int isInclude(Circle c){
			double dist = this.p.distance(c.getCenter());
			if (this.r > dist + c.getRadius() ){
				return 2;
			}else if(c.getRadius() > dist + this.r){
				return -2;
			}else if(this.r + c.getRadius() >= dist){
				return 1;
			}else if(this.r + c.getRadius() < dist){
				return 0;
			}
			return -3;
		}
	}
	
	public static class Point{
		private double x,y;
		
		public Point(double x, double y){
			this.x = x;
			this.y = y;
		}
		public double getX(){return x;}
		public double getY(){return y;}
		
		public double distance(Point t){
			return Math.sqrt(
					Math.pow((this.x - t.getX()), 2)
					+Math.pow((this.y - t.getY()), 2));
		}
		
		public static double distance(Point a, Point b){
			return a.distance(b);
		}
	}
}