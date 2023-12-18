import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TLE
		try (Scanner sc = new Scanner(System.in)) {
			long N = sc.nextLong();
			int X = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[M + 1];
			arr[1] = X;
			int[] isVisited = new int[M + 1];
			isVisited[X] = 1;
			int stopAt = 0;
			int roopStart = 0;
			for (int i = 2; i <= N; i++) {
				long nextlong = (long) arr[i - 1] * (long) arr[i - 1] % M;
				int next = (int) nextlong;
				if (isVisited[next] != 0) {
					stopAt = i - 1;
					roopStart = isVisited[next];
					break;
				} else {
					isVisited[next] = i;
					arr[i] = next;
				}
			}
			long ans = 0;
			if (stopAt == 0) {
				for (int i = 1; i <= N; i++) {
					ans += arr[i];
				}
			} else {
				long last = (N - (roopStart - 1)) % (stopAt - roopStart + 1);
				long roopCnt = (N - (roopStart - 1)) / (stopAt - roopStart + 1);
				for (int i = 1; i < roopStart; i++) {
					ans += arr[i];
				}
				for (int i = roopStart; i < roopStart + last; i++) {
					ans += arr[i];
				}
				long oneLoop = 0;
				for (int i = roopStart; i <= stopAt; i++) {
					oneLoop += arr[i];
				}
				ans += roopCnt * oneLoop;
			}
			System.out.println(ans);
		}
	}
}