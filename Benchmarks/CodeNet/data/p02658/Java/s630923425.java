import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final long MAX = (long)1e18;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger bi = BigInteger.ONE;
		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		Arrays.sort(array);
		if (array[0] <= 0) {
			System.out.println(0);
		} else {
			long res = 1l;
			double rate = MAX;
			boolean flag = false;
			for (int i = n - 1; i >= 0; --i) {
				if (array[i] >= rate * 1.5) {
					flag = true;
				}
				res *= array[i];
				rate = MAX / res;
				if (res < 0 || res > MAX) {
					System.out.println(-1);
					return;
				}
			}
			
			if (res >= 0 && res <= MAX && !flag) {
				System.out.println(res);
			} else {
				System.out.println(-1);
			}
		}
	}
}
