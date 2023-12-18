import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		class Area
		{
			double x, y;
		}
		ArrayList<Area> area = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		double total_angle = 0;
		for(int i=0; i<1000; i++)
		{
			Area a = new Area();
			double v = 1;
			if(i > 0)
			{
				v = Math.sqrt(i + 1);
				total_angle += Math.asin(1/v);				
			}	
			a.x = v * Math.cos(total_angle);
			a.y = v * Math.sin(total_angle);		
			area.add(a);
		}
		
		for(; ;)
		{
			int n = scanner.nextInt();
			if(n == -1)
			{
				break;
			}
			
			System.out.printf("%1$.2f\n", area.get(n-1).x);
			System.out.printf("%1$.2f\n", area.get(n-1).y);
		}
	}
}