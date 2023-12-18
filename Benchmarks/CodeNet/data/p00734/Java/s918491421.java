import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner stdIn = new Scanner(System.in);
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			
			if(n==0 && m==0)
			{
				break;
			}
			
			int[] tarou = new int[n];
			int[] hanako = new int[m];
			int x = 0;
			int tarou_number = 0;
			int hanako_number = 0;
			int tarou_total = 0;
			int hanako_total = 0;
			
			for(int i=0;i<n;i++)
			{
				tarou[i] = stdIn.nextInt();
				tarou_total += tarou[i];
			}
			for(int i=0;i<m;i++)
			{
				hanako[i] = stdIn.nextInt();
				hanako_total += hanako[i];
			}
			
			if(Math.abs(tarou_total - hanako_total)%2==1)
			{
				System.out.println(-1);
			}
			else
			{
				Arrays.sort(tarou);
				Arrays.sort(hanako);
				for(int i=0;i<n;i++)
				{
				
				
					for(int j=0;j<m;j++)
					{
						int h = tarou[i];
						tarou[i] = hanako[j];
						hanako[j] = h;
						
						if(func(tarou)==func(hanako))
						{
							System.out.println(hanako[j]+" "+tarou[i]);
							x++;
							break;
						}
				
						h = tarou[i];
						tarou[i] = hanako[j];
						hanako[j] = h;
					}
					if(x!=0)
					{
						break;
					}
					if(i==n-1)
					{
						System.out.println(-1);
					}
				
				}
				
			}
			
		}
		
	}
	
	static int func(int[] x)
	{
		int total = 0;
		
		for(int i=0;i<x.length;i++)
		{
			total += x[i];
		}
		
		return total;
	}
	

}