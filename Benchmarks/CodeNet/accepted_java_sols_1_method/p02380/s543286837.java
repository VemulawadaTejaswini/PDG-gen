import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] ne = line.split(" ");
		
		BigDecimal aa = new BigDecimal(ne[0]);
		BigDecimal bb = new BigDecimal(ne[1]);
		BigDecimal CC = new BigDecimal(ne[2]);
		
		// Math.sin(CC);
		
		double a = aa.doubleValue();
		double b = bb.doubleValue();
		double C = CC.doubleValue();
		
		double sin = Math.sin(Math.toRadians(C));
		double cos = Math.cos(Math.toRadians(C));
		
		BigDecimal S = new BigDecimal(a*b*sin/2);
		BigDecimal L = new BigDecimal(a+b+Math.sqrt(a*a+b*b-2*a*b*cos));
		BigDecimal x = new BigDecimal("2");
		BigDecimal ax = new BigDecimal(a);		
		BigDecimal h = S.multiply(x).divide(ax, 5, BigDecimal.ROUND_HALF_UP);;

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}

}