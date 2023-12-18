

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = (Integer.parseInt(sc.next()));
		int i;
		for(i = 0; i < n; i++) {
			BigDecimal  x1 = new BigDecimal(sc.next());
			BigDecimal y1 = new BigDecimal(sc.next());
			BigDecimal x2 = new BigDecimal(sc.next());
			BigDecimal y2 = new BigDecimal(sc.next());
			BigDecimal x3 = new BigDecimal(sc.next());
			BigDecimal y3 = new BigDecimal(sc.next());
			BigDecimal x4 = new BigDecimal(sc.next());
			BigDecimal y4 = new BigDecimal(sc.next());
			BigDecimal a1, a2;
			if(x2.subtract(x1).equals(0)) {
				a1 =  y2.subtract(y1);
			}else {
				a1 = (y2.subtract(y1)).divide(x2.subtract(x1), 5, BigDecimal.ROUND_HALF_UP);
			}

			if(x4.subtract(x3).equals(0)) {
				a2 = y4.subtract(y3);
			}else {
				a2 = (y4.subtract(y3)).divide(x4.subtract(x3), 5, BigDecimal.ROUND_HALF_UP);
			}
			if(a1.equals(a2)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		sc.close();

	}

}

