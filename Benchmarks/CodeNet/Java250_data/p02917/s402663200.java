import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B[] = new int[N];
		int answer = 0;

		for (int i = 0; i < N - 1; i++) {
			B[i] = sc.nextInt();
			if (i != 0) {
				if (B[i] < B[i - 1]) {
					answer += B[i];
				} else {
					answer += B[i - 1];
				}
			}
		}

		answer = answer + B[0] + B[B.length - 2];
		System.out.println(answer);
	}
}
