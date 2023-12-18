import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);

		int n;
		BigInteger a,b;
		n = cin.nextInt();
		while(n-- > 0)
		{
			a = cin.nextBigInteger();
			b = cin.nextBigInteger();
						
			System.out.println(a.add(b));
		}
	}
}