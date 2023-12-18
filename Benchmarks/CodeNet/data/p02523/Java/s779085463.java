import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Point p1 = new Point();
		Point p2 = new Point();
		p1.x = sc.nextDouble();
		p1.y = sc.nextDouble();
		p2.x = sc.nextDouble();
		p2.y = sc.nextDouble();
		System.out.println(Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y)));
	}
}

class Point
{
	public double x;
	public double y;
}