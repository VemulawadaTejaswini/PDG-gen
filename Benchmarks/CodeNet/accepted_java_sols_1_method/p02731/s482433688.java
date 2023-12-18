import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		double d = l;
		double dd = d / 3;
		double ddd = dd * dd * dd;
		BigDecimal bi = BigDecimal.valueOf(ddd);
		System.out.println(bi);

		sc.close();
	}

}
