import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int R[] = new int[N];
			int sum = 0;
			for (int i = 0; i < N; i++) {
				int temp = sc.nextInt();
				R[i] = temp;
				sum += temp;
			}
			int av = sum / N;
			long ans = 0;
			long ano = 0;
			for (int i = 0; i < N; i++) {
				ans += (R[i] - av) * (R[i] - av);
				ano += (R[i] - av - 1) * (R[i] - av - 1);
			}
			System.out.print(Math.min(ano, ans));
		}
	}
}