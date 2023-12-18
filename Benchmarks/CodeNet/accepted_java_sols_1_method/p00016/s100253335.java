import java.util.*;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int d, t;
		double x = 0, y = 0;
		double angle = 90;
		while(true)
		{
			String[] s = stdIn.next().split(",");
			d = Integer.parseInt(s[0]);
			t = Integer.parseInt(s[1]);
			if(d == 0 && t == 0)
			{
				break;
			}
			x += d * Math.cos(angle / 180 * Math.PI);
			y += d * Math.sin(angle / 180 * Math.PI);
			angle -= t;
		}
		System.out.printf("%d\n%d\n", (int)x, (int)y);
	}
}