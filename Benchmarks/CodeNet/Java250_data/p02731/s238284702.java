import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int l = scn.nextInt();
		float temp = (float) l / 3;
		BigDecimal b1 = new BigDecimal(temp);
		b1 = b1.multiply(new BigDecimal(temp));
		b1 = b1.multiply(new BigDecimal(temp));
		System.out.println(b1);
	}
}
