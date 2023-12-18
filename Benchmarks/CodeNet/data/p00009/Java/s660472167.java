import java.util.*;

public class Main 
{
	static List<Integer> list = new ArrayList<Integer>();
	static void primeCalc()
	{
		boolean[] isPrime = new boolean[1000000];
		for(int i = 0; i < isPrime.length; ++i)
		{
			isPrime[i] = true;
		}
		isPrime[0] = isPrime[1] = false;
		for(int i = 2; i < isPrime.length; ++i)
		{
			if(isPrime[i])
			{
				list.add(i);
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
			int ans = 0;
			for(int i = 0; i < list.size(); ++i)
			{
				if(list.get(i) <= n)
				{
					++ans;
				}
				else
				{
					break;
				}
			}
			System.out.println(ans);
		}
	}
}