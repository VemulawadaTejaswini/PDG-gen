import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C[] = new int[N];
		int S[] = new int[N];
		int F[] = new int[N];

		for (int i = 0; i < N-1; i++) {
			C[i] = sc.nextInt();
			S[i] = sc.nextInt();
			F[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int time =0;
			for (int j = i; j < N-1; j++) {
				if (time < S[j]) {
					time = S[j];
				} else if (time % F[j]==0) {
				} else {
					time = time + F[j] - time%F[j];
				}
				time += C[j];
			}
			System.out.println(time);
		}
	}
}
