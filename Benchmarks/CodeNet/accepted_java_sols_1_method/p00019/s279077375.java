import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger res = BigInteger.valueOf(1);
		for(int i = 1; i <= n; i++)
			res = res.multiply(BigInteger.valueOf(i));
		System.out.println(res);
	}
}