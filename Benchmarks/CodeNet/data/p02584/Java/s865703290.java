import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		if(x==d)System.out.println(x);
		else if(k*d>x&&d>x) System.out.println(d%x);
		else if(k*d>x&&d<x) System.out.println(x%d);
		else if(k*d<x) System.out.println(x-k*d);
		else if(k*d<x) System.out.println(0);
		}
}