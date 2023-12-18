import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		LOOP: for (int i = 0; i < n; i++)
		{
			String str = sc.nextLine();
			for (int a = 3; true; a++)
			{
				for (int b = 0; b < 26; b++)
				{
					if (a % 2 == 0 || a % 13 == 0) continue;
					StringBuffer buf = new StringBuffer(str);
					for (int j = 0; j < buf.length(); j++)
					{
						if (Character.isLowerCase(buf.charAt(j)))
							buf.setCharAt(j, affineCipher(a, b, buf.charAt(j)));
					}
					if (buf.indexOf("that") != -1 || buf.indexOf("this") != -1)
					{
						System.out.println(buf.toString());
						continue LOOP;
					}
				}
			}
		}
	}
	private static char affineCipher(int a, int b, char y)
	{
		int n = y - 'a';
		int f = (a * y + b) % 26;
		return (char) (f + 'a');
	}
}