import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
public class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		BigDecimal a=sc.nextBigDecimal();
		BigDecimal b=sc.nextBigDecimal();
		BigDecimal c=a.multiply(b);
		c=c.setScale(0, RoundingMode.HALF_UP);
		System.out.print(c);
	}
}