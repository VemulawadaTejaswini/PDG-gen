import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long total = 0;
		long sub = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			total += a;
			arr[i] = a;
			if (i % 2 == 1) {
				sub += a;
			}
		}
		StringBuilder sb = new StringBuilder();
		long prev = total - 2 * sub;
		sb.append(prev);
		for (int i = 0; i < n - 1; i++) {
			prev = (arr[i] - prev / 2) * 2;
			sb.append(" ").append(prev);
		}
		System.out.println(sb);
	}
}
