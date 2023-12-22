import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			double x = sc.nextInt();
			double h = sc.nextInt();
			if (x == 0.0 && h == 0.0) break;
			double a = Math.sqrt((x / 2)*(x / 2) + h * h);
			System.out.println(x * x + x * a * 2);
		}
	}
}