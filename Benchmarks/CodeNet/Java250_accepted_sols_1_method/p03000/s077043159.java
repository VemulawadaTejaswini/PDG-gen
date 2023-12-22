import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] L = new int[N];
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		sc.close();

		int cnt = 0; // 1回目は必ず含む
		int x = 0;
		while (true) {
			if (cnt >= N) {
				break;
			}

			if (x + L[cnt] <= X) {
				x = x + L[cnt];
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(cnt + 1);
	}
}
