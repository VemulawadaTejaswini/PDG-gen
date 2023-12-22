import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = 0, total = 0;

		for (int i = 1; i <= 3; i++)
		{
			a = sc.nextInt();
			total += a;
		}

		if (total < 22)
			System.out.println("win");
		else
			System.out.println("bust");
	}
}