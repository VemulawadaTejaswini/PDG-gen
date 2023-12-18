import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long a[] = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		long[] sum = new long[N + 1];
		Arrays.fill(sum, 0);
		for (int i = 1; i < sum.length; i++) {
			sum[i] = a[i - 1] + sum[i - 1];
		}

		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for (int i = 0; i < sum.length; i++) map.put(sum[i], 0L);
		for (int i = 0; i < sum.length; i++) {
			map.put(sum[i], map.get(sum[i])+1);
		}

		long res = 0;
		for (Map.Entry<Long, Long> entry : map.entrySet()) {
			long num = entry.getValue();
			res += num * (num - 1) / 2;
		}

		System.out.println(res);
	}

}