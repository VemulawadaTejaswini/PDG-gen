import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BigInteger myBI = new BigInteger(sc.next());
		double a = sc.nextDouble();
		BigDecimal bd = new BigDecimal(myBI);
		BigInteger doubleWithStringValue = bd.multiply(BigDecimal.valueOf(a)).toBigInteger();
		long result=doubleWithStringValue.longValue();
		System.out.println(result);
	}
}
