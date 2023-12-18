import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		double max = 0.0;
		double min = Double.MAX_VALUE;
		while (sc.hasNextDouble())
		{
			double x = sc.nextDouble();
			max = Math.max(max, x);
			min = Math.min(min, x);
		}
		System.out.printf("%.1f", max - min);
	}
}