import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextLong();
		long M = sc.nextLong();

		sc.close();

		long sum = 0;
		long amari = 0;
		Long[] before = new Long[100000000];
		for (int i = 0; i < N; i++) {
			List<Long> a = Arrays.asList(before);
			if (a.contains(X)) {
				int start = a.indexOf(X);
				List<Long> sub = a.subList(start, i);
				long sum2 = 0;
				for (Long l : sub) {
					sum2 += l;
				}
				sum = sum + ((N - i) / (i - start)) * sum2;
				amari = (N - i) % (i - start);
				X = sub.get(0);
				break;
			}
			sum = sum + X;
			before[i] = X;
			X = (X * X) % M;
		}
		for (int i = 0; i < amari; i++) {
			sum = sum + X;
			X = (X * X) % M;
		}
		System.out.print(sum);
	}

}
