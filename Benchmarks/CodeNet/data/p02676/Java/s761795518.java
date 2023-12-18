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
			int a = sc.nextInt();
			String b = sc.next();
			if (a < b.length())
			{
				System.out.println(b.substring(0,a)+"...");
				
			} else
			{
				System.out.println(b);

			}
		}

	}

}