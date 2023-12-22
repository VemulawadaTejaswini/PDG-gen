import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int P = scan.nextInt();
		int e = 0;
		int o = 0;
		for (int i = 0; i < N; i++) {
			int z = scan.nextInt();
			if (z % 2 == 0) {
				e++;
			} else {
				o++;
			}
		}
		if (o == 0) {
			if (P == 0) {
				BigInteger a = new BigInteger("2");
				a = a.pow((e + o));
				System.out.println(a.toString());
			} else {
				System.out.println("0");
			}
		} else {
			if (P == 0) {
				BigInteger a = new BigInteger("2");
				a = a.pow((e + o - 1));
				System.out.println(a.toString());
			} else {
				BigInteger a = new BigInteger("2");
				a = a.pow((e + o - 1));
				BigInteger b = new BigInteger("2");
				b = b.pow(N);
				b = b.subtract(a);
				System.out.println(b.toString());
			}
		}
	}

}
