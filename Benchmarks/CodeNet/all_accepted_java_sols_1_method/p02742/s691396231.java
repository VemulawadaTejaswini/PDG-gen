import java.util.*;
import java.math.*;
public class Main {
	static int r; 
	static int c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long r = in.nextLong();
		long c = in.nextLong();
		long ans = 0L;
		if(c % 2 == 0) {
			ans += (c / 2) * r;
		}else {
			long cc = c / 2;
			if(r % 2 == 0) {
				ans += (cc) * (r / 2);
				ans += (cc + 1) * (r / 2);
			}else {
				long rr = r / 2;
				ans += cc * rr;
				ans += (cc + 1) * (rr + 1);
			}
		}
		if(r == 1 || c == 1) {
			System.out.println(1);
		}else {
			System.out.println(ans);
		}
	}
} 
