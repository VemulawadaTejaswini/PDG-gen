
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		PriorityQueue<Long> A = new PriorityQueue<Long>(Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			A.add(sc.nextLong());
		}

		Long tmp = (long)0;
		for (int i = 0; i < M; i++) {
			tmp = A.poll();
			A.add(tmp / 2);
		}

		Long result = (long)0;
		for (int i = 0; i < N; i++) {
			result += A.poll();
		}
		System.out.println(result);

	}
}
