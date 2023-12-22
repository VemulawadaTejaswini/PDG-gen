import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextDouble())
		{
			double w = sc.nextDouble();
			if (w <= 48.0)
			{
				System.out.println("light fly");
			}
			else if (w <= 51.0)
			{
				System.out.println("fly");
			}
			else if (w <= 54.0)
			{
				System.out.println("bantam");
			}
			else if (w <= 57.0)
			{
				System.out.println("feather");
			}
			else if (w <= 60.0)
			{
				System.out.println("light");
			}
			else if (w <= 64.0)
			{
				System.out.println("light welter");
			}
			else if (w <= 69.0)
			{
				System.out.println("welter");
			}
			else if (w <= 75.0)
			{
				System.out.println("light middle");
			}
			else if (w <= 81.0)
			{
				System.out.println("middle");
			}
			else if (w <= 91.0)
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