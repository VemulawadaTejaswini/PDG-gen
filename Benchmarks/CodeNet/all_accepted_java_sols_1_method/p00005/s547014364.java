import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in); 
		while(sc.hasNext())
		{
		
		BigInteger x = sc.nextBigInteger();
		BigInteger y = sc.nextBigInteger();

		BigInteger gcd = x.gcd(y);
		BigInteger lcm = x.multiply(y).divide(gcd);
		System.out.print(gcd+" ");
		System.out.println(lcm);
		}
	}
	/*public static int  gcd(int x, int y) //ユークリッド互除法
	{
		int div=-1;
		while(true)
		{
			div = x%y;
			if(div==0)
				break;
			x=y;
			y=div;
		}	
		return y;
	}
	 */


}