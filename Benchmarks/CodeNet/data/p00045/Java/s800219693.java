import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\n]");
		
		int sum = 0;
		int n = 0;
		int total = 0;
		while (true)
		{
			try
			{
				int value = sc.nextInt();
				int amount = sc.nextInt();
				sum += value * amount;
				total += amount;
				n++;
			}
			catch (Exception e)
			{
				break;
			}
		}
		System.out.println(sum);
		System.out.println(Math.round((double) total / n));
	}
}