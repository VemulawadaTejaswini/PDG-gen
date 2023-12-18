import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			String str;
			try
			{
				str = sc.nextLine();
			}
			catch (Exception e)
			{
				break;
			}
			int result = 0;
			for (int i = 0; i < str.length() - 1; i++)
			{
				int n = charToNum(str.charAt(i));
				int next = charToNum(str.charAt(i + 1));
				if (next <= n)
				{
					result += n;
					if (i == str.length() - 2) result += next;
				}
				else
				{
					result += next - n;
					i++;
				}
			}
			System.out.println(result);
		}
	}
	private static int charToNum(char c)
	{
		switch (c)
		{
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
	}
}