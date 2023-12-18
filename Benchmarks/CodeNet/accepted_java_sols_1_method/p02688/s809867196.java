import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int s[] = new int[N];

		for (int i = 0; i < K; i++) {
			int d = scan.nextInt();
			for (int y = 0; y < d; y++) {
				int A = scan.nextInt();
				s[A - 1]++;
			}
		}

		int answer = 0;
		for (int i = 0; i < N; i++) {
			if (s[i] == 0) {
				answer += 1;
			}
		}
		System.out.println(answer);
	}
}