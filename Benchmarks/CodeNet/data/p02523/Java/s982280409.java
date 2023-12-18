import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		double x1, y1, x2, y2;
		double xdif, ydif;
		double distance;
		
		x1 = stdIn.nextDouble();
		y1 = stdIn.nextDouble();
		x2 = stdIn.nextDouble();
		y2 = stdIn.nextDouble();
		
		xdif = x1 > x2 ? x1 - x2 : x2 - x1;
		ydif = y1 > y2 ? y1 - y2 : y2 - y1;
		
		distance = Math.sqrt(xdif * xdif + ydif * ydif);
		
		System.out.println(distance);
	}
}