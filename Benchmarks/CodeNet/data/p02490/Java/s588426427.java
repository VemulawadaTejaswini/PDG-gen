import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[])
	{
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(sc.hasNextInt())
		{
			if(a < b)
			{
				System.out.println(a + " " + b);
			}
			else if(a > b)
			{
				System.out.println(b + " " + a);
			}
			else if(a == 0 && b ==0)
			{
				break;
			}
		}
	}
}