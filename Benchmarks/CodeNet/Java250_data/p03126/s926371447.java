import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int M = reader.nextInt();
		int[] arr = new int[M];
		for (int i = 0; i < N; i++) {
			int K = reader.nextInt();
			for (int j = 0; j < K; j++) {
				int num = reader.nextInt();
				arr[num - 1]++;
			}
		}
		reader.close();
		int ans = 0;
		for (int i = 0; i < M; i++) {
			if (arr[i] == N) {
				ans++;
			}
		}
		System.out.print(ans);
	}
}

