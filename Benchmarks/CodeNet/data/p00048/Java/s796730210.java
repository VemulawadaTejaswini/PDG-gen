import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			double weight = stdIn.nextDouble();
			if(weight <= 48.0)
			{
				System.out.println("light fly");
			}
			else if(weight <= 51.0)
			{
				System.out.println("fly");
			}
			else if(weight <= 54.0)
			{
				System.out.println("bantam");
			}
			else if(weight <= 57.0)
			{
				System.out.println("feather");
			}
			else if(weight <= 60.0)
			{
				System.out.println("light");
			}
			else if(weight <= 64.0)
			{
				System.out.println("light welter");
			}
			else if(weight <= 69.0)
			{
				System.out.println("welter");
			}
			else if(weight <= 75.0)
			{
				System.out.println("light middle");
			}
			else if(weight <= 81.0)
			{
				System.out.println("middle");
			}
			else if(weight <= 91.0)
			{
				System.out.println("light heavy");
			}
			else
			{
				System.out.println("heavy");
			}
		}
	}
}