import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int R = sc.nextInt();
		int S = sc.nextInt();
		int P = sc.nextInt();
		String T = sc.next();
		boolean chkStreak;
		long ans = 0;

		for (int i = 0; i < K; i++) {
			chkStreak = false;
			for (int j = i; j < N; j=j+K) {
				char hand = T.charAt(j);
				if (j > K - 1) {
					char pastHand = T.charAt(j - K);
					if (pastHand == hand) {
						chkStreak = !chkStreak;
					}else {
						chkStreak = false;
					}
				}

				if (chkStreak == false && hand == 'r') {
					ans += P;
				} else if (chkStreak == false && hand == 's') {
					ans += R;
				}else if (chkStreak == false && hand == 'p') {
					ans += S;
				}
			}
		}

		System.out.println(ans);

	}
}