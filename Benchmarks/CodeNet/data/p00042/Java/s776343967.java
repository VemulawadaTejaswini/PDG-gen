import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\n]");
		int caseCount = 0;
		while (true)
		{
			int w = sc.nextInt();
			if (w == 0) break;
			int n = sc.nextInt();
			int value[] = new int[n];
			int weight[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				value[i] = sc.nextInt();
				weight[i] = sc.nextInt();
			}
			
			int maxValue = 0;
			int minWeigth = Integer.MAX_VALUE;
			
			int a = (int)Math.pow(2, n);
			LOOP1: for (int i = 0; i < a; i++)
			{
				int totalValue = 0;
				int totalWeight = 0;
				for (int j = 0; j < n; j++)
				{
					if (((i >> j) & 1) != 0)
					{
						totalValue += value[j];
						totalWeight += weight[j];
						if (totalWeight > w)
						{
							continue LOOP1;
						}
					}
				}
				if (totalWeight < w && maxValue < totalValue)
				{
					maxValue = totalValue;
					minWeigth = totalWeight;
				}
				else if (maxValue == totalValue && totalWeight < minWeigth)
				{
					minWeigth = totalWeight;
				}
			}
			caseCount++;
			System.out.printf("Case %d:\n", caseCount);
			System.out.println(maxValue);
			System.out.println(minWeigth);
		}
	}
}