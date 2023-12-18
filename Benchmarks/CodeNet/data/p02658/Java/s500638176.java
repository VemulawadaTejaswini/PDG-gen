import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		BigInteger a[] = new BigInteger[input.nextInt()];
		BigInteger t = new BigInteger("1");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextBigInteger();

			t = t.multiply(a[i]);
		}
		BigInteger ok=new BigInteger("10");
		BigInteger yes= ok.pow(18);
		
		System.out.println(t);
		if(t.compareTo(yes)==1) {
			System.out.println(-1);
		}
		else
			System.out.println(t);
	}

}
