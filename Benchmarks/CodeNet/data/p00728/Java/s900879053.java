

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int n = sc.nextInt();
			
			if(n == 0)break;
			
			int min = 99999;
			int max = -99999;
			int sum = 0;
			
			for(int i = 0; i < n; i++)
			{
				int in = sc.nextInt();
				sum += in;
				
				min = Math.min(in, min);
				max = Math.max(in, max);
			}
			
			sum = sum - min - max;
			sum /= n-2;
			
			System.out.println(sum);
		}
	}

}

