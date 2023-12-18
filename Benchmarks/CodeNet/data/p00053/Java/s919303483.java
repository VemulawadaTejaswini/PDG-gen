import java.util.*;
public class Main 
{
	static List<Integer> prime = new ArrayList<Integer>();
	static boolean[] isPrime = new boolean[300000];
	static void primeCalc()
	{
		for(int i = 0; i < isPrime.length; ++i)
		{
			isPrime[i] = true;
		}
		isPrime[0] = isPrime[1] = false;
		for(int i = 2; i < isPrime.length; ++i)
		{
			if(isPrime[i])
			{
				prime.add(i);
				for(int j = 2 * i; j < isPrime.length; j += i)
				{
					isPrime[j] = false;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		primeCalc();
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int n = stdIn.nextInt();
			if(n == 0)
			{
				break;
			}
			int sum = 0;
			for(int i = 0; i < n; ++i)
			{
				sum += prime.get(i);
			}
			System.out.println(sum);
		}
	}
}