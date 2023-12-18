import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = sc.nextLine().split(" ");
		
		for (int i = n - 1; i >= 0; i--)
		{
			int a = Integer.parseInt(str[i]);
			
			if (i == 0)
			{
				System.out.println(a);
			}
			else
			{
				System.out.print(a);
			}
		}
	}
}