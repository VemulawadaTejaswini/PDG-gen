import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String in = scanner.nextLine();
		int len = in.length();
		int max = 0, tmp = 0;
		for (int i = 0; i < len; i++)
		{
			if (in.charAt(i) == 'A' || in.charAt(i) == 'G' || in.charAt(i) == 'T' || in.charAt(i) == 'C')
			{
				tmp++;
				if (max < tmp)
				{
					max = tmp;
				}
			} else
			{
				tmp = 0;
			}
		}
		System.out.println(max);
	}
}
