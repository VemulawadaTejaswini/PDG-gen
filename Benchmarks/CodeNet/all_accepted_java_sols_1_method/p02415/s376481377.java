import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		for (int i = 0; i < S.length(); i++)
		{
			if ('a' <= (int)S.charAt(i) && (int)S.charAt(i) <= 'z')
			{
				System.out.print((char)((int)S.charAt(i) - 'a' + 'A'));
			}
			else if ('A' <= (int)S.charAt(i) && (int)S.charAt(i) <= 'Z')
			{
				System.out.print((char)((int)S.charAt(i) - 'A' + 'a'));
			}
			else
			{
				System.out.print(S.charAt(i));
			}
		}
		System.out.println();
		sc.close();
	}
}
