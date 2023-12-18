import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		long A = s.nextLong();
		double B = s.nextDouble();
		
		BigDecimal ret = BigDecimal.valueOf(B).multiply(BigDecimal.valueOf(A));
		
		System.out.println(ret.setScale(0, BigDecimal.ROUND_DOWN));
    }
}