import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		int count = 1;
		for(;;)
		{
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			
			if(n == 0)
				break;
			else
				System.out.println("Case "+count+": "+n);
			
			count++;
		}
	}
}