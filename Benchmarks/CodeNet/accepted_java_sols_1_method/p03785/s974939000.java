import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		int[] T = new int[N];
		for (int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(T);
		int bus = 0;
		int last = -1;
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			cnt++;
			if (last == -1) {
				last = T[i];
			} else {
				if (last + K < T[i]) {
					bus++;
					cnt = 1;
					last = T[i];
				}
			}
			if (cnt >= C) {
				bus++;
				cnt = 0;
				last = -1;
			}
		}
		if (cnt > 0) {
			bus++;
		}
		System.out.println(bus);
	}
}
