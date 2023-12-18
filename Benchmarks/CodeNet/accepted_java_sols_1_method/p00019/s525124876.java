import java.util.Scanner;

public class Main
{
	
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		int f = scan.nextInt();
		long tmp = 1;
		for(int i = 1; i <= f; i++)
		{
			tmp *= i;
		}
		System.out.println(tmp);
	}

}