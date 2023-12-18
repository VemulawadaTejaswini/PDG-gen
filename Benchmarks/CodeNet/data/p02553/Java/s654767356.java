import java.math.BigDecimal;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
 
		// 整数の入力
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		BigDecimal c = sc.nextBigDecimal();
		BigDecimal d = sc.nextBigDecimal();
		
		BigDecimal e = a.multiply(c);
 
		if (e.compareTo(a.multiply(d)) < 0) {
			e = a.multiply(d);
		}
		if (e.compareTo(b.multiply(c)) < 0) {
			e = b.multiply(c);
		}
		if (e.compareTo(b.multiply(d)) < 0) {
			e = b.multiply(d);
		}
      System.out.println(e);
	}
}