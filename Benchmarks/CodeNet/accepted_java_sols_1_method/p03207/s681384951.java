import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int price[] = new int[N];
		int total = 0;
		for (int i = 0; i < N; i++) {
			int p = sc.nextInt();
			price[i] = p;
		}

		Arrays.sort(price);

		for (int i = 0; i < N - 1; i++) {
			total += price[i];
		}

		total += price[N - 1] / 2;

		System.out.println(total);
	}
}
