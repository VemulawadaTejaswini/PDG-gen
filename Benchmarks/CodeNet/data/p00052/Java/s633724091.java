import java.math.BigInteger;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0052
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (true) {
			long l = sc.nextLong();
			if (l == 0) break;
			
			int ans = 0;
			while (l > 0) {
				ans += l / 5;
				l /= 5;
			}
			System.out.println(ans);
		}
	}
}