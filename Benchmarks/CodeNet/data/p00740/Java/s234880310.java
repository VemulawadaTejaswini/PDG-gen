import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			int n = sc.nextInt(),
				p = sc.nextInt();
			if (n == 0 && p == 0) break;
			int candidate[] = new int[n];
			int index = 0, current = p;
			while (true)
			{
				if (current > 0)
				{
					candidate[index]++;
					current--;
				}
				else
				{
					current = candidate[index];
					candidate[index] = 0;
				}
				if (candidate[index] == p)
				{
					break;
				}
				index++;
				if (index == n) index = 0;
			}
			System.out.println(index);
		}
	}
}