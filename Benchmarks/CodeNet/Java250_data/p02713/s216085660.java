import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		long ans = 0;
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= k; j++) {
				for(int l = 1; l <= k; l++) {
					ans += gcd(gcd(i, j), l);
				}
			}
		}
		System.out.println(ans);
	}
	public static int gcd(int a, int b) {
		int na = Math.max(a, b);
		int nb = Math.min(a, b);
		if(na % nb != 0) {
			return gcd(nb, na % nb);
		}else return nb;
	}
} 
