import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n;
		double[] b = new double[1111];
		double av;
		double sum;
		while(true)
		{
			n = input.nextInt();
			if(n == 0)
				break;
			else 
			{
				sum = 0;
				av = 0;
				for(int i = 0; i < n; i++)
				{
					b[i]=input.nextDouble();
					av += b[i];
				}
				av /=n;
				for(int i = 0; i < n; i++)
				{
					sum += (b[i] - av)*(b[i] - av)/n;
				}
				System.out.println( Math.sqrt(sum));
			}
		}
		input.close();
	}
}