import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		BigInteger sum = new BigInteger("0");
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			sum = sum.add(new BigInteger(Integer.toString(a)));
		}
		sum = sum.divide(new BigInteger(Integer.toString(n)));
		System.out.println(sum);
	}
}