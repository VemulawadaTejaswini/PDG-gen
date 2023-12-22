import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		int[] sortedA = new int[N];
		int idx;
		for (idx = 0; idx < N; idx++) {
			A[idx] = Integer.parseInt(sc.next());
			sortedA[idx] = A[idx];
		}
//		Arrays.parallelSort(sortedA);
		Arrays.sort(sortedA);

		int max = sortedA[N - 1];
		int second = sortedA[N - 2];

		for (idx = 0; idx < N; idx++) {
			if (A[idx] == max) {
				System.out.println(second);
			} else {
				System.out.println(max);
			}
		}

	}

}
