import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c[] = { 1, 10, 100, 1000, 10000 };
		int total = 0;
		int k;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			k = i;
			for (int j = 0; j < 5; j++) {
				sum += k % 10;
				k = k / 10;
			}
			if (sum >= a && sum <= b) {
				total += i;
			}
		}
		System.out.println(total);
	}
}
