import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n=n%1000;
		if(n>0) {
			n=1000-n;
		}
		System.out.println(n);
	}
}