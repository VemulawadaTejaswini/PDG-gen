import java.math.BigInteger;
import java.util.Scanner;


public class Main
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int dataset = scan.nextInt();
		for(int i = 0; i < dataset; i++)
		{
			BigInteger a = scan.nextBigInteger();
			BigInteger b = scan.nextBigInteger();
			String sum = a.add(b).toString();
			System.out.println(sum.length() > 80 ?  "overflow" : sum);
		}
	}
}