import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int x = stdIn.nextInt();
			int h = stdIn.nextInt();
			if(x == 0 && h == 0)
			{
				break;
			}
			double surfaceArea = x * x;
			surfaceArea += 2 * (Math.sqrt((x / 2.0) * (x / 2.0) + h * h) * x);
			System.out.printf("%.6f\n", surfaceArea);
		}
	}
}