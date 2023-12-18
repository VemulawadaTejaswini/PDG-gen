import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		String pattern[] = {
			"* = ****",
			"* =* ***",
			"* =** **",
			"* =*** *",
			"* =**** ",
			" *= ****",
			" *=* ***",
			" *=** **",
			" *=*** *",
			" *=**** "
		};
		Scanner sc = new Scanner(System.in);
		boolean first = true;
		while (sc.hasNext())
		{
			if (!first) System.out.println();
			first = false;
			StringBuffer num = new StringBuffer(sc.next());
			while (num.length() < 5)
			{
				num.insert(0, '0');
			}
			for (int i = 0; i < 8; i++)
			{
				for (int j = 0; j < 5; j++)
				{
					System.out.print(pattern[num.charAt(j)-'0'].charAt(i));
				}
				System.out.println();
			}
		}
	}
}