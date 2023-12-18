import java.util.*;
class Pair
{
	double x;
	double y;
	Pair(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
}

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			String[] str = stdIn.next().split(",");
			Pair[] p = new Pair[3];
			for(int i = 0; i < 3; ++i)
			{
				p[i] = new Pair(Double.parseDouble(str[2 * i]), Double.parseDouble(str[2 * i + 1]));
			}
			if(p[0].y == p[1].y)
			{
				System.out.println(p[2].x + " " + (p[0].y - (p[2].y - p[0].y)));
			}
			else if(p[0].x == p[1].x)
			{
				System.out.println((p[0].x + (p[0].x - p[2].x)) + " " + p[2].y);
			}
			else
			{
				double a1 = (p[1].y - p[0].y) / (p[1].x - p[0].x);
				double b1 = p[0].y - a1 * p[0].x;
				double a2 = -1 / a1;
				double b2 = p[2].y - a2 * p[2].x;
				double x = (b1 - b2) / (a2 - a1);
				double y = a2 * x + b2;
				double dx = x - p[2].x;
				double dy = y - p[2].y;
				System.out.println((x + dx) + " " + (y + dy));
			}
		}
	}
}