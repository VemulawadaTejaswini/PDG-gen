import java.util.*;
public class Main{
	public static int intersection(Circle c1, Circle c2){
		double dis1 = Math.pow(c2.x - c1.x,2) + Math.pow(c2.y - c1.y,2);
		double dis2 = Math.pow(c1.r + c2.r,2);
		double dis3 = Math.pow(c1.r - c2.r,2);
		if(dis1 > dis2)
			return 4;
		else if(dis1 == dis2)
			return 3;
		else if(dis1 > dis3)
			return 2;
		else if(dis1 == dis3)
			return 1;
		else
			return 0;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle(sc.nextLong(),sc.nextLong(),sc.nextLong());
		Circle c2 = new Circle(sc.nextLong(),sc.nextLong(),sc.nextLong());
		System.out.println(intersection(c1,c2));
	}
}
class Circle{
	long x;
	long y;
	long r;
	Circle(long x, long y, long r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
}
