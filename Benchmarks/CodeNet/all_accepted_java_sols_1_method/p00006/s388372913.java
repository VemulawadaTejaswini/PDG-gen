import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		char ch[] = str.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
			System.out.print(ch[i]);
		System.out.println();

	}
}