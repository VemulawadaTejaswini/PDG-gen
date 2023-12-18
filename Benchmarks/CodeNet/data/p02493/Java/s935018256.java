import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = sc.nextLine().split(" ");
		
		for (int i = n; i >= 0; i--)
		{
			if (i == 0)
			{
				System.out.println(str[i]);
			}
			else
			{
				System.out.print(str[i]);
			}
		}
	}
}