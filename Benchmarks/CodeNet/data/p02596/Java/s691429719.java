import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		BigDecimal k = new BigDecimal(a);
		List<BigDecimal> exactList = new ArrayList<BigDecimal>();
		BigDecimal target = new BigDecimal(7);
		BigDecimal ten = new BigDecimal(1);
		BigDecimal seven = new BigDecimal(7);
		for (int i = 1; ; i++) {
			BigDecimal tmptarget = new BigDecimal(7);
			if (i != 1) {
				ten = ten.multiply(new BigDecimal(10));
				target = target.add(ten.multiply(new BigDecimal(7)));
				tmptarget = target.divide(seven);
			}
			if (tmptarget.remainder(k).compareTo(BigDecimal.ZERO) == 0) {
				System.out.println(i);
				break;
			}
			BigDecimal exact = tmptarget.remainder(k);
			if (exactList.contains(exact)) {
				System.out.println(-1);
				break;
			}
			exactList.add(exact);
		}
		
	}
}
