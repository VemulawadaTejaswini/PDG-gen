import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str[] = new String[8];
		for (int i = 0; i < 8; i++)
		{
			str[i] = sc.next();
		}
		for (int i = 0; i < 3; i++)
		{
			StringBuffer buf[] = new StringBuffer[8];
			for (int j = 0; j < 8; j++)
			{
				buf[j] = new StringBuffer(str[j]);
			}
			System.out.println(90 * (1 + i));
			for (int x = 0; x < 8; x++)
			{
				for (int y = 0; y < 8; y++)
				{
					char a = str[y].charAt(x);
					int u = -y + 7;
					int v = x;
					buf[v].setCharAt(u, a);
				}
			}
			for (int j = 0; j < 8; j++)
			{
				str[j] = buf[j].toString();
				System.out.println(str[j]);
			}
		}
	}
}