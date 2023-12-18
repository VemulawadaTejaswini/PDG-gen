import java.util.*;
public class Main 
{
	public static int gcd(int a, int b)
	{
		if(a % b == 0)
		{
			return(b);
		}
		return(gcd(b, a % b));
	}
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			if(a < b)
			{
				int temp = a;
				a = b;
				b = temp;
			}
			System.out.println(gcd(a, b));
		}
	}
}