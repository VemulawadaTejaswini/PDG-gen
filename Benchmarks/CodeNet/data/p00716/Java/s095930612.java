import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		long m = sc.nextLong();
		for (long i = 0 ; i < m; i++)
		{
			long money = sc.nextLong();
			long year = sc.nextLong();
			long n = sc.nextLong();
			
			long max = 0;
			
			for (long j = 0; j < n; j++)
			{
				long way = sc.nextLong();
				double p = sc.nextDouble();
				long cost = sc.nextLong();
				
				long currentMoney = money;
				if (way == 0)
				{
					long sum = 0;
					for (long k = 0; k < year; k++)
					{
						sum += currentMoney * p;
						currentMoney -= cost;
					}
					max = Math.max(max, currentMoney + sum);
				}
				else
				{
					for (long k = 0; k < year; k++)
					{
						currentMoney += currentMoney * p - cost;
					}
					max = Math.max(max, currentMoney);
				}
			}
			System.out.println(max);
		}
	}
}