import java.util.Scanner;
import java.math.BigDecimal;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int d = a / b;
		int r = a % b;

		double fa = (double)a;
		double fb = (double)b;

		double f = fa / fb;

		System.out.println(d + " " + r + " " + BigDecimal.valueOf(f).toPlainString());
	}
}
