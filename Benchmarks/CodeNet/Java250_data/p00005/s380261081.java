import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			long a = stdIn.nextLong();
			long b = stdIn.nextLong();
			if(a < b)
			{
				long temp = a;
				a = b;
				b = temp;
			}
			long g = gcd(a, b);
			System.out.println(g + " " + (a * b / g));
		}
	}
	
	static long gcd(long a, long b)
	{
		if(b == 0)
		{
			return(a);
		}
		return(gcd(b, a % b));
	}
}