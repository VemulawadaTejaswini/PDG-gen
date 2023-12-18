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
				int d = sc.nextInt();
				
				int res = 0;
				for (int x = 0; x < 600; x += d)
				{
					res += f(x) * d;
				}
				System.out.println(res);
			}
			catch (Exception e)
			{
				break;
			}
		}
	}
	private static int f(int x)
	{
		return x * x;
	}
}