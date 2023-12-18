import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		BigInteger big;
		long n;
		int count;

//		n = sc.nextLong();
		n = Integer.valueOf(br.readLine());
		while (n != 0) {
			count = 0;
			big = new BigInteger("1");
			for (int i = 2; i <= n; i++) {
				big = big.multiply(new BigInteger(Integer.toString(i)));
			}
			while (big.remainder(BigInteger.TEN).equals(BigInteger.ZERO)) {
				big = big.divide(BigInteger.TEN);
				count++;
			}
			System.out.println(count);
//			n = sc.nextLong();
			n = Integer.valueOf(br.readLine());
		}
	}
}