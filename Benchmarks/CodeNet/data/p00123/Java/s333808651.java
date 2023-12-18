import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			double m = sc.nextDouble();
			double km = sc.nextDouble();
			if(m<35.50 && km<71.00)
				System.out.println("AAA");
			else if(m<37.50 &&km<77.00)
				System.out.println("AA");
			else if(m<40.00 &&km<83.00)
				System.out.println("A");
			else if(m<43.00 &&km<89.00)
				System.out.println("B");
			else if(m<50.00 &&km<105.00)
				System.out.println("C");
			else if(m<55.00 &&km<116.00)
				System.out.println("D");
			else if(m<70.00 &&km<148.00)
				System.out.println("E");
			else
				System.out.println("NA");
		}
	}
}