import java.util.*;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      long A=sc.nextLong();
      double B=sc.nextDouble();
      BigDecimal a=BigDecimal.valueOf(A);
      BigDecimal b=BigDecimal.valueOf(B);
      BigDecimal c=a.multiply(b);
      BigDecimal x=c.setScale(0,BigDecimal.ROUND_DOWN);
      System.out.println(x);
	}
}