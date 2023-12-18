import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] lines = scanner.nextLine().split(" ");
		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);

		ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		int answer = 0;

		for (int i = 0; i < M; i++) {
			ArrayList<Integer> array = new ArrayList<Integer>();
			arrays.add(array);
		}

		for (int i = 0; i < N; i++) {
			String[] line = scanner.nextLine().split(" ");
			int A = Integer.parseInt(line[0]);
			int B = Integer.parseInt(line[1]);
			if (A > M)
				continue;
			arrays.get(M - A).add(B);
		}

		for (int i = M - 1; i >= 0; --i) {
			for (int j : arrays.get(i)) {
				pq.add(j);
			}
			if (!pq.isEmpty()) {
				answer += pq.poll();
			}
		}

		System.out.println(answer);

	}
}