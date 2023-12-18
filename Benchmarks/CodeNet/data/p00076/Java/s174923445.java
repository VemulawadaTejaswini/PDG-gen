import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		class Area
		{
			double x, y, z;
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
				double z = area.get(i-1).z;
				a.z = Math.sqrt(z*z + 1);
				v = a.z;
			}
			else
			{
				a.z = 1;
			}
			total_angle += Math.asin(1/a.z);
			a.x = v * Math.sin(total_angle);
			a.y = -v * Math.cos(total_angle);		
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