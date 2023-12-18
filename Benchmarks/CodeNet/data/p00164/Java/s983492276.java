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
			int plan[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				plan[i] = sc.nextInt();
			}
			int ohajiki = 31;
			int index = 0;
			System.out.println(ohajiki);
			while (true)
			{
				if (ohajiki > plan[index])
				{
					ohajiki -= plan[index];
					System.out.println(ohajiki);
					ohajiki -= (ohajiki - 1) % 5;
					System.out.println(ohajiki);
					index = (index + 1) % n;
				}
				else
				{
					ohajiki = 0;
					System.out.println(ohajiki);
					break;
				}
			}
		}
	}
}