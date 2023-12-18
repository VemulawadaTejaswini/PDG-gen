import java.util.*;
class Point
{
	double x;
	double y;
	Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
}
public class Main 
{
	static double helon(Point p1, Point p2, Point p3)
	{
		double a = Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
		double b = Math.sqrt((p2.x - p3.x) * (p2.x - p3.x) + (p2.y - p3.y) * (p2.y - p3.y));
		double c = Math.sqrt((p3.x - p1.x) * (p3.x - p1.x) + (p3.y - p1.y) * (p3.y - p1.y));
		double s = (a + b + c) / 2;
		return(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
	}
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			List<Point> list = new ArrayList<Point>();
			for(int i = 0; i < 3; ++i)
			{
				double a = stdIn.nextDouble();
				double b = stdIn.nextDouble();
				list.add(new Point(a, b));
			}
			double a = stdIn.nextDouble();
			double b = stdIn.nextDouble();
			Point xp = new Point(a, b);
			double s1 = helon(list.get(0), list.get(1), list.get(2));
			double s2 = helon(list.get(0), list.get(1), xp);
			double s3 = helon(list.get(0), list.get(2), xp);
			double s4 = helon(list.get(1), list.get(2), xp);
			if(Math.abs(s1 - s2 - s3 - s4) < 1e-8)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}