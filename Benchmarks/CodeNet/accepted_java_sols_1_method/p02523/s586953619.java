import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		double x1 = stdIn.nextDouble();
		double y1 = stdIn.nextDouble();
		double x2 = stdIn.nextDouble();
		double y2 = stdIn.nextDouble();
		System.out.printf("%.8f\n", Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
	}
}