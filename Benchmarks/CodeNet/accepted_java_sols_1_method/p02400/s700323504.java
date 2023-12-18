import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double r = sc.nextDouble();

		BigDecimal area = new BigDecimal(r * r * Math.PI);
		BigDecimal cir =  new BigDecimal(r * 2 * Math.PI);


		System.out.println(area + " " + cir);

	}

}

