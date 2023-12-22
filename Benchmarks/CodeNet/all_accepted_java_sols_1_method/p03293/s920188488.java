import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine(), t = scan.nextLine();
		int len = s.length();
		scan.close();
		
		for (int i = 0; i < len; i++)
		{
			if (s.equals(t))
			{
				System.out.println("Yes");
				return;
			}
			s = s.charAt(len - 1) + s.substring(0, len - 1);
		}
		
		System.out.println("No");
	}
}

