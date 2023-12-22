import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String W = sc.next();

		int same = 0;

		while (true)
		{
			String temp = sc.next();
			if (temp.equals("END_OF_TEXT"))
			{
				break;
			}
			if (temp.equalsIgnoreCase(W))
			{
				same++;
			}
		}

		System.out.println(same);
	}
}

