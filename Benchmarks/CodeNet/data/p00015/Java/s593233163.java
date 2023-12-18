import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		int n;
		BigInteger a,b,c;
		n = cin.nextInt();
		while(n-- > 0)
		{
			a = cin.nextBigInteger();
			b = cin.nextBigInteger();
			c = a.add(b);
						
			if(c.toString().length()>80)
			{
				System.out.println("overflow");			
			}
			else
			{
				System.out.println(c);
			}
		}
	}
}