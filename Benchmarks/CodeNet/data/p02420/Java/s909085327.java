import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		for(;;)
		{
			String str = scanner.next();
			if(str.equals("-"))
			{
				break;
			}
			
			int m = scanner.nextInt();
			for(int i=0; i<m; i++)
			{
				int h = scanner.nextInt();
				str = str.substring(h) + str.substring(0, h);
			}
			System.out.println(str);
		}
	}
}