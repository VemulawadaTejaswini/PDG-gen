
import java.util.Scanner;

class Circle{
	double north, south, west, east;
	public Circle(double x, double y, double r) {
		north = y+r;
		south = y-r;
		west = x-r;
		east = x+r;
	}
	
	boolean isInside(Circle that){
		return 
				this.north < that.north &&
				this.south > that.south &&
				this.east < that.east &&
				this.west > that.west;
	}
	
	boolean isDoubling(Circle that){
		boolean vertical = false, horizon = false;		
		if(isMiddle(south, that.north, north)) vertical = true;
		if(isMiddle(south, that.south, north)) vertical = true;
		if(isMiddle(west, that.east, east)) horizon = true;
		if(isMiddle(west, that.west, east)) horizon = true;
		
		if(isMiddle(that.south, north, that.north)) vertical = true;
		if(isMiddle(that.south, south, that.north)) vertical = true;
		if(isMiddle(that.west, east, that.east)) horizon = true;
		if(isMiddle(that.west, west, that.east)) horizon = true;
		
		return vertical && horizon;
	}
	
	//  a <= b <=c
	private boolean isMiddle(double a, double b, double c){
		return a <= b && b <=c;
	}
	
	@Override
	public String toString() {
		return north+" "+ east+" "+south+" "+west;
	}
}

public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		for(int i = 0; i < n; i++){
			Circle A = new Circle(sn.nextDouble(), sn.nextDouble(), sn.nextDouble());
			Circle B = new Circle(sn.nextDouble(), sn.nextDouble(), sn.nextDouble());
			if(B.isInside(A)) System.out.println(2);
			else if(A.isInside(B)) System.out.println(-2);
			else if(A.isDoubling(B)) System.out.println(1);
			else System.out.println(0);
		}
	}
}