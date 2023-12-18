import java.util.Scanner;

public class Main 
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int sum = a+b;

			String str = String.valueOf(sum);
			System.out.println(str.length());
		}
	}
}