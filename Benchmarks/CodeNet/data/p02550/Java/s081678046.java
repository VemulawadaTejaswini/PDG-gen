import java.util.ArrayList;
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
		ArrayList<Long> before = new ArrayList<Long>(0);
		for (int i = 0; i < N; i++) {
			sum = sum + X;
			before.add(X);
			X = (X * X) % M;
			if (before.contains(X)) {
				int start = before.indexOf(X);
				List<Long> sub = before.subList(start, i + 1);
				long sum2 = 0;
				for (Long l : sub) {
					sum2 += l;
				}
				sum = sum + ((N - i) / ((i + 1) - start)) * sum2;
				amari = (N - i) % ((i + 1) - start);
				X = sub.get(0);
				break;
			}
		}
		for (int i = 0; i < amari - 1; i++) {
			sum = sum + X;
			X = (X * X) % M;
		}
		System.out.print(sum);
	}

}
