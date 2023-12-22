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
		long ans = a[n-1];
		int lim = n-2;
		int now = n-2;
		while(lim>0) {
			if(lim-2>=0) {
				ans+=(a[now]*2);
				lim-=2;
				now--;
			}
			else {
				ans+=a[now];
				lim--;
				now--;
			}
		}
		System.out.println(ans);
	}
}