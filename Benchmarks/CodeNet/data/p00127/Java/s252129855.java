import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char map[][] = {
			{'a','b','c','d','e',},
			{'f','g','h','i','j',},
			{'k','l','m','n','o',},
			{'p','q','r','s','t',},
			{'u','v','w','x','y',},
			{'z','.','?','!',' ',},
		};
		while (sc.hasNext())
		{
			String str = sc.next();
			int length = str.length();
			if (length % 2 != 0)
			{
				System.out.println("NA");
				continue;
			}
			for (int i = 0; i < length; i += 2)
			{
				int a = str.charAt(i) - '1';
				int b = str.charAt(i+1) - '1';
				System.out.print(map[a][b]);
			}
			System.out.println();
		}
	}
}