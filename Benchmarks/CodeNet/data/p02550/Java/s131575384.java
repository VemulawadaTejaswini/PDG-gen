import java.util.ArrayList;
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
		ArrayList<Long> before = new ArrayList<Long>(500);
		for (int i = 0; i < N; i++) {
			if (before.contains(X)) {
				int start = before.indexOf(X);
				Object[] sub = before.subList(start, i).toArray();
				long sum2 = 0;
				for (Object l : sub) {
					sum2 += (long)l;
				}
				sum = sum + ((N - i) / (i - start)) * sum2;
				amari = (N - i) % (i - start);
				X = (long) sub[0];
				break;
			}
			sum = sum + X;
			before.add(X);
			X = (X * X) % M;
		}
		for (int i = 0; i < amari; i++) {
			sum = sum + X;
			X = (X * X) % M;
		}
		System.out.print(sum);
	}

}
