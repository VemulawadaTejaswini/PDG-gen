import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b= sc.next();
		String s = a+b;
		int val = Integer.parseInt(s);
		if((int)Math.sqrt(val)*(int)Math.sqrt(val)==val) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	 }
}