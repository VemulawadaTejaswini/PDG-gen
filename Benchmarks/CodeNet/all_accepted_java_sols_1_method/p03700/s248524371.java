import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		long[] h = new long[n];
		
		for(int i = 0; i < n; i++)
		{
			h[i] = sc.nextLong();
		}
		
		Arrays.sort(h);
		
		long l = 1;
		long r = 2000000000;
		long min = 2000000000;
		
		while(l<=r)
		{
			long con = (l+r)/2;
			
			long coll = b*con; //collateral damage
			long need = 0;
			for(int i = n-1; i >= 0; i--)
			{
				long sindam = a-b;
				long hel = h[i] - coll;
				
				if(hel>0)
				{
					need += hel/sindam;
					if(hel%sindam != 0)need++;
				}
			}
			
			if(need <= con)
			{
				min = Math.min(min, con);
				r = con-1;
			}
			else
			{
				l = con+1;
			}
			
		}
		
		System.out.println(min);
	}

}
