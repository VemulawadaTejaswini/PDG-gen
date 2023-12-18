import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int num = sc.nextInt();

			BigInteger result = BigInteger.ONE;
			for (int i = 0; i < num; i++) {
				result = result.multiply(sc.nextBigInteger());
			}

			if(result.compareTo(new BigInteger("1000000000000000000")) < 0) {
				System.out.println(result.toString());
			}else {
				System.out.println(-1);
			}


		

		} catch (Exception e) {
			System.out.println(-1);
			e.printStackTrace();
		}

	}
}
