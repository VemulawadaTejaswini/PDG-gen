import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N, M;

		String[] nm = scanner.nextLine().split(" ");
		N = Integer.parseInt(nm[0]);
		M = Integer.parseInt(nm[1]);
		String[] as = scanner.nextLine().split(" ");
		scanner.close();

		PriorityQueue<Long> queue = new PriorityQueue<Long>(Comparator.reverseOrder());

		for (int i = 0; i < N; i++) {
			queue.add(Long.parseLong(as[i]));
		}

		for (int i = 0; i < M; i++) {
			long l = queue.remove();
			l /= 2;
			queue.add(l);
		}

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += queue.remove();
		}

		System.out.println(ans);
	}
}