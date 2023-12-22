import java.util.Scanner;

public class Main
{
	String s[] = new String[2];

	public Main()
	{
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 2; i++)
		{
			s[i] = scanner.next();
		}
		if(s[0].charAt(0) == s[1].charAt(2) && s[0].charAt(1) == s[1].charAt(1) && s[0].charAt(2) == s[1].charAt(0))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

	public static void main(String[] args)
	{
		new Main();
	}
}
