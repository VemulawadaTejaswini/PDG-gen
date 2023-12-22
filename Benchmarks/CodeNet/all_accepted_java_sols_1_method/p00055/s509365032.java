import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			double a = scanner.nextDouble();
			double sum = a;
			
			for(int i=2; i<=10; i++)
			{
				if(i%2 == 0)
				{
					a *= 2;
				}
				else {
					a /= 3;
				}
				sum += a;
			}
			System.out.println(String.format("%1$.8f", sum));
		}
	}
}