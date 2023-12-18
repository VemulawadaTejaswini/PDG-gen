import java.util.Scanner;
import java.io.IOException;

class Main 
{
	private static final int MAX = 32768; // 2^15
	private static boolean[] prime;

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n;

		init();

		while(true)
		{
			n = sc.nextInt();
		
			if(n == 0)
			{
				break;
			}

			System.out.println(countPair(n));
		}
			
	}

	private static void init()
	{
		prime = new boolean[MAX];

		for(int i = 0; i < MAX; i++)
		{
			prime[i] = isPrime(i);
		}
	}

	public static int countPair(int n)
	{
		int cnt = 0;

		for(int i = 2; i < n; i++)
		{
			if(n - i < i)
			{
				break;
			}

			if(isPairable(i, n))
			{
				cnt++;
			}	
		}

		return cnt;
	}

	// if p2 is prime or not.
	public static boolean isPairable(int p1, int n)
	{
		return prime[n - p1];
	}

	private static boolean isPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		else if(n == 2)
		{
			return true;
		}
		else if(n % 2 == 0)
		{
			return false;
		}
		else
		{
			for(int i = 3; i * i <= n; i += 2)
			{
				if(n % i == 0)
				{
					return false;
				}
			}
		}
		return true;
	}
}