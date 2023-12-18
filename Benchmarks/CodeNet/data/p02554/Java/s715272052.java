import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long n = in.nextInt();
		// not exists 0
		long x = cal(9, n);
		// not exists both 0 and 9
		long y = cal(8, n);
		// all case
		long z = cal(10, n);
		// all case - not exist 0 - not exist 9 + not exists both
		long ans = (2000000014 + z - x - x + y) % 1000000007L;
		System.out.println(ans);
	}

	private static long cal(long a, long n) {
		long ans = a;
		for (; n > 1; n--) {
			ans = (ans * a) % 1000000007L;
		}
		return ans;
	}

}
