import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		long ans = 0;
		for(int i = n-1; i > 0; i--) {
			if(i+3>n-1) {
				ans+=a[i];
			}
			else {
				ans+=a[i+2];
			}
		}
		System.out.println(ans);
	}
}