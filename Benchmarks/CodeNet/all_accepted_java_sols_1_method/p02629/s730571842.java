import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String [] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z"};
		Scanner sc = new Scanner(System.in);
		String ns = sc.nextLine();
		sc.close();
		BigInteger norg = new BigInteger(ns);
		BigInteger n = norg;

		int [] ans = new int[12];

		int i = 1;
		BigInteger max = new BigInteger("26");
		for (i=1; i<12; i++) {
			if (n.compareTo(max)<=0) break;
			n=n.subtract(max);
			max=max.multiply(new BigInteger("26"));
		}
		n=n.subtract(BigInteger.ONE);
		for (int j=1; j<=i; j++) {
			ans[j]=n.mod(new BigInteger("26")).intValue();
			n = n.divide(new BigInteger("26"));
		}

		for (int j=i; j>0;j--) {
			System.out.print(a[ans[j]]);
		}
	}
}
