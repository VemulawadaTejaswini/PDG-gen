import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] C = sc.next().toCharArray();
		int N = C.length;
		sc.close();

		Deque<Character> deque = new ArrayDeque<>();

		int[] score = new int[N];

		// for R
		for (int i = 0; i < N; i++) {
			if (C[i] == 'R') {
				deque.push('R');
			} else {
				int cnt = 0;
				while (!deque.isEmpty()) {
					if (cnt % 2 == 0) {
						score[i - 1]++;
					} else {
						score[i]++;
					}
					cnt++;
					deque.pop();
				}
			}
		}

		// for L
		for (int i = N - 1; i >= 0; i--) {
			if (C[i] == 'L') {
				deque.push('L');
			} else {
				int cnt = 0;
				while (!deque.isEmpty()) {
					if (cnt % 2 == 0) {
						score[i + 1]++;
					} else {
						score[i]++;
					}
					cnt++;
					deque.pop();
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(score[i] + " ");
		}
	}
}
