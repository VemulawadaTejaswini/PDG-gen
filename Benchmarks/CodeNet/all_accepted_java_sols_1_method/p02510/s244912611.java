import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			String str = scanner.next();
			if(str.equals("-"))
			{
				break;
			}
			int n = scanner.nextInt();
			for(int i = 0; i < n; i++)
			{
				int j = scanner.nextInt();
				str = str.substring(j, str.length()) + str.substring(0, j);
			}
			System.out.println(str);
		}
	}
}