import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int Q = sc.nextInt();
			int[] day = new int[100];
			for (int i = 0; i < N; ++i) {
				int M = sc.nextInt();
				for (int j = 0; j < M; ++j) {
					day[sc.nextInt()]++;
				}
			}
			int max = 0;
			int ans = 0;
			for (int i = 0; i < 100; ++i) {
				if (day[i] > max) {
					max = day[i];
					ans = i;
				}
			}
			System.out.println(max < Q ? 0 : ans);
		}
	}

}