import java.util.Scanner;
import java.text.DecimalFormat;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat();
		df.applyLocalizedPattern("0.000");
		
		while (true)
		{
			try
			{
				double a = sc.nextInt();
				double b = sc.nextInt();
				double c = sc.nextInt();
				double d = sc.nextInt();
				double e = sc.nextInt();
				double f = sc.nextInt();
				
				double x = (e * c - b * f) / (a * e - b * d);
				double y = (a * f - d * c) / (a * e - b * d);
				
				if (x == 0.0) x = 0.0;
				
				System.out.print(df.format(x) + " ");
				System.out.println(df.format(y));
			}
			catch(Exception e)
			{
				break;
			}
		}
	}
}