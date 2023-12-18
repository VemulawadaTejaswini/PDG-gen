import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int b=0, c=0;
			boolean result = true;
			
			for(int j=0; j<10; j++)
			{
				int a = scanner.nextInt();

				if(a > b)
				{
					b = a;
				}
				else if(a > c)
				{
					c = a;
				}
				else 
				{
					result = false;
				}
			}
			
			System.out.println(result ? "YES" : "NO");
		}
	}
}