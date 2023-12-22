import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int counter = 0;

		for (int i = 0; i < (S.length()/2); i++)
		{
			if (S.charAt(i) != S.charAt(S.length()-(i+1)))
				counter++;
		}

		System.out.println(counter);
	}
}