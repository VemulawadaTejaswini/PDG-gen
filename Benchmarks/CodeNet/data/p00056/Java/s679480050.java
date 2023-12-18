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
                for(int i=0; i<prime.size()/2; i++)
                {
                    for(int j=i; j<prime.size(); j++)
                    {
                        if(prime.get(i)+prime.get(j) == n)
                        {
                            count ++;
                            break;
                        }
                        else if(prime.get(i)+prime.get(j) > n)
                        {
                            break;
                        }
                    }
                }
            }
			System.out.println(count);
		}
	}
	
	private static void create()
	{
		for(int i=2; i<=50000; i+=(i==2)?1:2)
		{
			int p = (int)Math.sqrt(i);
			boolean is_prime = true;
			for(int j=2; j<=p; j+=(j==2)?1:2)
			{
				if(i % j == 0)
				{
					is_prime = false;
					break;
				}
			}
			if(is_prime)
			{
				prime.add(i);
			}
		}
	}
}