import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[])
	{
		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a == 0 && b ==0)
			{
				break;
			}
			else if(a == b)
			{
				System.out.println(a + " " + b);
			}
			else if(a < b)
			{
				System.out.println(a + " " + b);
			}
			else if(a > b)
			{
				System.out.println(b + " " + a);
			}
		}
	}
}