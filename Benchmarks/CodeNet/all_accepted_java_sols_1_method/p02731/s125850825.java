import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static java.lang.System.*;
import java.util.*;
import java.math.BigInteger;
import static java.lang.System.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d= sc.nextDouble();
		BigDecimal L = new BigDecimal(String.valueOf(d));
		BigDecimal three = new BigDecimal("3.0");
		
		BigDecimal num = L.divide(three,10,RoundingMode.HALF_UP);
		BigDecimal ans = num.multiply(num);
		ans = ans.multiply(num);
		
		out.println(ans);
		
	}
}