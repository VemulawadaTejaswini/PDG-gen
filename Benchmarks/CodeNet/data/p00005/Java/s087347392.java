import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		for(; scanner.hasNext(); )
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a < b)
			{
				int buf = a;
				a = b;
				b = buf;
			}
			
			System.out.println(getGCD(a, b)+" "+getLCM(a, b));
		}
	}
	
	private static int getGCD(int a, int b)
	{
		for(;;)
		{
			if(a > b)
			{
				a = a % b;
				if(a == 0)
					return b;
			}
			else
			{
				b = b % a;
				if(b == 0) 
					return a;
			}
		}
	}
	
	private static int getLCM(int a, int b)
	{
		for(int n=b; ; n+=b)
		{
			if(n%a==0 && n%b==0)
			{
				return n;
			}
		}
	}
}