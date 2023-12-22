import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		while (stdIn.hasNext())
		{
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();

			list.add(String.valueOf((a + b)).length());
		}

		for (int value : list)
		{
			System.out.println(value);
		}
	}
}