import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i]= sc.nextLong();
		}
		Arrays.sort(a);
		long max = 1;
		for(int i = 0; i < 18; i++) {
			max*=10;
		}
		BigDecimal max1 = BigDecimal.valueOf(max);
		BigDecimal ans = BigDecimal.valueOf(1);
		
		for(int i = 0; i < n; i++) {
			BigDecimal a1 = BigDecimal.valueOf(a[i]);
			ans = ans.multiply(a1);
			if(ans.compareTo(max1)>0) {
				ans = BigDecimal.valueOf(-1);
				break;
			}
		}
		if(ans.compareTo(max1)>0) {
			ans = BigDecimal.valueOf(-1);
		}
		System.out.println(ans);
	 }
}
