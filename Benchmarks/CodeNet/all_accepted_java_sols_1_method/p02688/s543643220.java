import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, K;

		N = sc.nextInt();
		K = sc.nextInt();
		int[] d = new int[K];

		int[][] A = new int[K][K];
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < K; i++) {
			d[i] = sc.nextInt();
			for (int j = 0; j < d[i]; j++) {
				set.add(sc.nextInt());

			}
		}

		int w = N - set.size();
		System.out.println(w);

	}
}
