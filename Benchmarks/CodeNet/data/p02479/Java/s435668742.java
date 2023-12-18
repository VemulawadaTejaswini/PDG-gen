import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigDecimal r = sc.nextBigDecimal();
		System.out.println(r.multiply(r).multiply(new BigDecimal(Math.PI))+" "+r.multiply(new BigDecimal(2).multiply(new BigDecimal(Math.PI))));
	}
}