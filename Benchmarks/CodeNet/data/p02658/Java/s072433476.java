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
		long ans = 1;
		long max = 1;
		for(int i = 0; i < 18; i++) {
			max*=10;
		}
		for(int i = 0; i < n; i++) {
				ans*=a[i];
		}
		if(ans>max) {
			ans = -1;
		}
		System.out.println(ans);
	 }
}
