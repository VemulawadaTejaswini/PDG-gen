import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int ans;
			
			while(true)
			{
				int n = sc.nextInt();
				int x = sc.nextInt();
				if(n == 0 && x == 0)
				{
					break;
				}
				
				if(n * 3 < x)
				{
					System.out.println(0);
				}
				ans = 0;
				for(int i = 1; i <= n && x - i > 0; i++)
				{
					if(n * 2 >= x - i)
					{
						for(int j = i + 1; j <= n && x - i - j> 0; j++)
						{
							if(n >= x - i - j && x - i - j > j)
							{
								ans++;
							}
						}
					}
				}
				
				System.out.println(ans);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}