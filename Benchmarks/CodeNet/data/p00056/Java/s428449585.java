import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;
		int[] table = new int[50001];
		table[0] = 0;
		table[1] = 0;
		for (int i = 2; i <= 50000; i++) {
			table[i] = 1;
		}
		for (int i = 2; i <= Math.sqrt(50000) + 1; i++)
			if (table[i] == 1)
				for (int j = i * 2; j <= 50000; j += i)
					table[j] = 0;
		while (true) {
			int n = sc.nextInt();
			answer = 0;
			if (n == 0)
				break;
			if (n >= 4) {
				for (int i = 2; i <= n / 2; i++)
					if (table[i] == 1 && table[n - i] == 1)
						answer++;
			}
			System.out.println(answer);
		}
		sc.close();
	}
}