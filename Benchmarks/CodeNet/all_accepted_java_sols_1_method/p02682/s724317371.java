import java.util.*;
import java.math.*;
public class Main {
	static int[] color;
	static int[] component;
	static int component_count;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long k = in.nextLong();
		long ans = a;
		long altans = 0L;
		if(a >= k) {
			ans = k;
		}else if(ans + b < k) {
			altans = ans + b;
			ans -= Math.abs(altans - k);
		}	
		System.out.println(ans);
	}
} 
