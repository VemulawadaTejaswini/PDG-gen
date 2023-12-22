import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextLong() - (i + 1);
		}
		Arrays.sort(a);
		long sum = 0;
		for(long num : a) {
			sum += Math.abs(num - a[n/2]);
		}
		System.out.println(sum);
	}
}