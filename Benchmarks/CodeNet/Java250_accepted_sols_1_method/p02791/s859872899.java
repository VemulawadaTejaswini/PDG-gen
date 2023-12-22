import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		sc.close();

		int min = 1_000_000_000;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			min = Math.min(P[i], min);
			if (min >= P[i]) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}
