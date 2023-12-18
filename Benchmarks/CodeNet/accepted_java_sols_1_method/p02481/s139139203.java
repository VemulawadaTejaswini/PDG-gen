import java.util.Scanner;
import java.io.*;

class Main
{
	public static void main(String[] args)throws IOException
	{
		Scanner in = new Scanner(System.in);

		String str1 = in.next();
		String str2 = in.next();

		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);

		int menseki = a * b;
		int syuu = 2*a + 2*b;

		System.out.println(menseki + " " + syuu);
	}
}