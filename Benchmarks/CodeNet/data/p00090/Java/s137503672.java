import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; ;)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}
			
			int max_len = 0;
			double[] x = new double[n];
			double[] y = new double[n];
			for(int i=0; i<n; i++)
			{
				String[] input = scanner.next().split(",");
				
				x[i] = Double.parseDouble(input[0]);
				y[i] = Double.parseDouble(input[1]);
				int len = 1;
				for(int j=0; j<i; j++)
				{
					if((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]) <= Math.pow(2,2))
					{
						len ++;
					}
				}
				if(max_len < len)
				{
					max_len = len;
				}
			}
			
			System.out.println(max_len);
		}
	}
}