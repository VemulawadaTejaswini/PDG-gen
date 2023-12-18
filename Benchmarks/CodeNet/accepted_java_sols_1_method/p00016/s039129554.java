import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\\n]");
		
		double x = 0;
		double y = 0;
		double angle = 90;
		
		while(true)
		{
			double r = sc.nextDouble();
			double t = sc.nextDouble();
			
			if (r == 0 && t == 0) break;
			
			x += r * Math.cos(Math.toRadians(angle));
			y += r * Math.sin(Math.toRadians(angle));
			angle -= t;
		}
		System.out.println(Integer.toString((int)x));
		System.out.println(Integer.toString((int)y));
	}
}