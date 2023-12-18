import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long mod = 1000000007;
		long[] ans = new long[n];
		if(n>3) {
			ans[2]=1;
			ans[3]=1;
			for(int i = 4; i < n; i++) {
				ans[i]=ans[i-3]%mod+ans[i-1]%mod;
			}
			System.out.println(ans[n-1]%mod);
		}
		else if(n==3||n==2)System.out.println(1);
		else System.out.println(0);
	}
}