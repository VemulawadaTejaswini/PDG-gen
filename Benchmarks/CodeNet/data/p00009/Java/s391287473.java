import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		primeCalc();
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int ans = 0;
			int n = stdIn.nextInt();
			for(int i = 0; i <= n; ++i)
			{
				if(isPrime[i])
				{
					++ans;
				}
			}
			System.out.println(ans);
		}
	}
	
	static List<Integer> list = new ArrayList<Integer>();
	static final int DATA_NUM = 1000001;
	static boolean[] isPrime = new boolean[DATA_NUM];
	static void primeCalc()
	{
		for(int i = 0; i < DATA_NUM; ++i)
		{
			isPrime[i] = true;
		}
		isPrime[0] = isPrime[1] = false;
		for(int i = 2; i < DATA_NUM; ++i)
		{
			if(isPrime[i])
			{
				list.add(i);
				for(int j = 2 * i; j < DATA_NUM; j += i)
				{
					isPrime[j] = false;
				}
			}
		}
	}
}