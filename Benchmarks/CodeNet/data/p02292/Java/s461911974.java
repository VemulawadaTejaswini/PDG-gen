import java.util.*;
public class Main{
	public static String clockwise(Vector v1, Vector v2){
		long cross = v1.x * v2.y - v1.y * v2.x;
		long value = v1.x * v2.x + v1.y * v2.y;
		long len1 = v1.x * v1.x + v1.y * v1.y;
		long len2 = v2.x * v2.x + v2.y * v2.y;
		if(cross == 0L){
			if(value < 0L)
				return "ONLINE_BACK";
			else if(len1 < len2)
				return "ONLINE_FRONT";
			else
				return "ON_SEGMENT";
		}
		else if(cross > 0L){
			return "COUNTER_CLOCKWISE";
		}
		else{
			return "CLOCKWISE";
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Point p0 = new Point(sc.nextLong(),sc.nextLong());
		Point p1 = new Point(sc.nextLong(),sc.nextLong());
		Vector v1 = new Vector(p0,p1);
		int q = sc.nextInt();
		for(int i = 0 ; i < q ; i++){
			Point p2 = new Point(sc.nextLong(),sc.nextLong());
			Vector v2 = new Vector(p0,p2);
			System.out.println(clockwise(v1,v2));
		}
	}
}
class Point{
    long x;
    long y;
    Point(long x, long y){
        this.x = x;
        this.y = y;
    }
}
class Vector{
        long x;
	long y;
	Vector(Point ps, Point pg){
		x = pg.x - ps.x;
		y = pg.y - ps.y;
	}
}
