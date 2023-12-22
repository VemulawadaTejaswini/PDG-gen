import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			BigInteger n1 = sc.nextBigInteger();
			BigInteger n2 = sc.nextBigInteger();
			BigInteger m = n1.add(n2);
			if(m.toString().length() <= 80) {
				System.out.println(m.toString());
			}else {
				System.out.println("overflow");
			}
		}
		sc.close();
	}
}
