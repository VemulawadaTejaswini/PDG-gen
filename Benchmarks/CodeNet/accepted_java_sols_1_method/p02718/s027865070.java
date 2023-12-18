
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int goods[] = new int[N];
		int popular = 0;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			goods[i] = scan.nextInt();
			sum = sum + goods[i];
		}

		for (int i = 0; i < N; i++) {
			if(goods[i] >= sum * ((double) 1 / (4 * M))) {
				popular++;
			}
		}

		if (popular >= M) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();
	}
}
