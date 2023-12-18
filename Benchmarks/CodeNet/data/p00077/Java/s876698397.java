import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[.]*");
		int buffer = 1;
		while (sc.hasNext())
		{
			String str = sc.next();
			if (str.equals("@"))
			{
				buffer = sc.nextInt();
			}
			else
			{
				for (int i = 0; i < buffer; i++)
				{
					System.out.print(str);
				}
				buffer = 1;
			}
		}
	}
}