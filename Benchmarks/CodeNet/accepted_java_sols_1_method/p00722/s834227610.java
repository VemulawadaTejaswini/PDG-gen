import java.util.Scanner;

public class Main {
	static final int N = 1000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
		int[] table = new int[N + 1];
		table[0] = 0;
		table[1] = 0;
		for (int i = 2; i <= N; i++) {
			table[i] = 1;
		}
		for (int i = 2; i <= Math.sqrt(N) + 1; i++)
			if (table[i] == 1)
				for (int j = i * 2; j <= N; j += i)
					table[j] = 0;
		while (true) {
			int a = sc.nextInt();
			int d = sc.nextInt();
			int n = sc.nextInt();
			answer = 0;
			if (a == 0 && d == 0 && n == 0)
				break;
			for (int i = a; i < N; i += d) {
				if (n == 0) {
					answer = i - d;
					break;
				}
				if (table[i] == 1)
					n--;
			}
			System.out.println(answer);
		}
		sc.close();
	}
}