import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int id = 0;
		int max = 0;
		for(int i=0; i<n; i++)
		{
			int a = scanner.nextInt();
			int v = scanner.nextInt();
			if(v > max)
			{
				id = a;
				max = v;
			}
		}
		System.out.println(id + " " + max);
	}
}