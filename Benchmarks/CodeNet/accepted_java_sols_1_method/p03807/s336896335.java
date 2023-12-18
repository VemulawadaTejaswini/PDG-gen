import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] kokuban = new int[N];
		int counter = 0;

		for (int i = 0; i < N; i++) {
			kokuban[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (kokuban[i] % 2 == 1) {
				counter++;
			}
		}
		if (counter % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
