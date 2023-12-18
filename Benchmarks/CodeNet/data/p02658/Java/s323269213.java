import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final long MAX = (long)1e18;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long res = 1l;
		int n = sc.nextInt();
		// BigInteger bi = BigInteger.ONE;
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		Arrays.sort(array);
		if (array[0] <= 0) {
			System.out.println(0);
		} else {
			for (int i = n - 1; i >= 0; --i) {
				res *= array[i];
				if (res > MAX || res < 0) {
					System.out.println(-1);
					return;
				}
			}
			
			System.out.println(res);
		}
	}
}
