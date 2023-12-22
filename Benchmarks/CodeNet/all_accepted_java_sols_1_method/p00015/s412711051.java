import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 */
class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			String a = in.next();
			String b = in.next();

			BigInteger aBig = new BigInteger(a);
			BigInteger bBig = new BigInteger(b);
			BigInteger ans = aBig.add(bBig);

			if(ans.toString().length() > 80) {
				System.out.println("overflow");
			} else {
				System.out.println(ans);
			}
		}
	}

}