import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}
			
			int[] a = new int[n];
			int sum = 0;
			int max = -10000000;
			for(int i=0; i<n; i++)
			{
				a[i] = scanner.nextInt();
				sum += a[i];
				
				if(sum < a[i])
				{
					sum = a[i];
				}
				
				if(max < sum)
				{
					max = sum;
				}
			}
			System.out.println(max);
		}
	}
}