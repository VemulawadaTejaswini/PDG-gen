import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
	static ArrayList<Integer> prime = new ArrayList<>();
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		create();
		
		for(;;)
		{
			int count = 0;
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}			
            if(n%2 == 0)
            {
                for(int i=0; i<prime.size() && prime.get(i)<n; i++)
                {
                	int num = n-prime.get(i);
                	if (num <= prime.get(i)) 
                	{				
	                	if(isPrime(num))
	                	{
	                		count ++;
	                	}
                	}
                }
            }
			System.out.println(count);
		}
	}
	
	static void create()
	{
		for(int i=2; i<=50000; i+=(i==2)?1:2)
		{
			if(isPrime(i))
			{
				prime.add(i);
			}	
		}
	}
	
	static boolean isPrime(int n)
	{
		int p = (int)Math.sqrt(n);
		boolean is_prime = true;
		for(int i=2; i<=p; i+=(i==2)?1:2)
		{
			if(n % i == 0)
			{
				is_prime = false;
				break;
			}
		}
		return is_prime;
	}
}