import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		long n = sc.nextLong(), k = sc.nextLong(), b, sum = 0;
		long[] bucket = new long[100001];
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextLong();
			bucket[a] += b;
		}

		for (int i = 1; i <= 100000; i++) {
			sum += bucket[i];
			if (sum >= k) {
				System.out.println(i);
				return;
			}
		}
	}

}
