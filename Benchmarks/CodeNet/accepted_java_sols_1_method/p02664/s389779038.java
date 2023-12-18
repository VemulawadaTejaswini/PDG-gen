import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		int n = c.length;
		boolean f = false;
		for (int i = 0; i < n; i++)
		{
			if (c[i] == '?') {
				c[i] = 'D';
			}
		}
		sc.close();
		System.out.println(c);
	}
}
