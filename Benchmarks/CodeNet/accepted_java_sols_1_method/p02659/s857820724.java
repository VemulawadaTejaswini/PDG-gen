import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String A=stdIn.next();
		String B=stdIn.next();
		BigDecimal a = new BigDecimal(A);
		BigDecimal b = new BigDecimal(B);
		System.out.println(a.multiply(b).setScale(0,java.math.RoundingMode.DOWN));
	}
}
