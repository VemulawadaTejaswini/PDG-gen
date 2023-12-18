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
			double a =sc.nextInt();
			double b =sc.nextInt();
			double c =sc.nextInt();
			double d =sc.nextInt();
			double e=Math.cos(((c*30-d*6)*Math.PI)/180);

			double g=(a*a+b*b-e*a*b);
			System.out.printf("%.20f",(Math.sqrt(g)));
		}

	}

}