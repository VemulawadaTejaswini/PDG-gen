import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		double b_int = Math.floor(b);
		double b_double = b-b_int;
		BigDecimal ans = new BigDecimal(a);
		BigDecimal b_int1 = new BigDecimal(b_int);
		BigDecimal b_double1 = new BigDecimal(b_double);
		ans = ans.multiply(b_int1);
		BigDecimal a_floor = new BigDecimal(a);
		a_floor = a_floor.multiply(b_double1);
		a_floor = a_floor.setScale(0, BigDecimal.ROUND_DOWN);
		ans = ans.add(a_floor);
		System.out.println(ans);
	 }
}