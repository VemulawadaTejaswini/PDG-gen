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
				
				System.out.print(df.format((e * c - b * f) / (a * e - b * d)) + " ");
				System.out.println(df.format((a * f - d * c) / (a * e - b * d)));
			}
			catch(Exception e)
			{
				break;
			}
		}
	}
}