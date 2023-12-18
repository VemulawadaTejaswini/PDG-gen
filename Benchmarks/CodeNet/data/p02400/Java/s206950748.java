import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = Double.parseDouble(scan.nextLine());
		double dbPi = 3.1515926535;
		double dbCir = (dbPi * r * 2.0);
		double dbArea = (dbPi * r * r);
		BigDecimal x = new BigDecimal(dbCir);
		BigDecimal y = new BigDecimal(dbArea);
		x = x.setScale(6, BigDecimal.ROUND_HALF_UP);
		y = y.setScale(6, BigDecimal.ROUND_HALF_UP);

		System.out.println(x + " " + y);
		scan.close();
	}
}