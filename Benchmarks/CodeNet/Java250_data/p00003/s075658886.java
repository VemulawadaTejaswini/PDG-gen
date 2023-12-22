import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);

		List<String> list = new ArrayList<String>();

		int number = stdIn.nextInt();

		for(int i = 0; i < number; i++)
		{
			int a = (int) Math.pow(stdIn.nextInt(), 2);
			int b = (int) Math.pow(stdIn.nextInt(), 2);
			int c = (int) Math.pow(stdIn.nextInt(), 2);

			if (a + b == c || a + c == b || b + c == a)
			{
				list.add("YES");
			} else
			{
				list.add("NO");
			}
		}

		for (String str : list)
		{
			System.out.println(str);
		}
	}
}