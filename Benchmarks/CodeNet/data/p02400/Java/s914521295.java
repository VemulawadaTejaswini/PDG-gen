import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double menseki = r*r*Math.PI;
		double enshu = (r+r)*Math.PI;
		
		System.out.println(BigDecimal.valueOf(menseki)+" "+BigDecimal.valueOf(enshu));


	}
}

