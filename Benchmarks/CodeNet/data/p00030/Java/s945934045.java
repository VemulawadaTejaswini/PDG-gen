import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static int combination(int n, int s, int ans, int lowlim)
	{
		if(lowlim <= 9)
		{
			if( n == 1 && (s >= lowlim && s <= 9) )
			{
				ans++;
			}
			else if(s >= lowlim * n && s <= 9 * n)
			{
				for(int i = lowlim; i <= 9 && s - i >= 0; i++)
				{
					ans = combination(n - 1, s - i, ans, i + 1);
				}
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int ans;
			
			while(true)
			{
				int n = sc.nextInt();
				int s = sc.nextInt();
				if(n == 0 && s == 0)
				{
					break;
				}
				
				ans = 0;
				ans = combination(n, s, ans, 0);
				System.out.println(ans);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}