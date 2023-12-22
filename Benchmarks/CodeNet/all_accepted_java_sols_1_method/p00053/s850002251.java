import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int prime[];
		int n;
		int sum;
		int count;

		prime = new int[1300000];
		for (int i = 2; i * i <= 1300000; i++) {
			for (int j = 2; 0 <= i * j && i * j < 1300000; j++) {
				prime[i * j] = 1;
			}
		}
		n = sc.nextInt();
		while (n != 0) {
			sum = 0;
			count = 0;
			for (int i = 2; count < n; i++) {
				if (prime[i] == 0) {
					sum += i;
					count++;
				}
			}
			System.out.println(sum);
			n = sc.nextInt();
		}
	}
}