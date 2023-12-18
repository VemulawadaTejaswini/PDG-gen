import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextDouble()) {
			Rectangle r1 = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			Rectangle r2 = new Rectangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			
			if(r1.hasIntersection(r2)) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}
	
}

class Rectangle{
	Point ld;
	Point lu;
	Point rd;
	Point ru;
	
	Rectangle(double ldx, double ldy, double rux, double ruy){
		this.ld = new Point(ldx, ldy);
		this.ru = new Point(rux, ruy);
		this.lu = new Point(ldx, ruy);
		this.rd = new Point(rux, ldy);
		
	}
	
	boolean inThisRectangle(Point p) {
		if(ld.x <= p.x && p.x <= ru.x && ld.y <= p.y && p.y <= ru.y) return true;
		else return false;
	}
	
	boolean hasIntersection(Rectangle r) {
		if(inThisRectangle(r.ld) || inThisRectangle(r.lu) || inThisRectangle(r.rd) || inThisRectangle(r.ru)) return true;
		else if(r.inThisRectangle(this.ld) || r.inThisRectangle(this.lu) || r.inThisRectangle(this.rd) || r.inThisRectangle(ru)) return true;
		else return false;
	}
	
	class Point{
		double x;
		double y;
		Point(double x, double y){
			this.x = x;
			this.y = y;
		}
	}
}