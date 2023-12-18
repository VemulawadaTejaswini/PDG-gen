import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int id = -1;
		int max = -1;
		for(int i=0; i<n; i++)
		{
			int a = scanner.nextInt();
			int v = scanner.nextInt();
			if(v > max)
			{
				id = a;
				max = v;
			}
			else if(v == max)
			{
				if(a < id)
				{
					id = a;
				}
			}
		}
		System.out.println(id + " " + max);
	}
}