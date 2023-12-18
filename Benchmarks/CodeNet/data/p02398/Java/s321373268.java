import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int count = 0;
		for(int x = 1; x <= c; x++)
		{
			if(c % x == 0)
			{
				if(a <= x && x <= b)
				{ 
					count++;
				}
				else
				{
				}
			}
			else
			{
			}
		}
		System.out.println(count);
	}
}
		
