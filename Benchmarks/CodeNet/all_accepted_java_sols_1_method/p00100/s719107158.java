import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			
			int mansID[] = new int[n];
			long mansValue[] = new long[n];
			int last = 0;
			
			for (int i = 0; i < n; i++)
			{
				int id = sc.nextInt();
				EXIST :
				{
					for (int j = 0; j < last; j++)
					{
						if (mansID[j] == id)
						{
							mansValue[j] += sc.nextLong() * sc.nextLong();
							break EXIST;
						}
					}
					mansID[last] = id;
					mansValue[last] = sc.nextLong() * sc.nextLong();
					last++;
				}
			}
			
			boolean flg = true;
			for (int i = 0; i < last; i++)
			{
				if (mansValue[i] >= 1000000)
				{
					System.out.println(Long.toString(mansID[i]));
					flg = false;
				}
			}
			if (flg)
				System.out.println("NA");
		}
	}
}