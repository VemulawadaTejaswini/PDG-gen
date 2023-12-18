import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intInput = scan.nextInt();
		double dbCir = ((double)intInput * 2 * Math.PI);
		double dbArea = ((double)intInput * intInput * Math.PI);
		BigDecimal x = new BigDecimal(dbCir);
		BigDecimal y = new BigDecimal(dbArea);
		x = x.setScale(6, BigDecimal.ROUND_HALF_UP);
		y = y.setScale(6, BigDecimal.ROUND_HALF_UP);

		System.out.println(x + " " + y);
	}
}