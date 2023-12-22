import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();

		int h[] = new int[N];
		int max[] = new int[N];

		for(int i = 0; i < N; i++) {
			h[i] = scan.nextInt();
			max[i] = 0;
		}

		int ans = 0;

		for(int i = 0; i < M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			max[a - 1] = Math.max(max[a - 1], h[b - 1]);
			max[b - 1] = Math.max(max[b - 1], h[a - 1]);
		}

		for(int i = 0; i < N; i++) {
			if(h[i] > max[i]) {
				ans++;
			}
		}

		System.out.println(ans);

	}

}