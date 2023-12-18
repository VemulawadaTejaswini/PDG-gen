import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int n = scanner.nextInt();
			
			int count = 0;
			for(int i=0; i<10000; i++)
			{
				int sum = 0;
				for(int j=0, m=i; j<4; j++, m/=10)
				{
					sum += m%10;
				}
				if(sum == n)
				{
					count ++;
				}
			}
			System.out.println(count);
		}
	}
}