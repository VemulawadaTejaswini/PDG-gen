import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String argv[]) {

		int num;
		BigInteger bd1;
		BigInteger bd2;
		BigInteger sum;

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			num = Integer.parseInt(br.readLine());
			while (--num >= 0) {
				String ln1 = br.readLine();
				String ln2 = br.readLine();
				if (ln1.length() > 80 || ln2.length() > 80) {
					System.out.println("overflow");
				}
				bd1 = new BigInteger(ln1);
				bd2 = new BigInteger(ln2);
				sum = new BigInteger("0");
				sum = sum.add(bd1);
				sum = sum.add(bd2);
				if (sum.toString().length() > 80) {
					System.out.println("overflow");
				}
				System.out.println(sum.toString());
			}
		}
		catch (Exception e) {

		}
	}
}