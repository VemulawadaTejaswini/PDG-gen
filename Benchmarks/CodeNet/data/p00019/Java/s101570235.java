import java.util.Scanner;

public class Main
{
	
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		int f = Math.min(20, scan.nextInt());
		
		int tmp = 1;
		for(int i = 1; i <= f; i++)
		{
			tmp *= i;
		}
		System.out.println(tmp);
	}

}