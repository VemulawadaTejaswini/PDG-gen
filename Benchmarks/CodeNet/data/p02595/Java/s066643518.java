import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d = sc.nextLong();
		d *= d;
		int ans = 0;
		for(int i = 0; i < n; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			if(d>=x*x+y*y) ans++;
		}
		System.out.println(ans);
    }
}