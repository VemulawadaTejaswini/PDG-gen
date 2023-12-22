import java.util.*;
import java.math.*;
import java.text.*;

public class Main{

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
		BigDecimal l = new BigDecimal(sc.nextLine());
		BigDecimal three = new BigDecimal("3");
		//DecimalFormat df = new decimalFormat("0.000000000000"):
		BigDecimal res = l.divide(three, 12, RoundingMode.HALF_UP).pow(3);
		
		System.out.println(res);
    }
	
	public static boolean isKai(String s){
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}


