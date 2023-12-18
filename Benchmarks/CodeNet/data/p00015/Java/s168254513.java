import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int dataSetVal = in.nextInt();
		ArrayList<BigDecimal> array = new ArrayList<BigDecimal>();
		BigDecimal test1 = null;
		BigDecimal test2 = null;
		BigDecimal result = null;
		BigDecimal chkOvrFlow = new BigDecimal(
				"1000000000000000000000000000000000000000000000000000000000000000000000000000000");

		for (int i = 0; i < dataSetVal; i++) {
			test1 = in.nextBigDecimal();
			test2 = in.nextBigDecimal();
			result = test1.add(test2);
			array.add(result);
		}

		int handan = test1.compareTo(chkOvrFlow);
		int handan2 = test2.compareTo(chkOvrFlow);
		int handan3 = result.compareTo(chkOvrFlow);

		if (handan >= 0 || handan2 >= 0 || handan3 >= 0) {
			System.out.println("overflow");
		} else {
			for (BigDecimal temp : array) {
				System.out.println(temp);
			}
		}
	}
}