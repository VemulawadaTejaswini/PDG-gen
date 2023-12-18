import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		do
		{
			int a = scanner.nextInt(); //a1
			int b = scanner.nextInt(); //b1
			int c = scanner.nextInt(); //c1
			int d = scanner.nextInt(); //a2
			int e = scanner.nextInt(); //b2
			int f = scanner.nextInt(); //c2
			double x = (double)(c*e - f*b) / (a*e - d*b);
			double y = (double)(a*f - d*c) / (a*e - d*b);
			if(String.format("%.1f", x).equals("-0.0"))
			{
				x = 0D;
			}
			if(String.format("%.1f", y).equals("-0.0"))
			{
				y = 0D;
			}
			System.out.println(String.format("%.3f %.3f", x, y));
		}
		while(scanner.hasNext());
	}
}