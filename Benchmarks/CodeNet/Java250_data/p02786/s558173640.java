import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long h = in.nextLong();
		long cur = 1;
		long ans = 0;
		while(h > 0) {
			ans += cur;
			h = (long) Math.floor(h / 2);
			cur *= 2;
		}
		System.out.println(ans);
	}
} 