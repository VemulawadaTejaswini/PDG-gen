import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		for (int i = 0; i < N; i++) {
			A[i + 1] = sc.nextInt();
		}
		sc.close();

		// 逆順に見ていく
		for (int i = N; i >= 1; i--) {
			int sum = A[i];
			for (int j = i * 2; j <= N; j += i) {
				sum += A[j];
			}
			if (sum % 2 != A[i]) {
				if (A[i] == 0) {
					A[i] = 1;
				} else {
					A[i] = 0;
				}
			}
		}

		int ans = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			if (A[i] == 1) {
				ans++;
				list.add(i);
			}
		}

		System.out.println(ans);
		for (int cnt : list) {
			System.out.print(cnt + " ");
		}
	}
}
