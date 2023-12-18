import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
public class Main {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = n;
		long div;
		long ans = 0;
		for(int i = 2; i*i < n; i++) {
			div = i;
			if(m%div==0&&m!=0) {
				long now = div;
				while(m%div==0&&div<=m) {
					m/=now;
					//System.out.println(m);
					ans++;
					now*=div;
				}
			}
			else if(m==0) {
				ans--;
				break;
			}
			else continue;
		}
		if(ans == 0) ans++;
		System.out.println(ans);
	}
}