import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		for(int a = 2; a < n-1; a++) {
			int b = 1;
			while(a*b<n&&b<a) {
				ans++;
				b++;
			}
		}
		
		ans*=2;
		for(int a = 1; a <= n-1; a++) {
			if(a*a<n)ans++;
			else break;
		}
		if(n!=2) System.out.println(ans+2);
		else System.out.println(1);
	}
}