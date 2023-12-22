import java.util.Scanner;
import java.math.BigInteger;
public class Main
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		BigInteger sum = BigInteger.valueOf(0);
		int max, min, n, t;
		n = inp.nextInt();
		t = inp.nextInt();
		max = t;
		min = t;
		sum = sum.add(BigInteger.valueOf(t));
		for(int i = 1; i < n; i++)
		{
			t = inp.nextInt();
			if(t > max)max = t;
			if(t < min)min = t;
			sum = sum.add(BigInteger.valueOf(t));
		}
		System.out.println(min + " " + max + " " + sum);
	}
}