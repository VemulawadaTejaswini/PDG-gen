import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long sum = 0;
		long sum1=0;
		long mod = 1000000007;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			sum=(sum+a[i])%(mod*2);
			sum1=(sum1+a[i]*a[i])%(mod*2);
		}
		long ans = ((sum*sum-sum1)/2)%mod;
		System.out.println(ans%mod);
	}
}