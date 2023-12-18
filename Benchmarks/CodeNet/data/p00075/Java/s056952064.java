import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\n]");
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			double w = sc.nextDouble();
			double h = sc.nextDouble();
			if (25.0 < w / (h * h))
			{
				System.out.println(n);
			}
		}
	}
}