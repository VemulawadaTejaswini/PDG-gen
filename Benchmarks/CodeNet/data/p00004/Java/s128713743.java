import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			int d = stdIn.nextInt();
			int e = stdIn.nextInt();
			int f = stdIn.nextInt();
			double x = (c * e - b * f) / (double)(a * e - b * d);
			double y = (c * d - a * f) / (double)(b * d - a * e);
			if(x == -0)
			{
				x = 0;
			}
			if(y == -0)
			{
				y = 0;
			}
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}