import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		int b_int = (int)Math.floor(b);
		double b_double = b-b_int;
		long ans = b_int*a;
		long ans_floor = (long)Math.floor(b_double*a);
		ans += ans_floor;
		System.out.println(ans);
	 }
}