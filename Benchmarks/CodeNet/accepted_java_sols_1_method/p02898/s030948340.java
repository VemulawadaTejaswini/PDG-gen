import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			h[i] = sc.nextInt();
			if (h[i] >= K) {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}
}
