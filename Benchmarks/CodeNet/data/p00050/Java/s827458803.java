import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[ .\n]");
		while (sc.hasNext())
		{
			String str = sc.next();
			if (str.equals("apple"))
			{
				System.out.print("peach");
			}
			else if (str.equals("peach"))
			{
				System.out.print("apple");
			}
			else
			{
				System.out.print(str);
			}
			if (sc.hasNext())
			{
				System.out.print(" ");
			}
		}
		System.out.println(".");
	}
}