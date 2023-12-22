import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		double x = (double)a / (double)b;
		String bd = new BigDecimal(x).toPlainString();
		System.out.println((a/b) + " " + (a%b) + " " + bd);
	}

}