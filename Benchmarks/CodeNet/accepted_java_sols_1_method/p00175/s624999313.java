import java.math.*;
import java.util.*;
public class Main 
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			BigInteger b = in.nextBigInteger();
			if(b.intValue()==-1)
				return;
			System.out.println(b.toString(4));
		}
	}

}