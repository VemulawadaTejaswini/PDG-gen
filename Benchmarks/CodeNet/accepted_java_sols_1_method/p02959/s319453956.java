import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N + 1];
		Arrays.setAll(A, i -> sc.nextInt());
		int[] B = new int[N];
		Arrays.setAll(B, i -> sc.nextInt());
		sc.close();

		long ans = 0;
		for (int i = N - 1; i >= 0; i--) {
			// i番目のヒーローが倒した敵の数
			int buster = Math.min(B[i], A[i + 1] + A[i]);
			// i番目のヒーローがあと倒せる数
			int restPower = Math.max(0, B[i] - A[i + 1]);
			// A[i]番目で倒されなかったモンスターの数
			int restMonster = Math.max(0, A[i] - restPower);

			ans += buster;
			A[i] = restMonster;
		}
		System.out.println(ans);
	}
}
