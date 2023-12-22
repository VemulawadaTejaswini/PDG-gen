import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int l = n.length();
		int count = 0; 
		for(int i = 0; i<l; i++) {
			count+=Character.getNumericValue(n.charAt(i));
		}
		if(count%9==0)System.out.println("Yes");
		else System.out.println("No");
		
		}
}