import java.math.BigInteger;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0)
		{
			BigInteger a=in.nextBigInteger();
			BigInteger b=in.nextBigInteger();
			String ans=String.valueOf(a.add(b));
			if(ans.length()>80)
				System.out.println("overflow");
			else
				System.out.println(ans);
		}
	}
}