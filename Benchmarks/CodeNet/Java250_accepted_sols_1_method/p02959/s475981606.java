import java.util.Scanner;

//AtCoder Beginner Contest 135
//C	City Savers
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt((sc.next()));
		long[] aArr = new long[N + 1];
		for (int i = 0; i <= N; i++) {
			aArr[i] = Long.parseLong(sc.next());
		}
		long[] bArr = new long[N];
		for (int i = 0; i < N; i++) {
			bArr[i] = Long.parseLong(sc.next());
		}
		sc.close();

		long ans = 0;
		for (int i = N - 1; i >= 0; i--) {
			long beated = Math.min(aArr[i + 1], bArr[i]);
			ans += beated;
			aArr[i + 1] -= beated;
			bArr[i] -= beated;
			beated = Math.min(aArr[i], bArr[i]);
			ans += beated;
			aArr[i] -= beated;
		}
		System.out.println(ans);
	}
}
