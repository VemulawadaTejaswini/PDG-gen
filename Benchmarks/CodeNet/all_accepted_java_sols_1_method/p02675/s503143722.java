import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			String a = sc.next();
			char x = a.charAt(a.length() - 1);
			if (x == '2' | x == '4' | x == '5' | x == '7' | x == '9')
			{
				System.out.println("hon");
			} else if (x == '1' || x == '6' || x == '8'|x=='0')
			{
				System.out.println("pon");
			} else
			{
				System.out.println("bon");
			}
		}

	}

}