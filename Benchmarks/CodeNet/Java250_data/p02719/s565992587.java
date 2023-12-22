import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		if(n>k&&k!=1) {
			long mod = n%k;
			long ans = Math.min(mod, Math.abs(k-mod));
			System.out.println(ans);
		}
		else if(n<k&&k!=1) {
			System.out.println(Math.min(n,k-n));
		}
		else {
			System.out.println(0);
		}
		
	}
}