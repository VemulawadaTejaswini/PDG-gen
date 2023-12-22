import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int answer[] = new int[n];

		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int calc = Math.min(Math.abs(x - i) + Math.abs(y - j) + 1, j - i);
				answer[calc]++;
			}
		}

		for (int i = 1; i < n; i++) {
			System.out.println(answer[i]);
		}
		sc.close();

	}
}