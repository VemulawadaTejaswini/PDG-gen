import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		boolean[] prime = new boolean[250000];
		
		Arrays.fill(prime,true);
		prime[0] = false;
		prime[1] = false;
		
		for(int i=2;i<250000;i++)
		{
			if(prime[i])
			{
				int j = i*2; 
				while(j<250000)
				{
					prime[j] = false;
					j = j + i;
				}
			}
		}
		
		while(true)
		{
			int n = stdIn.nextInt();
			
			if(n==0)
			{
				break;
			}
			
			int count = 0;
			
			for(int i=n+1;i<=n*2;i++)
			{
				if(prime[i])
				{
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}