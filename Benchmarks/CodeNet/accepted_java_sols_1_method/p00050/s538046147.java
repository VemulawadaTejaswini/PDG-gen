import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			String str = sc.next();
			if (str.indexOf("apple") != -1)
			{
				System.out.print(str.replaceAll("apple", "peach"));
			}
			else if (str.indexOf("peach") != -1)
			{
				System.out.print(str.replaceAll("peach", "apple"));
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
		System.out.println();
	}
}