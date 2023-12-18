import java.util.*;
import java.math.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		while(n-- != 0)
		{
			BigInteger bInt1 = stdIn.nextBigInteger();
			BigInteger bInt2 = stdIn.nextBigInteger();
			bInt1 = bInt1.add(bInt2);
			if(bInt1.toString().length() > 80)
			{
				System.out.println("overflow");
			}
			else
			{
				System.out.println(bInt1);
			}
		}
	}
}