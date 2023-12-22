import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double money = 100000;
		BufferedReader bufReader =
				new BufferedReader(new InputStreamReader(System.in));
		int weeks = Integer.parseInt(bufReader.readLine());
		for (int i = 0; i < weeks; i++) {
			money *= 1.05;
			money /= 1000.0D;
			BigDecimal bd = new BigDecimal(money);
			money = bd.setScale(0, BigDecimal.ROUND_UP).doubleValue();
			money *= 1000;
		}
		System.out.println((int) money);
	}

}