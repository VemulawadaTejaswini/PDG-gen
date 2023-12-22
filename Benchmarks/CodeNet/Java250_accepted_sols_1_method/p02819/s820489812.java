import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int prime[] = new int[100004];
		Arrays.fill(prime, 1);

		for (int i = 2; i <= 100003; i++) {
			int tmp = i;
			int next = i * 2;
			int j = 3;
			while (next <= 100003) {
				prime[next] = 0;
				next = tmp * j;
				j++;
			}
		}

		for (int i = X; i <= 100003; i++) {
			if (prime[i] == 1) {
				System.out.println(i);
				break;
			}
		}
	}
}