import java.util.*;
import java.math.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		while(true) {
			int N = sc.nextLong();
			if(N == 0) break;

			BigInteger bi = new BigInteger("1");
			for(int i = 2; i <= N; i++) {
				bi = bi.multiply(new BigInteger(Integer.toString(i)));
			}

			int ans = 0;
			String to_s = bi.toString();
			for(int i = to_s.length() - 1; i >= 0; i--) {
				if(to_s.charAt(i) == '0') ans++;
				else break;
			}
			System.out.println(ans);
		}
	}
}