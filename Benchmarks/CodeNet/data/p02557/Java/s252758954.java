import java.util.Scanner;

public class Main {
	static int N;
	static int[] A;
	static int[] B;
	static int[] countArrA;
	static int[] countArrB;

	// Shojin
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			N = sc.nextInt();
			B = new int[N];
			int max = 0;
			countArrA = new int[N + 1];
			countArrB = new int[N + 1];
			for (int i = 0; i < N; i++) {
				int next = sc.nextInt();
				max = Math.max(max, next);
				countArrA[next]++;
			}
			for (int i = 0; i < N; i++) {
				int next = sc.nextInt();
				B[i] = next;
				max = Math.max(max, next);
				countArrB[next]++;
			}
			for (int i = 1; i <= max; i++) {
				if (countArrA[i] + countArrB[i] > N) {
					System.out.println("No");
					return;
				}
			}
			for (int i = 1; i <= max; i++) {
				countArrA[i] += countArrA[i - 1];
				countArrB[i] += countArrB[i - 1];
			}
			int move = 0;
			for (int i = 1; i <= max; i++) {
				move = Math.max(countArrA[i] - countArrB[i - 1], move);
			}
			System.out.println("Yes");
			for (int i = 0; i < N; i++) {
				int idx = (i + move) % N;
				System.out.print(B[idx]);
				System.out.print(' ');
			}
		}
	}
}