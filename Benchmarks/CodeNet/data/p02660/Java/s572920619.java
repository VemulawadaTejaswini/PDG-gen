import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
public class Main {
	
	
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        
		long n = sc.nextLong();
		//long m = n;
		long ans = 0;
		long p = 2;
		long c = 1;
		long div;
		
		while(true) {
			div = (long)Math.pow(p, c);
			if(n%div == 0) {
				ans++;
				n /= div;
				c++;
				//System.out.println(n+" "+div);
				continue;
			}
			//System.out.println("Debug"+p);
			while(n%p == 0) {
				n/=p;
				//System.out.println("割った");
				//System.out.println(n);
			}
			
			p++;
			c = 1;
			
			if(p*p>n) {
				break;
			}
		}
		
		if(n!=1) {
			ans++;
		}
		
	    System.out.println(ans);
	}
}