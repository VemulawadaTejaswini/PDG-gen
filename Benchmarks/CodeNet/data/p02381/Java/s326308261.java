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
			
			int[] s = new int[1000];
			int sum = 0;
			for(int i=0; i<n; i++)
			{
				s[i] = scanner.nextInt();
				sum += s[i];
			}
			
			double m = sum/n;
			double v = 0;
			for(int i=0; i<n; i++)
			{
				v += (s[i] - m) * (s[i] - m);
			}

			System.out.printf("%1$.8f\n", Math.sqrt(v/n));
		}
	}
}