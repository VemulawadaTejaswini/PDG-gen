import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P[] = new int[N];

		int min = Integer.MAX_VALUE;
		int answer = 0;
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
			if (P[i] <= min) answer++;
			if (P[i] < min) min = P[i];
		}

		System.out.println(answer);
	}
}