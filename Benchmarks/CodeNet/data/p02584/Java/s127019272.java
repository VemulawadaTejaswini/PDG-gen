import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		long x = Math.abs(sc.nextLong());
		long k = sc.nextLong();
		long d = sc.nextLong();
		if(x==d&&k%2==0)System.out.println(x);
		else if(x==d&&k%2==1)System.out.println(0);
		else if(d==1) {
			if(k-x>0&&(k-x)%2==1)System.out.println(1);
			else if (k-x>0&&(k-x)%2==0)System.out.println(0);
			else if(k-x<=0)System.out.println(x-k);
		}
		else if(k*d>x&&d>x) {
			if((Math.abs(d/x-k)%2)==0)System.out.println(d%x);
			else System.out.println(Math.abs(d%x-d));
		}
		else if(k*d>x&&d<x) {
			if((Math.abs(x/d-k)%2)==0)System.out.println(x%d);
			else System.out.println(Math.abs(x%d-d));
		}
		else if(k*d<x) System.out.println(x-k*d);
		else if(k*d==x) System.out.println(0);
		}
}