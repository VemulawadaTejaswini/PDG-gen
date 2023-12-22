import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			try
			{
				double v = sc.nextDouble();
				int i = 1;
				while (i * 5 * 2 * 9.8 < v * v)
					i++;
				System.out.println(i+1);
			}
			catch (Exception e)
			{
				break;
			}
		}
	}
}