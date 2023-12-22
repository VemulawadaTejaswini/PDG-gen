import java.math.BigInteger;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int MAX = 80;
		int N = scan.nextInt();

		for (int i = 0; i < N; i++) {
			String s1 = scan.next();
			String s2 = scan.next();
			if (s1.length() > MAX || s2.length() > MAX) {
				System.out.println("overflow");
				continue;
			}
			BigInteger ba = new BigInteger(s1);
			BigInteger bb = new BigInteger(s2);
			if (ba.add(bb).toString().length() > MAX)
				System.out.println("overflow");
			else
				System.out.println(ba.add(bb));

		}
	}
}