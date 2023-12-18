import java.util.Scanner;

class Point{
	double x_;
	double y_;
	
	Point( double x, double y ){
		x_ = x;
		y_ = y;
	}
	
	double getDistanceFromOrigin2( ){
		return Math.sqrt( x_ * x_ + y_ * y_ );
	}
	
	double getDistanceBetweenTwoPoints2( Point q ){
		return Math.sqrt( (x_-q.x_) * (x_-q.x_) + (y_-q.y_) * (y_-q.y_) );
	}
}

public class Main {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        
		double x = sc.nextDouble();
		double y = sc.nextDouble();        
    	Point p = new Point( x, y );
        
		 x = sc.nextDouble();
		 y = sc.nextDouble();        
    	Point q = new Point( x, y );
        
    	System.out.println( p.getDistanceBetweenTwoPoints2( q ) );
    }
}
