import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
	public static void main(String[] args)
	{
		Scanner cin = new Scanner(System.in);
		
		long a=1;
		for(int i=cin.nextInt(); i>0; i--)
		{
			a*=i;
		}
		System.out.println(a);
	}
}