import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext())
		{
			double a = scan.nextDouble();

			if(a<=48.00)
				System.out.println("light fly");
			else if(a<=51.00)
				System.out.println("fly");
			else if(a<=54.00)
				System.out.println("bantam");
			else if(a<=57.00)
				System.out.println("fether");
			else if(a<=60.00)
				System.out.println("light");
			else if(a<=64.00)
				System.out.println("light welter");
			else if(a<=69.00)
				System.out.println("welter");
			else if(a<=75.00)
				System.out.println("light middle");
			else if(a<=81.00)
				System.out.println("midle");
			else if(a<=91.00)
				System.out.println("light heavy");
			else 
				System.out.println("heavy");
		}
	}

}