import java.util.Scanner;

public class Main {
	static final int N = 123456;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
		int[] table = new int[N * 2 + 1];
		table[0] = 0;
		table[1] = 0;
		for (int i = 2; i <= N*2; i++) {
			table[i] = 1;
		}
		for (int i = 2; i <= Math.sqrt(N*2) + 1; i++)
			if (table[i] == 1)
				for (int j = i * 2; j <= N*2; j += i)
					table[j] = 0;
		while (true) {
			int n = sc.nextInt();
			answer = 0;
			if (n == 0)
				break;
			for (int i = n + 1; i <= 2 * n; i++)
				if (table[i] == 1)
					answer++;
			System.out.println(answer);
		}
		sc.close();
	}
}