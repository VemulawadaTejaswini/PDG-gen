import java.util.*;

public class Main {
	
	public static Scanner in;
	
	public static void main(String[] args){
		in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		boolean[] isPrime = new boolean[n + 1];
		
		for(int i = 0; i <= n; i++)
		{
			isPrime[i] = true;
		}
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		int idx = 2;
		
		while(idx < n)
		{
			if(isPrime[idx])
			{
				for(int i = idx * 2; i <= n; i += idx)
				{
					isPrime[i] = false;
				}
			}
			idx++;
		}
		
		int totalPrimes = 0;
		
		for(int i = 0; i <= n; i++)
		{
			if(isPrime[i])
			{
				totalPrimes++;
			}
		}
		
		System.out.println(totalPrimes);
	}
}