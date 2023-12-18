import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();
		long absx = Math.abs(x);
		if (absx / d >= k) {
			System.out.println(absx - k * d);
		} else {
			long r = k - absx / d;
			long start = absx % d;
			if (r % 2 == 0) {
				System.out.println(start);
			} else {
				long ans = Math.min(Math.abs(start + d), Math.abs(start - d));
				System.out.println(ans);
			}
		}
	}
}
 
 
 
 
 
 
 
 
 
 
