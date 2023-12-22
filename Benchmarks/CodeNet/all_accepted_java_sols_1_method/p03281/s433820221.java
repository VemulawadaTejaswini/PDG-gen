import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;

		for (int i = 1; i <= n; i = i + 2) {
			int count = 0;
			for (int j = 1; j <= n / 2; j = j + 2) {
				if (i % j == 0)
					count++;
			}
			if (count + 1 == 8) {
				answer++;
			}
		}

		System.out.println(answer);
		sc.close();
	}
}