import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] L = new long[N];
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextLong();
		}
		sc.close();

		Arrays.sort(L);

		int cnt = 0;
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					if (L[i] != L[j] && L[j] != L[k] && L[k] != L[i] && L[i] + L[j] > L[k]) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
