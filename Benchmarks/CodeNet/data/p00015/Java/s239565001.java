import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		int num;
		BigInteger bi1;
		BigInteger bi2;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			num = Integer.parseInt(br.readLine());
			while (--num >= 0) {
				bi1 = new BigInteger(br.readLine());
				bi2 = new BigInteger(br.readLine());
				if (bi1.toString().length() > 80 || bi2.toString().length() > 80) {
					System.out.println("overflow");
				}
				bi1 = bi1.add(bi2);
				System.out.println((bi1.toString().length() > 80)? "overflow" : bi1.toString());
			}
		} catch (Exception e) {}
	}
}