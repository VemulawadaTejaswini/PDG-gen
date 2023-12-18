import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int w, n, a, b, tmp;
			String input;

			w = sc.nextInt();
			n = sc.nextInt();

			int[] lots = new int[w];
			for(int i = 0; i < w; i++)
			{
				lots[i] = i + 1;
			}

			for(int i = 0; i < n; i++)
			{
				input = sc.next();
				String[] ab = input.split(",");
				a = Integer.parseInt(ab[0]) - 1;
				b = Integer.parseInt(ab[1]) - 1;

				tmp = lots[a];
				lots[a] = lots[b];
				lots[b] = tmp;
			}

			for(int i = 0; i < w; i++)
			{
				System.out.println(lots[i]);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}