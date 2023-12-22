import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] x = line.split(" ");
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		double fa = Integer.parseInt(x[0]);
		double fb = Integer.parseInt(x[1]);
		System.out.print(a / b + " ");
		System.out.print(a % b + " ");
		double f = fa / fb;
		BigDecimal B = new BigDecimal(f);
		BigDecimal F = B.setScale(9, BigDecimal.ROUND_HALF_UP);
		System.out.printf("%.8f",F);

	}

}