import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] dictionary = new String[n];
		int wordNum = 0;

		for (int i = 0; i < n; i++)
		{
			String command = sc.next();
			switch (command)
			{
			case "insert":
				dictionary[wordNum++] = sc.next();
				break;
			case "find":
				String searchWord = sc.next();
				boolean flagSuccess = false;
				for (int j = 0; j < wordNum; j++)
				{
					if (dictionary[j].equals(searchWord))
					{
						System.out.println("yes");
						flagSuccess = true;
						break;
					}
				}
				if (!flagSuccess)
				{
					System.out.println("no");
				}
				break;
			}
		}
	}
}

